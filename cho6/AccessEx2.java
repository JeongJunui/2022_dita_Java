package cho6;

class Access2
{
	private int a=0;
	private int age=0;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0)
			age=0;
		this.age = age;
	}
	
}

//protected:같은 패키지가 아니면 반드시 상속을 통해서만 접근가능

public class AccessEx2 {
	public static void main(String[] args) {
		Access2 ac=new Access2();
	}
}
