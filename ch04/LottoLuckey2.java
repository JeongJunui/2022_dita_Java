package ch04;

import java.util.TreeSet;

public class LottoLuckey2 {

	public static void main(String[] args) {
	}
	public static Object[] getLotto()
	{
		TreeSet<Integer> tr=new TreeSet<Integer>();
		for(int i=0;tr.size()<6;i++)
		{
			tr.add((int)(Math.random()*45)+1);
		}
		Object lotto[]=tr.toArray();
		return lotto;
	}

}
