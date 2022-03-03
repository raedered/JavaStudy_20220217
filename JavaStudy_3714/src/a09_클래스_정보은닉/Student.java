package a09_클래스_정보은닉;

public class Student {
	private String schoolName;
	private int studentCode;
	private int studentYear;
	private String studentname;
	
	public Student() {
		
	}

	public Student(String schoolName, int studentCode, int studentYear, String studentname) {
		super();
		this.schoolName = schoolName;
		this.studentCode = studentCode;
		this.studentYear = studentYear;
		this.studentname = studentname;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public int getStudentYear() {
		return studentYear;
	}

	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	
	public void showStudentInfo() {
		System.out.println("학교명" + schoolName);
		System.out.println("학번: " + studentCode);
		System.out.println("학년: " + studentYear);
		System.out.println("이름: " + studentname);
		System.out.println();
	}
	
}
