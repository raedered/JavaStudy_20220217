package a08_함수2;

import java.util.Scanner;

public class SumMethodEx {
	
	public static int test(int money) {
		System.out.println(money);
		System.out.println(money + "를 굴린다");
		System.out.println("테스트 출력");
		return money * 2;
	}
	/*
	 * 숫자 4개를 입력받는다.
	 * a, b, c, d
	 * 숫자 4개를 입력받아서 리턴하여 샛미 변수를 출력하시오
	 * 입력받은 수
	 * a = 10
	 * b = 20
	 * c = 30
	 * d = 40
	 * total
	 */
	public static void printInput(int a, int b, int c, int d) {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
	public static int sum(int a, int b, int c, int d) {
//		System.out.println("입력받은수");
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
//		System.out.println("c = " + c);
//		System.out.println("d = " + d);
//		System.out.println("total = " + (a + b + c + d));
		return a + b + c + d;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0, b = 0, c = 0, d = 0, total = 0;
		
		System.out.print("4개의 수를 입력하세요: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
//		System.out.println("c = " + c);
//		System.out.println("d = " + d);
		
		printInput(a, b, c, d);
		
		total = sum(a, b, c, d);
		System.out.println("total = " + total);

	}

}
