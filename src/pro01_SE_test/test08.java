package pro01_SE_test;

import java.util.Scanner;

public class test08 {
	public static void main(String[] args) {
		int [] ary=new int[10];
		for(int i=0;i<ary.length;i++){
			ary[i]=(int)(Math.random()*100)+1;
		}
		for(int i=0;i<ary.length;i++){
			System.out.println(ary[i]+"\t");
		}
		int max=ary[0];
		for(int i=1;i<ary.length;i++){
			max=max<ary[i]?ary[i]:max;
		}
		System.out.println(max);
	}
}
