//this is the power of generic interface 
//before we used to make many innterfaces but here we no need to make
package com.demo;
public interface Aadi<T> {
<<<<<<< HEAD
=======
	
	

>>>>>>> f58c03e (Added Java 8 practice programs)
void add(T t1,T t2);//type
//void add(Integer t1,Integer t2)//this method internally made
//void add(Float t1,Float t2)//this method internally made
//void add(Double t1,Double t2)//this method made internally
public static void main(String[] args) {
	Aadi<Integer> aadi=(a,b)->{
		System.out.println(a+b);
	};
	aadi.add(12,18);

Aadi<Float> aadi2=(a,b)->{
	System.out.println(a+b);
};
aadi2.add(12.10f,18.90f);
Aadi<Double> aadi3=(a,b)->{
	System.out.println(a+b);
};
aadi3.add(12.12,18.88);
}
}
