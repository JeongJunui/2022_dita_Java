package ch04;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하시오: ");
		int a=sc.nextInt();
		int b=a%10;
		if(b%3==0 && b!=0)
			System.out.println("짝");
		else
			System.out.println(a);
	}
}
