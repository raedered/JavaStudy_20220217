package a09_클래스_정보은닉;

public class StudentTest {

/*
 * Student 클래스 정의
 * 속성
 * schoolName
 * StudentCode(학번) 2022000
 * StudentYear
 * StudentName
 * 
 * 생성자(기본, 전체)
 * 
 * getter, setter
 * 
 * 메소드 showStudentInfo
 * 학교명: 코리아아이티아카데미
 * 학번: 20220001
 * 학년: 1
 * 이름: 김재현
 *
 * 메소드 showStudentInfo
 * 학교명: 코리아아이티아카데미
 * 학번: 20220002
 * 학년: 3
 * 이름: 김재현
 */
	public static void main(String[] args) {
		Student student1 = new Student("코리아아이티아카데미", 20220001, 1 , "김재현");
		Student student2 = new Student("코리아아이티아카데미", 20220002, 3 , "김재현");
		
		student1.showStudentInfo();
		student2.showStudentInfo();
		
		
		

	}

}
