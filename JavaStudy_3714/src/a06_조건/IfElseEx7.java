package a06_조건;

import java.util.Scanner;

	/*
	 * 윤년 구분하기
	 * 1. year변수를 만들어서 년도를 입력받는다.
	 * 2. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
	 * 3. 윤년은 연도가 4의배수이면서, 100의 배수가 아닐때 또는 400배의 배수일때다
	 */

public class IfElseEx7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		
		System.out.print("연도를 입력하세요: ");
		year = sc.nextInt();
		
		if(year >= 1 && year <= 4000) {
			if(year % 4  == 0 && year * 100 != 0 || year % 400 == 0) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}else {
			System.out.println("계산할 수 없는 년도 입니다.");
		}
	}		
}
