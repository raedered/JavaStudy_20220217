package a10_배열;

public class UserArrayTest {

	public static void main(String[] args) {
		User[] users = new User[5];

		users[0] = new User("jaehyeon", "1234");
		users[1] = new User("jaehyeon1", "12334");
		users[2] = new User("jaehyeon2", "12344");
		users[3] = new User("jaehyeon3", "123124");
		users[4] = new User("jaehyeon4", "123314");

		for (int i = 0; i < users.length; i++) {
			/*
			if (users[i] != null) {
				users[i].showInfo();
			}
			*/
			if(users[i] == null) {
				continue;
			}
			users[i].showInfo();
		}

		System.out.println("===========================");

		int[] numbers = new int[5];

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
