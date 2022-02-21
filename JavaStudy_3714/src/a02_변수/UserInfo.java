package a02_변수;

public class UserInfo {

	public static void main(String[] args) {
		/*
		 * 학번: 20220001  					-> studentCode (정수)
		 * 이름: 김재현	   					-> name1, name2, name3 (문자)
		 * 학년: 1		   					-> studentYear(정수)
		 * 성적: 85.5	   					-> score (실수)
		 * 평점: B		   					-> grade(문자)
		 * 성별: 남성(true), 여성(false) 	-> gender (boolean)
		 */
		int num = 10;
		System.out.println(num);
		
		int studentCode = 2022001;
		char name1 = '김';
		char name2 = '재';
		char name3 = '현';
		int studentYear = 1;
		double score = 85.5;
		char grade = 'B';
		boolean gender = true;
		
		System.out.println("학번: " + studentCode );
		System.out.println("이름: " + name1 + name2 + name3);
		System.out.println("학년: " + studentYear);
		System.out.println("성적: " + (score + 5.0));
		System.out.println("평점: " + grade);
		System.out.println("성별: " + gender);
				
	}

}
