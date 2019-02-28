package pro01_SE_test;

import java.text.DecimalFormat;
import java.util.Scanner;

public class test03 {
	public static void main(String[] args) {
//		String str="hello";
//		str=3+4+str+4+5;
//		System.out.println(str);
		System.out.println("单价");
		Scanner sc=new Scanner(System.in);
		Double price=sc.nextDouble();
		System.out.println("数量");
		sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		Double total=price*number;
		
		DecimalFormat df=new DecimalFormat("##0.00");
		String totalStr=df.format(total);
		System.out.println(totalStr);
	}
}
