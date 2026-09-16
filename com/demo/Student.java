package com.demo;
import java.util.ArrayList;
public class Student {
private int id;
private String name;
Student(int id,String name){
	this.id=id;
	this.name=name;
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}

ArrayList<Student> students = new ArrayList<>();

}
