/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classes.Produto;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import classes.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private Conexao conexao;
    private Connection conn;

    public ProdutoDAO() {
        conexao = new Conexao(); // cria a classe conexao
        conn = conexao.Conectar(); // pega o metodo de conexao
    }

    PreparedStatement stmt; // capaz de fazer consul SQL
    ResultSet rs; // retorna os dados do banco

    //Metodo para inserir produto no banco
    //Metodo para inserir produto no banco
    public int inserir(Produto p) {
        int status;
        int idGerado = -1;
        try {
            String sql = "INSERT INTO produto (nome,descricao,quantidade) VALUES (?,?,?)";
            stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getDescricao());
            stmt.setInt(3, p.getQuantidade());

            status = stmt.executeUpdate();

            if (status > 0) {
                rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    idGerado = rs.getInt(1); // pega o ID do produto recém-cadastrado
                }
            }

            return idGerado; // retorna o ID gerado
        } catch (SQLException ex) {
            System.out.println("Erro no INSERT PRODUTO: " + ex.getMessage());
            return -1;

        }

    }

    // Método SEM filtro (para listar tudo)
    public List<Object[]> buscarProdutosComFornecedor(String filtro) {
        List<Object[]> lista = new ArrayList<>();
        try {
            String sql = "SELECT p.id, p.nome, p.descricao, p.quantidade, f.nome AS fornecedor "
                    + "FROM produto p "
                    + "INNER JOIN fornecedor_produto fp ON p.id = fp.id_produto "
                    + "INNER JOIN fornecedor f ON f.id = fp.id_fornecedor "
                    + "WHERE p.nome LIKE ? OR f.nome LIKE ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + filtro + "%");
            stmt.setString(2, "%" + filtro + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] linha = new Object[5];
                linha[0] = rs.getInt("id");
                linha[1] = rs.getString("nome");
                linha[2] = rs.getString("descricao");
                linha[3] = rs.getInt("quantidade");
                linha[4] = rs.getString("fornecedor");
                lista.add(linha);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar produtos com fornecedores: " + ex.getMessage());
        }
        return lista;
        // Método COM filtro (para busca)

    }

    //Método para excluir Produto do banco
    public void excluir(int id) {
        try {
            String sql = "DELETE FROM produto WHERE id = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
            st.close();

            System.out.println("Produto excluído com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao excluir produto: " + e.getMessage());
        }
    }

    //Método para Prencher Lista ID e Nome do Produto
    public List<Produto> listaNomeID(String nome) {
        try {
            String sql = "SELECT id,nome FROM produto WHERE nome LIKE ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");

            List<Produto> lista = new ArrayList<>();

            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                lista.add(p);
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println("Erro ao Retornda dados de Produtos: " + ex.getMessage());
            return null;
        }
    }
}
