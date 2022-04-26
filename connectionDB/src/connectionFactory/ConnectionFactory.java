package connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionFactory {
	
	private String schema = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private String user = JOptionPane.showInputDialog("Digite o usuário: ");
	private String password = JOptionPane.showInputDialog("Digite a senha: ");
	
	public Connection conectar() {
	
		try {
			return DriverManager.getConnection(schema, user, password);
		} catch (SQLException e) {
			System.out.println("Erro ao conectar");
			throw new RuntimeException(e);
		}
		
	}
	
}
