package a08_함수;

import java.util.Scanner;

public class MethodEx3 {

	public static void printStar1(int num) {
		if (num < 1) {
			System.out.println("별의 개수는1개 이상을 입력하셔야됩니다.");
		} else {
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num - i - 1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (i * 2) + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * printStar(입력받은 별의 개수)
		 * 1보다 작은 음수가 들어 왔을 때,
		 * 별의 개수는 1개 이상을 입력하셔야합니다.
		 * 
		 * 반복 횟수 입력: 10
		 * 별찍기 모양 선택(1 ~5)
		 * 만약 1 ~ 5의 수가 안들어 왔을때 정상적인 값이 들어올때 까지 계속 입력받기.
		 * 정상적인 값이 들어왔을때에는 해당 별찍기를 실행.
		 */
		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.print("숫자 입력: ");
		num = sc.nextInt();

		printStar1(num);

	}

}
