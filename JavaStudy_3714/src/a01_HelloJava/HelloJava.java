package a01_HelloJava;

/**
 * 
 * 여러줄 주석(클래스 또는 메소드를 설명하는 주석)
 *
 */

/*
 * 
 * 여러줄 주석(여러줄 메모용)
 * 
 */

// 한줄 주석

// 주석의 단축키 Ctrl + /

public class HelloJava {

	public static void main(String[] args) {
		// ' 문자 ' => 'ㅁ'
		// "문자열" => "ㅁㅁㅁㅁㅁㅁ" hello, java
		
		// 프로그램 실행(Run) 단축키 Ctrl + F11
		
		System.out.println("HelloJava\n");
		System.out.println("김재현");
		System.out.println();
		
		/*
		 * 이름: 김재현
		 * 연락처: 010-9788-3714
		 * 주소: 부산 동래구 사직동
		 */
		
		System.out.print("이름: ");
		System.out.println("김재현\n");
		System.out.print("연락처: ");
		System.out.println("010-9788-3714\n");
		System.out.print("주소: ");
		System.out.println("부산 동래구 사직동");
		
	}

}
