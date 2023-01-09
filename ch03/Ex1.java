package ch03;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int a=10;
		int b=3;
		int c=Math.max(a, b);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int d=sc.nextInt();
		System.out.println(d);
		if(d%2==0)
			System.out.println(d+"는 짝수입니다");
		else
			System.out.println(d+"는 홀수입니다");

	}
}