package jdbcIntro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	static String userName = "root";
	static String password = "8520";
	static String dbUrl = "jdbc:mysql://localhost:3306/sys";

	public static void main(String[] args) throws SQLException{
		Connection connection = null;

		try {
			
			connection = DriverManager.getConnection(dbUrl, userName, password);
			System.out.println("Bağlantı oluştu");

		} catch (SQLException exception) {

			System.out.println(exception.getMessage());
		} finally {
			connection.close();
		}
		
	}

}
