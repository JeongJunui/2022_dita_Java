package ch02;

public class Ex8 {

	public static void main(String[] args)
	throws Exception{
		System.out.println("키보드를 입력하고 Enter:");
		while(true)
		{
			int keyCode=System.in.read();
			System.out.println("keyCode: "+keyCode);
			if(keyCode==113)
				break;
		}
	}

}
