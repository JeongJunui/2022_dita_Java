package cho6;

class Static1
{
	static int i=0;
	int j=0;
	static void prn()
	{
		
	}
	void prn2()
	{
		
	}
	static class Inner//내부 클래스는 예외적으로 static이 붙을 수 있는 클래스임
	{
		
	}
}

public class StaticEx1 {

	public static void main(String[] args) {
		int a=Math.abs(-6);
		int b=(int)Math.round(3.14);
		Integer i=new Integer(22);
		int c=i.parseInt("23");
		int d=Integer.parseInt("23");
		System.out.println(5*5*Math.PI);
	}
}
