package assignments;

import java.util.Scanner;

public class ass2 {	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	int num1, num2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number to calculate with 10");
	num1 = sc.nextInt();
	System.out.println("Now Number one :"+num1);
	num1 +=10;
	System.out.println("num1 +=10 :"+num1);
	num1 -=10;
	System.out.println("num1 -=10 :"+num1);
	num1 *=10;
	System.out.println("num1 *=10 :"+num1);
	num1 /=10;
	System.out.println("num1 /=10 :"+num1);
	num1 %=10;
	System.out.println("num1 %=10 :"+num1);
	System.out.println("Enter the Number two to calculate with 10 ");
	num2=sc.nextInt();
    System.out.println("Now Number Two :"+num2);
	num2 +=10;
	System.out.println("num2 +=10 :"+num2);
	num2 -=10;
	System.out.println("num2 -=10 :"+num2);
	num2 *=10;
	System.out.println("num2 *=10 :"+num2);
	num2 /=10;
	System.out.println("num2 /=10 :"+num2);
	num2 %=10;
	System.out.println("num2 %=10 :"+num2);
}
}
