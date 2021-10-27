package helloworld;

public class GreatestNumber {
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int c=30;
		if (a>b && a>c)
		{
			System.out.println("The greatest of three numbers:"+a);
			
		}
		else if (b>c && b>a)
		{
			System.out.println("The greatest of three numbers:"+b);
			
		}
		else {
			System.out.println("The greatest of three numbers:"+c);
		}
	}
	

}
