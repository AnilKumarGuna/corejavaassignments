import java.util.*;

public class Practice {
public static void main(String[] args) {
	ArrayList<emp> b=new ArrayList<emp>();
	b.add(new emp(" hello","every ","one","def",2));
	b.add(new emp(" hii","every ","one","def",3));
	b.add(new emp(" gudu","every ","one","def",4));
	b.add(new emp(" hey","every ","one","def",1));
	for(emp c:b) {
		System.out.println(c);
	}}
}
	
	
	
/*ArrayList<String> b=new ArrayList<String>();
b.add("2");
b.add("hello");
b.add("f");
Collections.sort(b);
ArrayList<String> c=new ArrayList<String>();
c.add("hii");
c.add("hello");
c.add("f");
ArrayList<String> d=new ArrayList<String>();
for(String e:b) {
	d.add(c.contains(e)?e:"e");
	System.out.println(d);
}
	}

}*/
