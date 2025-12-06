package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public String url = "jdbc:mysql://localhost:3306/controle_estoque";
    public String user = "root";
    public String password = "taticodobem@357";

    private Connection conn; //conexão armazenada aqui

    public Connection getConexao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão com o banco funcionando");
            return conn;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro de conexão com o banco: " + ex.getMessage());
            return null;
        }
    }

    public void desconectar() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Conexão desconectada");
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao desconectar conexão: " + ex.getMessage());
        }
    }
}
