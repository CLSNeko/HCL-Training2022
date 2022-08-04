import java.sql.*;

public class Assignment6 {
		// Define driver and database variables
		static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
		static final String DB_URL = "jdbc.mariadb://localhost:3306/jdbc_example";

		// Define db user and password
		static final String USER = "root";
		static final String PASS = "root";

		// Define connection variable
		static Connection conn;

		public static void main(String[] args){
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
		}
}
