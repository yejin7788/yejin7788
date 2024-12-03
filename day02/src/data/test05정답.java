package data;

public class test05정답 {
public static void main(String [] args) {
	
	int h1 = 1, m1 = 50;
	int h2 = 2, m2 = 45;
	
	int h3 = h1 + h2;
	int m3 = m1+m2;
	
	int h4 = h3 + m3/60;
	int m4 = m3 %60;
	
	System.out.println(h3);
	System.out.println(m3);
}
}
