package ch04;

public class Ex11 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
				continue;
			System.out.println(i);
		}
		int sum=0;
		for(int i=1;i<=20;i++)
		{
			if(i%3!=0)
				continue;
			sum+=i;
			System.out.print(i);
			if(i+3<20)
				System.out.print(" + ");
			else
				System.out.print(" = ");
		}
		System.out.println(sum);
	}

}
