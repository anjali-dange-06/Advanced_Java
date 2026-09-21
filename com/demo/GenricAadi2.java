package com.demo;

import java.util.Arrays;

public interface GenricAadi2<T,U> {
void add(T t,U u);

public static void main(String[] args) {
	
	GenricAadi2<Integer,String>t=(i,j)->{
		System.out.println(i);
		System.out.println(j);
	};
	t.add(1,"anjali");



   

	GenricAadi2<String,String>t1=(i,j)->{
		System.out.println("the concatination of the string is : "+(i+j));
	};
	t1.add("aniket","anjali");




	GenricAadi2<Integer,int[]>t2=(i,j)->{
		System.out.println(i);
		System.out.println(Arrays.toString(j));
	};
	t2.add(1,new int[] {2,3,4});







}

}
