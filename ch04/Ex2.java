package ch04;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하시오: ");
		int a=sc.nextInt();
		if(a>0)
			System.out.println("양수");
		else if(a<0)
			System.out.println("음수");
		else if(a==0)
			System.out.println("0");
	}

}
