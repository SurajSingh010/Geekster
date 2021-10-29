import java.util.Scanner;

public class Nth_Fibonacci_Number {
	
		
		    static int fib(int n) {
		    
		    if (n <= 1)
		       return n;
		    return fib(n-1) + fib(n-2);
		    }
		      
		    public static void main (String args[])
		    {
		    	Scanner f=new Scanner(System.in);
		    int n =f.nextInt();
		    f.close();
		    System.out.println(fib(n));
		    }
		}
		