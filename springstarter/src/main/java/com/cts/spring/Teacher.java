package com.cts.spring;

public class Teacher {
	String tName;
	int Id;
    String course;
public Teacher(String tName,int Id, String course) {
	this.tName=tName;
	this.Id=Id;
	this.course=course;
}
void work() {
	System.out.println("Teacher details are: \n Name: "+ this.gettName()     +",Id: "  +this.getId()   +",Course: "  +this.getCourse());

}

public String gettName() {
	return tName;
}
public int getId() {
	return Id;
}
public String getCourse() {
	return course;
}
}

