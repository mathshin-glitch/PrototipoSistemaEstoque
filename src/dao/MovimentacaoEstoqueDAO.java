package dao;

import classes.Produto;
import conexao.Conexao;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class MovimentacaoEstoqueDAO {

    private Conexao conexao;
    private Connection conn;

    public MovimentacaoEstoqueDAO() {
        this.conexao = new Conexao();
        this.conn = conexao.getConexao();
    }

    //Método da para Mostrar o Historico de Movimentação de Estoque
    public List<Object[]> listarMovimentacoes() {
        List<Object[]> lista = new ArrayList<>();

        String sql = "SELECT me.data_movimentacao, "
                + "p.nome AS nome_produto, "
                + "me.tipo, "
                + "me.quantidade, "
                + "f.nome AS nome_fornecedor "
                + "FROM movimentacao_estoque me "
                + "INNER JOIN produto p ON me.id_produto = p.id "
                + "INNER JOIN fornecedor_produto fp ON p.id = fp.id_produto "
                + "INNER JOIN fornecedor f ON fp.id_fornecedor = f.id "
                + "ORDER BY me.data_movimentacao DESC";

        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                // FORMATA A DATA PARA BRASIL
                Timestamp ts = rs.getTimestamp("data_movimentacao");
                String dataBR = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(ts);

                // +quantidade para ENTRADA, -quantidade para SAIDA
                int qtd = rs.getInt("quantidade");
                String tipo = rs.getString("tipo");

                String quantidadeFormatada = tipo.equals("ENTRADA")
                        ? "+" + qtd
                        : "-" + qtd;

                Object[] linha = {
                    dataBR,
                    rs.getString("nome_produto"),
                    tipo,
                    quantidadeFormatada,
                    rs.getString("nome_fornecedor")
                };

                lista.add(linha);
            }

            rs.close();
            st.close();

        } catch (Exception e) {
            System.out.println("Erro ao listar histórico: " + e.getMessage());
        }

        return lista;
    }

    //Método para listar produto pelo nome
    public Integer buscarIdDoProduto(String nomeProduto) {
        Integer id = null;

        String sql = "SELECT id FROM produto WHERE nome = ? LIMIT 1";

        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nomeProduto);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                id = rs.getInt("id");
            }

            rs.close();
            st.close();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar ID do produto: " + e.getMessage());
        }

        return id;
    }

    public int buscarQuantidadeAtual(int idProduto) {
        int qtd = -1;

        String sql = "SELECT quantidade FROM produto WHERE id = ?";

        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, idProduto);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                qtd = rs.getInt("quantidade");
            }

            rs.close();
            st.close();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar quantidade atual: " + e.getMessage());
        }

        return qtd;
    }

    public boolean atualizarQuantidade(int idProduto, int novaQuantidade) {

        String sql = "UPDATE produto SET quantidade = ? WHERE id = ?";

        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, novaQuantidade);
            st.setInt(2, idProduto);

            int linhas = st.executeUpdate();
            st.close();

            return linhas > 0;

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar quantidade: " + e.getMessage());
            return false;
        }
    }

    public void registrarMovimentacao(int idProduto, String tipo, int quantidade) {

        String sql = "INSERT INTO movimentacao_estoque (id_produto, tipo, quantidade, data_movimentacao) "
                + "VALUES (?, ?, ?, NOW())";

        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, idProduto);
            st.setString(2, tipo);
            st.setInt(3, quantidade);

            st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            System.out.println("Erro ao registrar movimentação: " + e.getMessage());
        }
    }

    public List<Object[]> listarProdutosComFornecedor(String filtroFornecedor) {
        List<Object[]> lista = new ArrayList<>();

        String sql = "SELECT p.nome AS nome_produto, "
                + "p.quantidade AS quantidade, "
                + "f.nome AS nome_fornecedor "
                + "FROM produto p "
                + "LEFT JOIN fornecedor_produto fp ON p.id = fp.id_produto "
                + "LEFT JOIN fornecedor f ON fp.id_fornecedor = f.id ";

        // Filtro opcional
        if (filtroFornecedor != null && !filtroFornecedor.trim().isEmpty()) {
            sql += "WHERE f.nome LIKE ? ";
        }

        sql += "ORDER BY p.nome ASC";

        try {
            PreparedStatement st = conn.prepareStatement(sql);

            if (filtroFornecedor != null && !filtroFornecedor.trim().isEmpty()) {
                st.setString(1, "%" + filtroFornecedor + "%");
            }

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Object[] linha = {
                    rs.getString("nome_produto"),
                    rs.getInt("quantidade"),
                    rs.getString("nome_fornecedor")
                };
                lista.add(linha);
            }

            rs.close();
            st.close();

        } catch (SQLException e) {
            System.out.println("Erro ao carregar tabela movimentação: " + e.getMessage());
        }

        return lista;
    }

}
