//in this program we saw we needed to make threee different interface make three different kmethods
//because the functional interface contains only one abstract method and if u r going to make
//lambda function u need only functional interface

package com.demo;

public interface GenricTest {
void add(int a, int b);
	

//suppose u want to do addition of two different mnumbers which are in float so if
//u r going to make new another method it will not allow u just because of unctional interface
//so if u want u can create another interface for that




	public static void main(String[] args) {
 GenricTest t=(a,b)->{
	 System.out.println("the additionid : "+(a+b));
 };
	t.add(34,34);	

	Test2 t2=(a,b)->{
		System.out.println("the addition is : "+(a+b));
	};
	t2.add(12.12f,12.88f);
	
	Test3 t3=(a,b)->{
		System.out.println("the concatination of the string is : "+(a+b));
	};
	t3.add("anjali","dange");
	}
	
}	
	
	
	
interface Test2{
	void add(float a,float b);
}

interface Test3{
	void add(String a,String b);
}



	

