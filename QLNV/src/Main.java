import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		EmployeeManager manager = new EmployeeManager();
		Scanner scanner = new Scanner(System.in);

		ExperienceEmployee expEmployee = new ExperienceEmployee(1, "Huỳnh thanh thuận", "26-03-2005", "123456789",
				"thuan@263", 5, "C++");
		FresherEmployee fresherEmployee = new FresherEmployee(2, "Hoàng Minh Thảo", "27-10-2002", "987654321",
				"thao@211", "01-01-2024", "Excellent", "VKU University");
		InternEmployee internEmployee = new InternEmployee(3, "Nguyễn Khánh Hoà", "10-4-2003", "456789123",
				"Hoakylong@107", "Computer Science", "Spring 2024", "VKU University");

		manager.addEmployee(expEmployee);
		manager.addEmployee(fresherEmployee);
		manager.addEmployee(internEmployee);

		manager.showAllEmployees();

		while (true) {
			System.out.println("===> Employee Management System <===");
			System.out.println("1. Add Employee");
			System.out.println("2. Show All Employees");
			System.out.println("3. Search Employee by ID");
			System.out.println("4. Update Employee");
			System.out.println("5. Delete Employee");
			System.out.println("6. Exit");
			System.out.println("=================================");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.println("Enter Employee Details:");
				System.out.print("ID: ");
				int ID = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Full Name: ");
				String fullName = scanner.nextLine();
				System.out.print("BirthDay: ");
				String birthDay = scanner.nextLine();
				System.out.print("Phone: ");
				String phone = scanner.nextLine();
				System.out.print("Email: ");
				String email = scanner.nextLine();
				System.out.print("Employee Type: ");
				String employeeType = scanner.nextLine();

				Employee newEmployee = new Employee(ID, fullName, birthDay, phone, email, employeeType);
				manager.addEmployee(newEmployee);
				break;

			case 2:
				System.out.println("All Employees:");
				manager.showAllEmployees();
				break;

			case 3:
				System.out.print("Enter Employee ID to search: ");
				int searchID = scanner.nextInt();
				Employee foundEmployee = manager.searchEmployeeByID(searchID);
				if (foundEmployee != null) {
					System.out.println("Employee found:");
					foundEmployee.showInfo();
				} else {
					System.out.println("Employee not found.");
				}
				break;

			case 4:
				System.out.print("Enter Employee ID to update: ");
				int updateID = scanner.nextInt();
				scanner.nextLine(); // Consume newline
				Employee employeeToUpdate = manager.searchEmployeeByID(updateID);
				if (employeeToUpdate != null) {
					System.out.println("Enter Updated Employee Details:");
					System.out.print("Full Name: ");
					String updatedFullName = scanner.nextLine();
					System.out.print("BirthDay: ");
					String updatedBirthDay = scanner.nextLine();
					System.out.print("Phone: ");
					String updatedPhone = scanner.nextLine();
					System.out.print("Email: ");
					String updatedEmail = scanner.nextLine();
					System.out.print("Employee Type: ");
					String updatedEmployeeType = scanner.nextLine();

					
					employeeToUpdate.setFullName(updatedFullName);
					employeeToUpdate.setBirthDay(updatedBirthDay);
					employeeToUpdate.setPhone(updatedPhone);
					employeeToUpdate.setEmail(updatedEmail);
					employeeToUpdate.setEmployeeType(updatedEmployeeType);
					System.out.println("Employee information updated successfully.");
				} else {
					System.out.println("Employee not found.");
				}
				break;

			case 5:
				System.out.print("Enter Employee ID to delete: ");
				int deleteID = scanner.nextInt();
				manager.deleteEmployeeByID(deleteID);
				break;

			case 6:
				System.out.println("Exiting program...");
				System.exit(0);

			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 6.");
			}
		}
	}
}