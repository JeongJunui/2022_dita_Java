package cho6;

import java.awt.Color;
import java.awt.Frame;

class Access5 extends Frame
{
	public Access5()
	{
		this.setBackground(Color.LIGHT_GRAY);
		this.setEnabled(true);
		this.setVisible(true);
	}
	public String retrunParam()
	{
		return this.paramString();
	}
}

//java.awt.Frame의 paramString의 결과값을 출력할 것
public class AccessEx5 {
	public static void main(String[] args) {
		Access5 a5=new Access5();
		System.out.println(a5.retrunParam());
	}
}
