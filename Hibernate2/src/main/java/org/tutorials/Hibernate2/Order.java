package org.tutorials.Hibernate2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order_details")
public class Order {
@Id
private int id;
private String name;
private String desc;
public Order(int id, String name, String desc) {
	super();
	this.id = id;
	this.name = name;
	this.desc = desc;
}
public Order() {
	super();
}
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
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
@Override
public String toString() {
	return "Order [id=" + id + ", name=" + name + ", desc=" + desc + "]";
}
}
