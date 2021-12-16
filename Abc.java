package assignments;

import java.util.Scanner;

class Dum{
	void num(){
		
	}
}
 class Num extends Dum{
	static int a=0;
	 int f;
	int add (int i){
		f +=i;
		return f;
	}
}
public class Abc extends Num{
static int d;
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter no of values");
	int n=sc.nextInt();
	Num c=new Num();
	for(int b=1;b<=n;b++) {
		System.out.println("enter "+b+" value");
	int i=sc.nextInt();
	
	 d=c.add(i);
	}
	sc.close();
	System.out.println("sum of entered "+n+" values : "+d);
	}

}
