package data;

public class TEST07게임예제 {
	public static void main (String [] args) {
		
		//입력
	int h1 = 12, m1=40;
	int h2=16, m2=15;
	int period= 60; // 단위기간 
	int price = 3000;
	
	//
	int t1= h1*60 +m1;//분으로 변환
	int t2 = h2*60+m2;//분으로 변환
	int t3= t2-t1;
	
	int h3 = t3/60;
	int m3= t3%60;
	
	int total = t3/period*price;
	
	
	System.out.println(total);
	System.out.println(t3);
	}
}
