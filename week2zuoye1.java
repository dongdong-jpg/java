package text;

import java.util.Scanner;

public class week2zuoye1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double sum=0;
		System.out.println("ÇëÊäÈëÎ»Êı£¨3<=n<=7£©");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		for(double i=Math.pow(10, n-1);i<Math.pow(10, n);i++) {
			sum=0;
			for(double j=i;j!=0;j=(int)(j/10)) {
				sum=sum+Math.pow(j%10, n);
			}
			if(sum==i) {
				System.out.println(i);
			}
		}

	System.out.println("over!");}

}
