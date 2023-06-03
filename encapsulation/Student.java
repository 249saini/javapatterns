package com.jsp.encapsulation;

public class Student {
private int id;
private String name;
private String course;
private String email; // data hiding
// setter method-> to set the value for int id
public void setId(int id)
{
	this.id=id;
	
}
// getter method
public int getId()
{
	return id;
}
public void setName(String name)
{
	this.name=name;
	
}
public String getName()
{
	return name;
	}
public void setCourse(String course)
{
this.course=course;
}
public String getCourse() {
return course;
}
public void setEmail(String email)
{
	this.email=email;
	
}
public String getEmail()

{
	return email;
	
}
}
