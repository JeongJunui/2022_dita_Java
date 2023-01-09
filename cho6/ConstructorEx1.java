package cho6;

class Constructor1 extends Object
{
	public Constructor1()
	{
		System.out.println("생성자 호출");
	}
	public Constructor1(int i)
	{
		System.out.println("매개변수 int 생성자 호출");
	}
	public Constructor1(String i)
	{
		System.out.println("매개변수 String 생성자 호출");
	}
}

public class ConstructorEx1 {

	public static void main(String[] args) {
		Constructor1 c1=new Constructor1();
		Constructor1 c2=new Constructor1(22);
		Constructor1 c3=new Constructor1("하하");
	}

}
