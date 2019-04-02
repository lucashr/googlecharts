package graficos;import java.sql.Connection;
import java.sql.SQLException;

import br.com.abc.maven.graficos.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Conexao aberta!");
        connection.close();
	}
}
