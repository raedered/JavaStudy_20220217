package a12_추상;

/**
 * 
 * 추상(abstract)
 * 추상 메소드, 추상 클래스
 * 
 * 추상 메소드: 반환자료형, 메소드명, 매개변수목록 정의한 메소드
 * 추상 클래스: 
 * 1. 클래스 내부에 추상 메소드가 하나라도 존재한다면 추상 클래스로 정의해야한다.
 * 2. 추상 클래스는 생성을 할 수 없다.
 * 3. 추상 메소드가 있다는 것 외에는 일반 클래스와 동일한 형태를 가진다.
 */

public abstract class Animal {
	public abstract void move();
}
