package a08_함수2;

import java.util.Scanner;

public class OddandEven {

	/*
	 * 수를 3개를 입력받는다.
	 * 
	 * oddAndEven(정수)
	 * 받은 정수가 홀수 인지 짝수인지 구분해서
	 * 
	 * 홀수면 true
	 * 짝수면 flase
	 * return
	 * 
	 * 10 = 짝
	 * 11 = 홀
	 * 12 = 짝
	 */
	public static void printResult(int a) {
		System.out.println(a + " = " + (oddAndEven(a) == true ? "홀" : "짝"));
		
	}
	
	public static boolean oddAndEven(int a) {
		boolean result = false;
		if(a % 2 != 0) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0, num1 = 0, num2 = 0;
		
		System.out.print("숫자를 입력하세요:");
		num = scanner.nextInt();
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
//		System.out.println(num + " = " + (oddAndEven(num) == true ? "홀" : "짝"));
//		System.out.println(num1 + " = " + (oddAndEven(num1) == true ? "홀" : "짝"));
//		System.out.println(num2 + " = " + (oddAndEven(num2) == true ? "홀" : "짝"));
		
		printResult(num);
		printResult(num1);
		printResult(num2);
	}

}
