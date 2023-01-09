package cho6;

class SuperClass4
{
	public SuperClass4()
	{
		
	}
	public SuperClass4(int i)//생성자에 매개변수가 있는 상태에서 서브클래스가 생성자에 매개변수 갯수를 다르게 하거나 누락하면 오류 발생
	//해결하기 위해서는 서브클래스에서 super()로 매개변수를 직접 전달하거나 그에 맞게 슈퍼클래스에서 매개변수 갯수에 맞는 다른 생성자를 만들어야됨
	{
		
	}
}

class SubClass4 extends SuperClass4
{
	public SubClass4()
	{
		
	}
}

public class ConstructorEx4 {

	public static void main(String[] args) {

	}

}
