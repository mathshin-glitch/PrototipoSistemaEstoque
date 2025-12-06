package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import conexao.Conexao;

public class Fornecedor_ProdutoDAO {

    private Conexao conexao;
    private Connection conn;

    public Fornecedor_ProdutoDAO() {
        this.conexao = new Conexao();
        this.conn = conexao.getConexao();
    }

    PreparedStatement stmt; // capaz de inserir dados sql

    //Método para inserir dados na tabela Fornecedo_Produto
    public void Vincular(int idFornecedor, int idProduto) {
        String sql = "INSERT INTO fornecedor_produto (id_fornecedor, id_produto) VALUES (?,?)";
        try {

            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idFornecedor);
            stmt.setInt(2, idProduto);
            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao INSERIR no Fornecedor_Produto: " + ex.getMessage());

        }
    }

}
