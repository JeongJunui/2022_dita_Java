package cho6;

import common.util.StringUtil;

class Static3
{
	static int a;
	int b;
}

public class StaticEx3 {

	public static void main(String[] args) {
		Static3 st1=new Static3();
		Static3 st2=new Static3();
		st1.b=10;
		st2.b=20;
		System.out.println(st1.b);
		System.out.println(st2.b);
		st1.a=10;
		st2.a=20;
		System.out.println(st1.a);//static은 동일한 클래스의 모든 객체가 공유하므로 딱 하나만 만들어짐->위의 구문은 10이 들어간 a에 20을 덮어씌운 결과가 나옴
		System.out.println(st2.a);
		
		String str="10000000000000000000";
		System.out.println(StringUtil.addComma(str));
	}
}
