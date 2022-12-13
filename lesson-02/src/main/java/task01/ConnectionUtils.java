package task01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {

	private static String USER_NAME = "root";
	private static String USER_PASSWORD = "root";
	private static String URL = "jdbc:mysql://localhost:3306/magazine_shop";

	public static Connection openConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
	}
	
}