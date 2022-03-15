package a17_제네릭;

import a13_인터페이스2.model.User;

public class GenericTest {

	public GenericEX<String> getExData(String data) {
		GenericEX<String> ex = new GenericEX<String>(data);
		return ex;
	}
	
	public GenericEX<User> getExData(User data) {
		GenericEX<User> ex = new GenericEX<User>(data);
		return ex;
	}
	
	public static void main(String[] args) {
		GenericTest genericTest = new GenericTest();
		GenericEX<String> ex = genericTest.getExData("100");
		GenericEX<User> ex2 = genericTest.getExData(new User("jaehyeon", "1234", "김재현", "a@gmail.com"));
		System.out.println(ex);
		System.out.println(ex2);
	}

}
