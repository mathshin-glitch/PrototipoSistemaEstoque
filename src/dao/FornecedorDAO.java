/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import classes.Fornecedor;
import conexao.Conexao;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDAO {

    private Connection conn; // cria o objeto que faz a conexão
    private Conexao conexao; // pega o metodo getConexao,

    public FornecedorDAO() {
        conexao = new Conexao();
        conn = conexao.Conectar();
    }

    PreparedStatement stmt; // objeto capaz de fazer consultas SQL
    ResultSet rs; // objeto que retorna dados do banco (tabela)

    public int inserir(Fornecedor f) {
        int status;
        String sql = "INSERT INTO fornecedor (nome,cnpjCpf,telefone,email,endereco) VALUES (?,?,?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getCnpj_cpf());
            stmt.setString(3, f.getTelefone());
            stmt.setString(4, f.getEmail());
            stmt.setString(5, f.getEndereco());
            status = stmt.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro no INSERT: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    public List<Fornecedor> listarTodos() {
        List<Fornecedor> lista = new ArrayList<>();
        String sql = "SELECT * FROM fornecedor";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Fornecedor f = new Fornecedor();
                f.setId(rs.getInt("id"));
                f.setNome(rs.getString("nome"));
                f.setTelefone(rs.getString("telefone"));
                f.setCnpj_cpf(rs.getString("cnpjCpf"));
                lista.add(f);
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println("Erro ao pegar dados do banco: " + ex.getMessage());
            return null;
        }
    }

}
