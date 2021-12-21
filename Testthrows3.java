package assignments;

import java.io.*;  
class v{  
 void method()throws IOException{  
  System.out.println("device operation performed");  
 }  
}  
class Testthrows3{  
   public static void main(String args[])throws IOException{//declare exception  
     v m=new v();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}  