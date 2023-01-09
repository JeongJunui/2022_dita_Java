package cho6;

class Car3
{
	String carName;
	int velocity;
	String carColor;
	
	void speedUp()
	{
		this.velocity++;
	}
	void speedDown()
	{
		this.velocity--;
		if(this.velocity<0)
			this.velocity=0;
	}
}

public class CarEx3 {

	public static void main(String[] args) {
		Car3 c1=new Car3();
		Car3 c2=new Car3();
		c1.carName="소나타";
		c2.carName="아반떼";
		System.out.println(c1.carName);
		System.out.println(c2.carName);
		c2=c1;
		System.out.println(c1.carName);
		System.out.println(c2.carName);
		c1.carName="그랜저";
		System.out.println(c1.carName);
		System.out.println(c2.carName);
		int a=10;
		int b=a;
		a=20;
		System.out.println(a +" "+ b);
	}

}
