package a18_컬렉션.ArrayList;

import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		StudentService service = new StudentService(new ArrayList<Student>());
		
		service.showStudentAll();
		
		service.addStudent("김재현", "aaa@gmail.com", "부산 동래구");
		service.addStudent("김재이", "bbb@gmail.com", "부산 부산 진구");
		service.addStudent("김재삼", "ccc@gmail.com", "부산 사하구");
		service.showStudentAll();
		
		service.updateStudentByName(null, null, null);
		service.showStudentByName(null);
		
		service.deleteStudentByName(null);
		service.showStudentAll();
	}

}
