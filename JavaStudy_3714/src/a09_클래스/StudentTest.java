package a09_클래스;

/**
 * Student(클래스)
 * 속성
 * schoolName
 * studentYear
 * studentGroup
 * studentnumber
 * studentName
 * studentaddress
 * studentphone
 * graduationFlag(boolean)
 * 
 * 기능(메소드)
 * showStudentInfo()
 * 	학교명: 부산고등학교
 * 	학년: 3
 * 	반: 2
 * 	번호: 10
 * 	이름: 김재현
 * 	주소: 부산 동래구
 * 	연락처: 010 - 9788 - 3714
 * 	졸업구분: 재학중 [true(졸업), false(재학중)];
 * 
 * incrememtYear()
 * 학년 + 1
 * 학년 3학년을 넘어서면 graduationFlag = true;
 */

public class StudentTest {

	public static void main(String[] args) {
		
//		st.schoolName = "부산고등학교";
//		st.studentYear = 1;
//		st.studentGroup = 2;
//		st.studentNumber = 10;
//		st.studentName = "김재현";
//		st.studentaddress = "부산 동래구";
//		st.studentphone = "010 - 9788 - 3714";
//		st.graduationFlag = false;
		
		Student s1 = new Student("부산고등학교", 1, 2, 10, "김재현", "부산동래구", "010 - 9788 - 3714", false);
		
		s1.incrememtYear();
		s1.incrememtYear();
		s1.incrememtYear();
		s1.showStudentInfo();
		
		Student s2 = new Student("경남 고등학교", "김재현");
		
		
	}

}
