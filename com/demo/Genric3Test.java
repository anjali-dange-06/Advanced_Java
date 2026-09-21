package com.demo;

import java.util.Arrays;

public interface Genric3Test<T,U> {

	U fun(T t,U u);

	//Integer fun(int[] t,int[] u);

	//Employee get(Student s,Book b);

	//String[] getStudent(Integer t,String[] u);

	public static void main(String[] args) {






//		Genric3Test<Integer,String,String> aadi=(i,j)->{

//			System.out.println("hello");

//			return j;

//		};

//		aadi.fun(1,"anjali");





//		Genric3Test<int[],int[],Integer>a=(i,j)->{

//		System.out.println("hello");

//		System.out.println(Arrays.toString(i));

//		System.out.println(Arrays.toString(j));

//		return 10;

//		};

//		int x=a.fun(new int[] {1,2,3,4},new int[] {6,7,8,9});

//	    System.out.println(x);







	Genric3Test<Integer,String[]>anj=(i,j)->{

System.out.println(Arrays.toString(j));
		return j;

	};

	   anj.fun(100,new String[] {"ram","shyam"});










	}

}


//Generic interface =>the interface while using generics parameters is called a generic interface
//

//Interface Test<T>
//{
//void fun(T t);
//}




//Interface Test<T,U>
//{
//void fun(T t,U u);
//}




//Interface Test<T,U,R>
//{
//R fun(T t, U U);
//}
//JAVA 8 given us different predefined generic interfaces which are also called as functional intrface

//34 functional interfaces are given by thee java --> they are also generic interface
//1)Consumer 
//consumer interface is a predefined interface which is present in the java.util.function package 
//interface Consumer<T>
//{
//  void accept(t t);
//}




