package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import classes.Usuario;

public class LoginDAO {

    private Connection conn; // cria o objeto que faz a conexão
    private Conexao conexao; // pega o metodo getConexao,

    public LoginDAO() {
        this.conexao = new Conexao();
        this.conn = conexao.getConexao();
    }

    PreparedStatement stmt; // objeto capaz de fazer consultas SQL
    ResultSet rs; // objeto que retorna dados do banco (tabela)

    //Metodo para autenticar Login
    public boolean Autenticar(String login, String senha) {
        try {
            String sql = "SELECT * FROM usuario WHERE login = ? AND senha = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            System.out.println("Erro ao autenticar login: " + ex.getMessage());
            return false;
        }
    }
    
    
}
