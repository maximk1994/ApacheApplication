package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

	private static Connection connection = null;
	private static String connectionUrl = "jdbc:sqlserver://localhost:1433;" 
			+ "databaseName=Apache;user=GSM1900/bgibbon1;password=Integrity2181!;";
	
	public static Connection createConnection() throws SQLException {
		    try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			} catch (ClassNotFoundException e) {
				System.out.println("Error SQL JAR file not found...");
				e.printStackTrace();
			}
		    
		    connection = DriverManager.getConnection(connectionUrl);
		    
		
		return connection;
		
	}
}
