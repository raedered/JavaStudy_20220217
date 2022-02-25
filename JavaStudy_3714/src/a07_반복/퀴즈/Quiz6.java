package a07_반복.퀴즈;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		int n = 0;
		n = 5;

		for (int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
