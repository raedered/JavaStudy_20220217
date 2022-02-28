package a08_함수;

import java.util.Scanner;

public class MethodEx5 {
	
	public static int sum(int x , int y) {
		return x + y;
	}

	public static void main(String[] args) {
		/*
		 * 두수를 입력받고 두수의 합을 구하는 메서드를 구현하라.
		 * sum()
		 * return 두수의 합
		 * 
		 * 리턴된 수를 main메서드에서 출력하라.
		 */
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.print("두 수를 입력하세요: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println(sum(num1, num2));
	}

}
