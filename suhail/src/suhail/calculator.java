package suhail;
import java.util.Scanner; 
public class calculator {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	//example
	System.out.println("please enter a number :");
	int num1=scan.nextInt();//input
	
	System.out.println("enter another number :");
	int num2=scan.nextInt();//input
	
	int sum=num1+num2;//process
	
	System.out.println("addition of two number is ="+sum);//output
}
}
