package a08_함수2;

import java.util.Scanner;

public class Calc {

	/*
	 * 매개 ㅂ녀수는 모두 2개 (정수)
	 * sum 덧셈
	 * sub 뺄셈
	 * mul 곱셈
	 * div 나눗셈
	 * 매개변수 둘중 하나라도 0이면 0을 리턴
	 * 
	 * 두수를 입력
	 * 더한결과:
     * 뺀결과:
     * 곱한결과:
     * 나눈 결과:
	 */
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static int mul(int a, int b) {
		return a * b;
	}
	
	public static int div(int a, int b) {
		if(a == 0 || b == 0) {
			return 0;
		}
		return a / b;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0, num1 =0;
		
		System.out.print("두수를 입력하세요: ");
		num = scanner.nextInt();
		num1 = scanner.nextInt();
		
		System.out.println("더한 결과: " + sum(num, num1));
		System.out.println("뺀 결과: " + sub(num, num1));
		System.out.println("곱한 결과: " + mul(num, num1));
		System.out.println("나눈 결과: " + div(num, num1));

	}

}
