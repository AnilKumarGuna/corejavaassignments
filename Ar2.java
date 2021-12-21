
import java.util.*;  
class Book  implements Comparable<Book> {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}
    public int compareTo(Book st){  
    	if(id==st.id)  
    	return 0;  
    	else if(id>st.id)  
    	return 1;  
    	else  
    	return -1;  
    	}  
    	  
}  
  
public class Ar2 {  
public static void main(String[] args) {  
    //Creating list of Books  
    List<Book> list=new ArrayList<Book>();  
    //Creating Books  
 
    //Adding Books to list  
    list.add(new Book(101,"Let us C","Yashwant Kanetkar","BPB",8)  );  
    list.add(new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4));  
    list.add(new Book(103,"Operating System","Galvin","Wiley",6)  );  
    //Traversing list  
    Collection.sort(list);
    for(Book st:list){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  }