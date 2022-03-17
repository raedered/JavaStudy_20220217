package a18_컬렉션.HashMap;

import java.util.HashMap;

public class StudentTest {

	public static void main(String[] args) {
		StudentService service = new StudentService(new HashMap<String, Student>());
		service.showStudentAll();
		
		service.addStudent("김재현", "aaa@gmail.com", "부산 동래구");
		service.addStudent("김재이", "bbb@gmail.com", "부산 부산 진구");
		service.addStudent("김재삼", "ccc@gmail.com", "부산 사하구");
		service.showStudentAll();
		
		service.updateStudentByName("김재현", "ddd@kakao.com", "부산 북구");
		service.showStudentByName("김재현");
		
		service.deleteStudentByName("김재이");
		service.showStudentAll();
	}

}
