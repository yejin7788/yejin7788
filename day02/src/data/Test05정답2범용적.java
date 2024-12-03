package data;

public class Test05정답2범용적 {
public static void main(String [] args) {
	
	int h1 = 1, m1 = 50;
	int h2 = 2, m2 = 45;
	
	//처리 - 가장 작은 단위로 변환하여 계산
	
	int t1 = h1  * 60 +m1;
	int t2= h2*60+m2;
	int t3 = t1 + t2;
	
	int h3 = t3 /60;
	int m3= t3%60;
	
	System.out.println(h3);
	System.out.println(m3);
}
}
