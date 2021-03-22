package text;

import java.util.Scanner;

public class week3zuoye1 {
public static double a[];
	public static void main(String[] args) {
		int choose=menu();
		while(choose!=5) {
			switch(choose) {
			case 1:input();break;
			case 2:averageOfGrade();break;
			case 3:maxOfGrade();break;
			case 4:minOfGrade();break;
			default:System.out.println("输入错误，请重新输入！");
			}
			choose=menu();
		}

	}
	
	
	
	private static int menu() {
		int choose=0;
		System.out.println("************BANK*************");
		System.out.println("1.输入成绩");
		System.out.println("2.求平均值");
		System.out.println("3.求最大值");
		System.out.println("4.求最小值");
		System.out.println("5.EXIT");
		Scanner scan=new Scanner(System.in);
		choose=scan.nextInt();
		return choose;
	}
	private static void input() {
		a=new double[5];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println("第"+(i+1)+"个数");
			a[i]=scan.nextDouble();
			if(a[i]<0||a[i]>100) {
				System.out.println("输入错误，请重新输入");
				a[i]=scan.nextInt();
			}
		}
		
	}
	private static void minOfGrade() {
		if(a==null) {
			System.out.println("请先输入成绩");
			input();
		}
		double min=100;
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("最小值："+min);
		
	}

	private static void maxOfGrade() {
		double max=0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("最大值："+max);
	}
	private static void averageOfGrade() {
		double sum=0;
		double average;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		average=sum/a.length;
		System.out.println("平均值:"+average);
	}

}
