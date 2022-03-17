package a19_예외;

import java.util.ArrayList;

import a18_컬렉션.ArrayList.Student;

public class ExceptionEx2 {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student()); // 0
		students.add(new Student()); // 1
		students.add(new Student()); // 2
		students.add(new Student()); // 3
		students.add(new Student()); 		 // 4
		students.add(new Student()); // 5
		students.add(new Student()); // 6
		students.add(new Student()); // 7

		try {
			for(int i = 0; i < students.size() + 1; i++) {
				Student student = students.get(i);
				student.setName("김재현");
				System.out.println(student.getName());
			}
			System.out.println("트라이문 끝까지 실행됨?");
		}catch(NullPointerException e) {
			System.out.println("주소를 참조할 수 없습니다.");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	
	}	
}
