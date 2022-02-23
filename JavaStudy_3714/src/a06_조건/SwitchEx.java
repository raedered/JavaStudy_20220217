package a06_조건;

public class SwitchEx {

	public static void main(String[] args) {
		int select = 10;
		
		switch(select) {
			case 1:
				System.out.println("1을 선택하셧습니다.");
				break;
			case 2:
				System.out.println("2를 선택하셧습니다.");
				break;
			case 3:
				System.out.println("3을 선택하셧습니다.");
				break;
		}
		
		String select2 = "김재현";
		
		switch(select2){
			case "김재현":
				System.out.println("선택하신 이름은 김재현입니다.");
				break;
			case "김재이":
				System.out.println("선택하신 이름은 김재이입니다.");
				break;
			case "김준삼":
				System.out.println("선택하신 이름은 김재삼입니다.");
				break;
		}
		
		int num = 21;
		// 조건 ? 결과1 : 결과2
		
		switch(num == 0 ? 2 : num % 2) {
		case 0:
			System.out.println("짝수 입니다.");
			break;
		case 1:
			System.out.println("홀수 입니다.");
			break;
		case 2:
			System.out.println("num이 0 입니다");
			}

	}

}
