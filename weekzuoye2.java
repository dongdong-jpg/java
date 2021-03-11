package text;

import java.util.Scanner;

public class weekzuoye2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please input n:");
		n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
