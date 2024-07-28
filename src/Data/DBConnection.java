package Data;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	/*Devuelve la Conexión*/
	public static Connection getConnection() {
		String URL = "jdbc:sqlserver://localhost:1433;databaseName=SalesSystem;integratedSecurity=true;encrypt=false;";
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			Connection con = DriverManager.getConnection(URL);
			
			return con;
		} catch(Exception ex) {
			System.out.println(ex.toString());
			return null;
		}
	}
}
