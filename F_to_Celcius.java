import java.util.Scanner;

public class F_to_Celcius {
	public static void main(String args[]) {
		
		System.out.println("value of s");
		Scanner f=new Scanner(System.in);
		int S=f.nextInt();
		
		
		System.out.println("value of e");
		int E=f.nextInt();

		
		System.out.println("value of w");
		int W=f.nextInt();
		
		f.close();
		
		for(int i=S;i<=E;i+=W){
			
			float c=(i-32)*0.5556f;
			int C=(int)c;
			System.out.println(i+"\t"+C);
			
		}
		
	
	
	}

}