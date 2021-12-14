import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {
		String a,b="";
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		sc.close();
		int c=a.length();
		for(int i=0;i<=c-1;i++) {
			b=a.charAt(i)+b;
	
		}
		System.out.println(b);
	}
}
