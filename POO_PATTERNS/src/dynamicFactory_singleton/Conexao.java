package dynamicFactory_singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexao {
	
	private final String URL = "jdbc:mysql://localhost:3306/BD2?useTimezone=true&serverTimezone=UTC";
	private final String USER = "root";
	private final String PASSWORD = "root";
	private final String TP_CONEXAO = "com.mysql.cj.jdbc.Driver";
	
	private static Connection instance;
	
	private Conexao() {}
	
	public static Connection getInstance() {
		if(instance == null) {
			instance = new Conexao().criaConexao();
		}
		return instance;
	}
	
	private Connection criaConexao() {
		try {
			Class.forName(TP_CONEXAO);
			instance = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("conectei ao bd");
		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}
		return instance;
	}
	
	public static void fechaConexao() {
		try {
			if (instance != null && (!instance.isClosed())) {
				try {
					instance.close();
					System.out.println("fechei conexao ao bd");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
