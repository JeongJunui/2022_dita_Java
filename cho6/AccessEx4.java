package cho6;

import ch06_1.Access3;

class Access4 extends Access3
{
	public Access4()
	{
		//상속시 private 제외한 다른 필드만 물려받음
		int k=b+c;
	}
}

public class AccessEx4 {
	public static void main(String[] args) {
		Access3 ac=new Access3();
	}
}
