package data;

public class test07주차a {
public static void main(String[]args) {
	int h1= 12, m1=40;
	int h2= 16, m2=15;
	int t1 = h1*60+m1;
	int t2= h2*60+m2;
	int t3 = t2 - t1;
	int t4 = t3/60;
	int t5 = t3%60;

	System.out.println(t4);
	System.out.println(t5);
}
}
