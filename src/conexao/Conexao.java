package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

 // Dados de conexão
    private final String url = "jdbc:mysql://localhost:3306/controle_estoque";
    private final String user = "root";
    private final String password = "taticodobem@357";

    private Connection conn; // Guarda a conexão ativa

    public Connection Conectar() {
        try {
            // Abre conexão apenas se não existir ou estiver fechada
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Conexão com o banco funcionando");
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o banco");
            return null;
        }
        return conn;
    }

    public void desconectar() {
        try {
            // Fecha conexão se estiver aberta
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Conexão encerrada");
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao desconectar: " + ex.getMessage());
        }
    }

    // Retorna a conexão atual
    public Connection getConnection() {
        return conn;
    }

}
