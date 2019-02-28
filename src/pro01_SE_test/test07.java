package pro01_SE_test;

import java.util.Scanner;

public class test07 {
	public static void main(String[] args) {
		int random = (int) (Math.random() * 100) + 1;
		System.out.println("input the number please.if input 0 exit");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while (num != random) {
			if(num==0){
				System.out.println("exit");
				break;
			}
			if(random>num){
				System.out.println("big");
			}
			if(random<num){
				System.out.println("small");
			}
			System.out.println("input again");
			num=sc.nextInt();
		}
		if (num == random) {
			System.out.println("right");
		}
		sc.close();
	}
}
