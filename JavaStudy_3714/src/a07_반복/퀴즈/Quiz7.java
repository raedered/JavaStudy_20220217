package a07_반복.퀴즈;

public class Quiz7 {

	public static void main(String[] args) {
		int n = 0;
		n = 5;
		
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (i * 2) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
					

	}

}
