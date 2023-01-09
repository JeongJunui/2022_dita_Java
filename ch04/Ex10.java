package ch04;

public class Ex10 {

	public static void main(String[] args) {
		int a=0;
		while(true)
		{
			if(a==10)
				break;
			System.out.println("A: "+a);
			a++;
		}
		int s=0;
		for(int i=1;;i++)
		{
			if(s>100)
				break;
			System.out.print(i+"\t");
			s+=i;
		}
		System.out.println(s);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
				System.out.println(i+"+"+j+"="+(i+j));
			System.out.println();
		}
		iot://라벨 이름, 구역 시작 위치
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<10;j++)
				if(i+j>10)
					break iot;//구역을 통째로 빠져나감
		}
		iot2:
		for(int i=0;true;i++)
		{
			for(int j=0;true;j++)
			{
				System.out.println(i+j);
				if(i+j>30)
					break iot2;
			}
		}
	}

}
