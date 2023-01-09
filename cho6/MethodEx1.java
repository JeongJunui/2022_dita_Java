package cho6;

class Method1
{
	int abs(int num)
	{
		if(num<0)
			num=-num;
		return num;
	}
	void prn(int a,int b)
	{
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);
	}
}

public class MethodEx1 {

	public static void main(String[] args) {
		Method1 m=new Method1();
		System.out.println(m.abs((-10)));
		m.prn(10, 20);
	}

}
