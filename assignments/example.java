import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		String a,b="";
		Scanner sc=new Scanner(System.in);
		a=sc.next();
		sc.close();
		int c=a.length();
		for(int i=c-1;i>=0;i--) {
			b=b+a.charAt(i);
	
		}
		System.out.println(b);
	}
}
