package cho6;

class Car2
{
	void stop()
	{
		speed=0;
	}
	
	String name;
	int speed;
	int gear;
}

public class CarEx2 {

	public static void main(String[] args) {
		int a=10;
		int b=a+10;
		for(int i=0;i<100;i++)
		{
			Car2 c1=new Car2();
			//System.out.println(c1.toString());
		}
		String s="qwerasdfxzcv";
		System.out.println(s.toUpperCase());
		System.out.println(Integer.toBinaryString(32));
	}

}
