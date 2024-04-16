import java.util.ArrayList;

class EmployeeManager {
	private ArrayList<Employee> employees = new ArrayList<>();

	public void addEmployee(Employee employee) {
		employees.add(employee);
		System.out.println("Employee added successfully.");
	}

	public void showAllEmployees() {
		for (Employee employee : employees) {
			employee.showInfo();
		}
	}

	public Employee searchEmployeeByID(int ID) {
		for (Employee employee : employees) {
			if (employee.getID() == ID) {
				return employee;
			}
		}
		return null;
	}

	public void updateEmployee(Employee updatedEmployee) {
		for (int i = 0; i < employees.size(); i++) {
			Employee employee = employees.get(i);
			if (employee.getID() == updatedEmployee.getID()) {
				employees.set(i, updatedEmployee); 
				System.out.println("Employee information updated successfully.");
				return;
			}
		}
		System.out.println("Employee not found.");
	}

	public void deleteEmployeeByID(int ID) {
		for (int i = 0; i < employees.size(); i++) {
			Employee employee = employees.get(i);
			if (employee.getID() == ID) {
				employees.remove(i);
				System.out.println("Employee deleted successfully.");
				return;
			}
		}
		System.out.println("Employee not found.");
	}
}
