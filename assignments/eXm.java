import java.util.Arrays;

public class eXm {
public static void main(String[] args) {
int[] n= {10,20,45};
int[] c=new int[8];
/*int sum=0;
double avg;
for(int res:n) {
	System.out.println("a"+sum);
	sum +=res;}
int arlen=n.length;
avg=((double)sum/(double)arlen);
System.out.println(sum);
System.out.println(avg);*/
int[] a=n;
System.arraycopy(n, 0, c, 2, n.length);
System.out.println(Arrays.toString(c));
}
}
