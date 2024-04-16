import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

class DatabaseManager {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/QLNV";
	private static final String DB_USER = "1";
	private static final String DB_PASSWORD = "1";

	public static void saveToDatabase(ArrayList<Employee> employees) {
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			for (Employee employee : employees) {
				String query = "INSERT INTO employees (ID, FullName, BirthDay, Phone, Email, EmployeeType) VALUES (?, ?, ?, ?, ?, ?)";
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, employee.getID());
				preparedStatement.setString(2, employee.getFullName());
				preparedStatement.setString(3, employee.getBirthDay());
				preparedStatement.setString(4, employee.getPhone());
				preparedStatement.setString(5, employee.getEmail());
				preparedStatement.setString(6, employee.getEmployeeType());
				preparedStatement.executeUpdate();
			}
			System.out.println("Employees' information saved to database successfully.");
		} catch (SQLException e) {
			System.out.println("Error saving employees' information to database: " + e.getMessage());
		}
	}
}
