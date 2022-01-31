import java.util.Scanner;
public class CALCULATOR {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a number");
		int num1=scan.nextInt();
				
				System.out.println("enter another number");
				int num2=scan.nextInt();
						
						int sum=num1+num2;
				
				System.out.println("sum of two number is"+sum);
		
	}

}
