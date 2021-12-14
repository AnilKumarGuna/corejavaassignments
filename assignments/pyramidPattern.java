import java.util.Scanner;

public class pyramidPattern {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter");
		int i=sc.nextInt();
		sc.close();
	for(int a=0;a<i;a++) {
	for (int b=0;b<i-a-1;b++){
		System.out.print(" ");
			}
	for(int c=0;c<=a;c++) {
		System.out.print("*");
	}
System.out.println();
	}
}
}