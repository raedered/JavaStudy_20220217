package a14_최상위클래스;

public class StringTest {

	public static void main(String[] args) {
		Computer computer1 = new Computer();
		Computer computer2 = computer1;
		Computer computer3 = new Computer();
		
		System.out.println(computer1 == computer2);
		System.out.println(computer1 == computer3);
		System.out.println(computer1.equals(computer2));
		
		Integer num1 = 10;
		int num2 = 10;
		
		System.out.println(num1 + num2);
		
		String name = "김재현";
		String name2 = "김재현";
		String name3 = new String("김재현");
		
		System.out.println(name3);
		
		System.out.println(name == name2);
		System.out.println(name == name3);
		System.out.println(name.equals(name2)); //equals는 주소값이아닌 안에있는 값을 비교 주로 Scanner에서 사용함.
	}

}
