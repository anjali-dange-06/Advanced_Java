package com.demo;
import java.util.Arrays;
public interface Genric2Aadi<T> {
//void add(T t1,T t2);//T==>type this is like if u gave int integer tithe janar 
                     //if u r giving float then float tithe janar if string dile tumhi tr string tithe janar
                     //wecan see aapn khali integer float string ya tinhi types ni kely


void fun(T t);
public static void main(String[] args) {
//	Genric2Aadi<Integer>aadi=(a,b)->{
//		System.out.println(a+b);
//	};
//	aadi.add(3,3);
//	
//	
//	Genric2Aadi<Float>aad=(a,b)->{
//		System.out.println(a+b);
//	};
//	aad.add(3.2f,3.8f);
//	
//	
//	Genric2Aadi<String>aa=(a,b)->{
//		System.out.println(a+b);
//	};
//	aa.add("anjali", "aniket");
	
	
	
	Genric2Aadi<int[]> a = (i) -> {
	    System.out.println(Arrays.toString(i));
	};

	a.fun(new int[] {1, 2, 3});
}
}
