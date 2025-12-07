package dao;

import classes.Seguranca;
import static classes.Seguranca.gerarHash;
import classes.Usuario;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    
    private Conexao conexao;
    private Connection conn;
    private PreparedStatement st;
    private ResultSet rs;

    public UsuarioDAO() {
       conexao = new Conexao();
       conn = conexao.Conectar();
    }

    //Método para cadastrar novo usuario
    public boolean cadastrarUsuario(Usuario u, String senhaPura) {
        try {
            // Gerar salt
            String salt = Seguranca.gerarSalt();

            // Criar hash da senha
            String hash = Seguranca.gerarHash(senhaPura, salt);

            st = conn.prepareStatement("INSERT INTO usuario(login, senha_hash, salt, cargo) VALUES(?,?,?,?)");
            st.setString(1, u.getLogin());
            st.setString(2, hash);
            st.setString(3, salt);
            st.setString(4, u.getCargo());

            st.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar usuário: " + e.getMessage());
            return false;
        }
    }

    //Método de Login
    public Usuario login(String login, String senhaDigitada) {
        try {
            st = conn.prepareStatement("SELECT * FROM usuario WHERE login = ?");
            st.setString(1, login);
            rs = st.executeQuery();

            if (rs.next()) {
                String senhaHashBanco = rs.getString("senha_hash");
                String saltBanco = rs.getString("salt");

                // Recria o hash da senha digitada
                String hashDigitado = Seguranca.gerarHash(senhaDigitada, saltBanco);

                if (hashDigitado.equals(senhaHashBanco)) {
                    // Login OK → retorna o objeto Usuario
                    Usuario u = new Usuario();
                    u.setId(rs.getInt("id"));
                    u.setLogin(rs.getString("login"));
                    u.setSenhaHash(senhaHashBanco);
                    u.setSalt(saltBanco);
                    u.setCargo(rs.getString("cargo"));

                    return u;
                }
            }

        } catch (Exception e) {
            System.out.println("Erro ao fazer login: " + e.getMessage());
        }

        return null; // Login inválido
    }

    public Usuario buscarPorLogin(String login) {
        Usuario u = null;

        String sql = "SELECT * FROM usuario WHERE login = ?";

        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, login);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setLogin(rs.getString("login"));
                u.setSenhaHash(rs.getString("senha_hash"));
                u.setSalt(rs.getString("salt"));
                u.setCargo(rs.getString("cargo"));
            }

            rs.close();
            st.close();

        } catch (Exception e) {
            System.out.println("Erro buscarPorLogin: " + e.getMessage());
        }

        return u;
    }

    public boolean verificarSenha(Usuario usuario, String senhaDigitada) {
        try {
            String hashDigitado = Seguranca.gerarHash(senhaDigitada, usuario.getSalt());
            return hashDigitado.equals(usuario.getSenhaHash());
        } catch (Exception e) {
            System.out.println("Erro verificarSenha: " + e.getMessage());
            return false;
        }
    }
}
