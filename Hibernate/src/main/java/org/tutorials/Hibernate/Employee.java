package org.tutorials.Hibernate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_details")
public class Employee {
	// id, name, city
	@Id
	private int id;
	private String name;
	private String city;
	
	//Constructor
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	// Zero-parameterized constructor
	public Employee() {
		super();
	}
		// Getter & Setter method	
	public int getId() {
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return this.id+":"+this.name+":"+this.city;
	}
	
	

}