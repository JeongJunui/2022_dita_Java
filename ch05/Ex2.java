package ch05;

public class Ex2 {

	public static void main(String[] args) {
		int arr[][]=new int[2][3];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=i+j;
				System.out.println(arr[i][j]);
			}
		}
		int arr2[][]= {{1,2},{3,4,5},{6},{1,2,3,4},{2,3,4}};
		int s=0;
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
				s+=arr2[i][j];
		}
		System.out.println("arr2[][]의 총합: "+s);
		double arr3[][]= {{1.0},{2.3,3.4},{4.5,6.2,4.3},{9.0}};
		double sum=0;
		int count=0;
		for(int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr3[i].length;j++)
			{
				sum+=arr3[i][j];
				count++;
			}
		}
		System.out.println("arr3[][]의 평균: "+(sum/count));
	}

}
