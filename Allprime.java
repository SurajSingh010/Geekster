import java.util.Scanner;

public class Allprime {

	public static void main(String agrs[]) {
		
		System.out.println("Till where do you want the Prime numbers?");
		Scanner s=new Scanner(System.in);
		
		int a= s.nextInt();
		s.close();
		for(int j=0;j<=a;j++) {
		int count=0;
		
		
		for(int i=1;i<=j;i++){
			if(j%i==0){
				count=count+1;
			}
		}
		
		if(count==2) {
			System.out.println(j+"  is a prime number");
		}
		}
	}

}
