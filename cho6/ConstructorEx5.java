package cho6;

class Constructor5
{
	int a;
	String str;
	
	public Constructor5()
	{
		
	}
	public Constructor5(int i)
	{
		a=i;
		//중복된 기능
	}
	public Constructor5(String s)
	{
		str=s;
	}
}

class Constructor5_1
{
	int a;
	String str;
	
	public Constructor5_1()
	{
		
	}
	public Constructor5_1(int i)
	{
		this();//자신의 디폴트 생성자 호출, 얘도 무조건 첫 번째 줄->super()랑 동시 사용 불가
		a=i;
	}
	public Constructor5_1(String s)
	{
		this();
		str=s;
	}
}

public class ConstructorEx5 {

	public static void main(String[] args) {
	}

}
