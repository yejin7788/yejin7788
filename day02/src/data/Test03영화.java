package data;

public class Test03영화 {
	public static void main(String[]args) {
		int adultPrice = 15000;
		int teenPrice = 10000;
		int adultCount = 2;
		int teenCount = 3;	
		
		int adultTotal = adultPrice * adultCount; //성인합계
		int teenTotal = teenPrice * teenCount; // 청소년합계
		int total = adultTotal + teenTotal;//전체합계
		System.out.println(total);
	}
}
