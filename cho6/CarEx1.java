package cho6;

class Car1
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
	void stop()
	{
		this.velocity=0;
	}
}

public class CarEx1 {

	public static void main(String[] args) {
		int arr[]=new int[3];
		System.out.println(arr.length);
		String str="오늘의 메뉴는 수구레";
		System.out.println(str.length());
		
		Car1 c1=new Car1();
		c1.carName="소나타";
		c1.carColor="은색";
		c1.speedUp();
		System.out.println(c1.carName);
		System.out.println(c1.carColor);
		System.out.println(c1.velocity);
	}

}
