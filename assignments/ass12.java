package assignments;

import java.util.Scanner;

public class ass12 {
	public static void main(String[] args) 
	{Scanner sc = new Scanner(System.in);
	int num1, num2;
	System.out.println("Enter the First Number : ");
	num1=sc.nextInt();
	System.out.println("Enter the Seconed Number : ");
	num2=sc.nextInt();
	int Mul2 = num1*num2;
	System.out.println("Multiplication is :"+Mul2);
	sc.close();
}
}