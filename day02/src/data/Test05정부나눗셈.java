package data;

public class Test05정부나눗셈 {
	public static void main (String [] args) {
		//정수의 특징
		// - 정수끼리 계산하면 정수가 나온다
		// - 따라서 나눗셈은 몫과 나머지 구하는 방법이 다르다
		//정수에서의 나눗셈 특징
		// 150분은 몇 시간 몇 분
		int time = 150;
		int hour = time / 60;//몫 연산
		int minute = time % 60;//나머지 연산
		
		System.out.println(hour);
		System.out.println(minute);
		
	}
}
