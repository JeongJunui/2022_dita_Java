package ch04;

public class LottoLucky {

	public static void main(String[] args) {
		int lotto[]=getLotto();
		for(int i=0;i<lotto.length;i++)
			System.out.println(lotto[i]+"\t");
	}
	public static int[] getLotto()
	{
		int lotto[]= new int[6];
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++)
			{
				if(lotto[j]==lotto[i])
				{
					lotto[i]=0;
					i--;
					break;
				}
			}
		}
		return lotto;
	}

}
