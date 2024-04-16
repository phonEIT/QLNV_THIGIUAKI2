import java.io.*;
import java.util.ArrayList;

class FileManager {

	public static void saveToFile(ArrayList<Employee> employees, String filename) {
		try (ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(filename))) {
			objectOut.writeObject(employees);
			System.out.println("Employees' information saved to file successfully.");
		} catch (IOException e) {
			System.out.println("Error saving employees' information to file: " + e.getMessage());
		}
	}

	public static ArrayList<Employee> loadFromFile(String filename) {
		ArrayList<Employee> employees = new ArrayList<>();
		try (ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(filename))) {
			employees = (ArrayList<Employee>) objectIn.readObject();
			System.out.println("Employees' information loaded from file successfully.");
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error loading employees' information from file: " + e.getMessage());
		}
		return employees;
	}
}
