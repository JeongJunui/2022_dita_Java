package ch04;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하시오(1~100): ");
		int s=sc.nextInt();
		if(s<0 || s>100)
		{
			System.out.println("점수가 잘못되었음");
			return;
		}
		System.out.println("학년을 입력하시오(1~4): ");
		int g=sc.nextInt();
		if(g<1 || g>4)
		{
			System.out.println("학년이 잘못되었음");
			return;
		}
		boolean p=false;
		if(g!=4)
		{
			if(s>=60)
				p=true;
		}
		else if(s>=70)
			p=true;
		if(p)
			System.out.println("합격");
		else
			System.out.println("불합격");
	}
}
