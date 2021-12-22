import java.text.CollationKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class emp{
	private String name;
	private String desig;
	private String city;
	private String project;

	public emp(String name, String desig, String city, String project, int i) {
		this.name = name;
		this.desig = desig;
		this.city = city;
		this.project = project;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	
}
public class Encap {

	public static void main(String[] args) {
ArrayList<emp> b=new ArrayList<emp>();
b.add(new emp(" hello","every ","one","def"));
b.add(new emp(" hii","every ","one","def"));
b.add(new emp(" gudu","every ","one","def"));
b.add(new emp(" hey","every ","one","def"));
Collections.sort( b);

	}

}
