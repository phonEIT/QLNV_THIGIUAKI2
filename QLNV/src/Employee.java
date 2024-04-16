import java.io.*;
import java.util.ArrayList;

interface IEmployee {
	void showInfo();
}

class Employee implements IEmployee, Serializable {
	private static final long serialVersionUID = 1L;
	protected int ID;
	protected String fullName;
	protected String birthDay;
	protected String phone;
	protected String email;
	protected String employeeType;
	protected static int employeeCount = 0;

	public Employee(int ID, String fullName, String birthDay, String phone, String email, String employeeType) {
		this.ID = ID;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.phone = phone;
		this.email = email;
		this.employeeType = employeeType;
		employeeCount++;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public static int getEmployeeCount() {
		return employeeCount;
	}

	@Override
	public void showInfo() {
		System.out.println("ID: " + ID);
		System.out.println("Full Name: " + fullName);
		System.out.println("BirthDay: " + birthDay);
		System.out.println("Phone: " + phone);
		System.out.println("Email: " + email);
		System.out.println("Employee Type: " + employeeType);
	}

}

class ExperienceEmployee extends Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private int expInYear;
	private String proSkill;

	public ExperienceEmployee(int ID, String fullName, String birthDay, String phone, String email, int expInYear,
			String proSkill) {
		super(ID, fullName, birthDay, phone, email, "Experience");
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Experience in Year: " + expInYear);
		System.out.println("Professional Skill: " + proSkill);
	}

}
