package a07_반복.퀴즈;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("반복 횟수 입력: ");
		num = sc.nextInt();
		
		for(int i = 0; i < num; i ++) {
			for(int j = 0; j < num - i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
