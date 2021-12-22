
public class emp {
		private String name;
		private String desig;
		private String city;
		private String project;
	private int id;

		public emp(String name, String desig, String city, String project,int id) {
			this.name = name;
			this.desig = desig;
			this.city = city;
			this.project = project;
			this.id=id;
		}

		public String toString() {
			return "emp [name=" + name + ", desig=" + desig + ", city=" + city + ", project=" + project + ", id=" + id
					+ "]";
		}
	
}
		/*public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
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
		
		public int compareTo(emp st){  
	    	if(id==st.id)  
	    	return 0;  
	    	else if(id>st.id)  
	    	return 1;  
	    	else  
	    	return -1;  
	    	}  
	    	  
}*/
