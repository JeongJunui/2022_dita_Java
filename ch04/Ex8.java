package ch04;

public class Ex8 {

	public static void main(String[] args) {
		int ans1=0;
		int ans2=0;
		int ans3=0;
		int ans4=0;
		for(int i=1;i<=30;i++)
		{
			if(i%3==0)
				ans1+=i;
			if(i%2==0)
				ans2+=i;
			else
				ans3+=i;
			int b=i%10;
			if(b%3==0 && b!=0)
				ans4+=i;
			else if((i/10)%3==0 && i>=10)
				ans4+=i;
		}
		for(int i=31;i<=50;i++)
		{
			int b=i%10;
			if(b%3==0 && b!=0)
				ans4+=i;
			else if((i/10)%3==0 && i>=10)
				ans4+=i;
		}
		System.out.println("1~30 중 3의 배수의 합: "+ans1);
		System.out.println("1~30 중 짝수의 합: "+ans2);
		System.out.println("1~30 중 홀수의 합: "+ans3);
		System.out.println("1~50 중 3, 6, 9가 포함된 수의 합: "+ans4);
	}
}
