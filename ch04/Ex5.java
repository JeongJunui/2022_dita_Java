package ch04;

public class Ex5 {
	public static void main(String[] args) {
		String month="february";
		switch(month)
		{
		case "january":
			System.out.println("1월");
			break;
		case "february":
			System.out.println("2월");
			break;
		case "march":
			System.out.println("3월");
			break;
		default:
			System.out.println("4월 이후");
		}
	}
}
