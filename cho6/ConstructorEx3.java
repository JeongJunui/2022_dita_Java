package cho6;

class SuperClass3
{
	public SuperClass3()//클래스 생성이 Object부터 상속받는 순서대로 전부 호출되니 SubClass3 생성자만 호출해도 SuperClass3도 같이 호출됨
	{
		System.out.println("Super 생성자");
	}
}
class SubClass3 extends SuperClass3
{
	public SubClass3()
	{
		super();//생략: 반드시 생성자의 첫 번째 라인
		System.out.println("Sub 생성자");
	}
}

public class ConstructorEx3 {
	public static void main(String[] args) {
		SubClass3 s1=new SubClass3();
	
	}
}
