package assignments;

import java.util.Scanner;

public class ass3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=50;
		Scanner sc = new Scanner(System.in);
		System.out.println("Now I Value is :"+i);
		i--;
		System.out.println("Decreamet :"+i);
		System.out.println("Enter the new Value :");
		int j =sc.nextInt();
		sc.close();
		System.out.println("Now Value is :"+j);
		j--;
		System.out.println("Decreament :"+j);
	}
}
