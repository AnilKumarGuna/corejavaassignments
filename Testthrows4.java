package assignments;
import java.io.*; 
/*class A{  
 void method()throws IOException{  
	 
  throw new IOException("device error");  
 }  
}  */

class Testthrows4{  
	static String reverse(String s) {
		 StringBuilder sb= new StringBuilder(s);
		System.out.printf("dfg7uytf %s....\n",s);
		 return sb.reverse().toString();
		
	}
   public static void main(String args[])throws IOException{//declare exception  
  /*   A m=new A();  
     m.method();  
  
    System.out.println("normal flow...");  */
	   String reverseString=reverse("anil");
	   System.out.println(reverseString);
	   
  }  
}