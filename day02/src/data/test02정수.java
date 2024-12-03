package data;

public class test02정수 {
	public static void main(String[] args) {
		//-정수 - 소수점이 없는 수(byte/short/int/long) 
		//-아무 표시가 없으면 int로 판단  
		//-각 형태마다 표시할 수 있는 크기가 다름
		
		int a = 1000;
		int b = 2000;      // 변수 (variable), a,b,v,c = 이름, 이름은 겹치면 안됨 
		int c = a + b;
		System.out.println(c);
		
		//(Q)ㅇ
		int d = 6000;
		int e = 5;
		int f = d * e;
		System.out.println(f);
		
		
		int menu = 6500;
		int count = 5;
		int price = menu * count;
		System.out.println(price);
		
		//int adult = 15000
	}
}
