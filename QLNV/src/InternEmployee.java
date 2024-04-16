import java.io.Serializable;

class InternEmployee extends Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private String majors;
	private String semester;
	private String universityName;

	public InternEmployee(int ID, String fullName, String birthDay, String phone, String email, String majors,
			String semester, String universityName) {
		super(ID, fullName, birthDay, phone, email, "Intern");
		this.majors = majors;
		this.semester = semester;
		this.universityName = universityName;
	}
	  public String getMajors() {
	        return majors;
	    }

	    public void setMajors(String majors) {
	        this.majors = majors;
	    }

	    public String getSemester() {
	        return semester;
	    }

	    public void setSemester(String semester) {
	        this.semester = semester;
	    }

	    public String getUniversityName() {
	        return universityName;
	    }

	    public void setUniversityName(String universityName) {
	        this.universityName = universityName;
	    }

	public void showInfo() {
		super.showInfo();
		System.out.println("Majors: " + majors);
		System.out.println("Semester: " + semester);
		System.out.println("University Name: " + universityName);
	}
}