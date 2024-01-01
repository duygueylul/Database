package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect {
	
	private String dbUserName = "root";
	private String dbPassword = "";
	private String dbUrl = "jdbc:mysql://localhost:3306/sirket";
	
	
	private Connection connection = null;
	
	public connect() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Bulunamadı." + e);
			e.printStackTrace();
		}
		
		try {
			connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			System.out.println("Bağlantı Başarılı!!");
		} catch (SQLException e) {
			System.out.println("Bağlantı Başarısız!!");
			e.printStackTrace();
		}
		
	}
	

}
