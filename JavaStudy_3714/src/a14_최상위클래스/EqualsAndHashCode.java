package a14_최상위클래스;

public class EqualsAndHashCode {
	
	public static void main(String[] args) {
		Student s1 = new Student(1, 1, 1, "김재현");
		Student s2 = new Student(1, 1, 1, "김재현");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1 == s2); // 주소값 비교
		System.out.println(s1.equals(s2));
	}
}
