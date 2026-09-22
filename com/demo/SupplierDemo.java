package com.demo;
import java.util.Arrays;
import java.util.function.Supplier;
public class SupplierDemo {
public static void main(String[] args) {
	Supplier<Integer>s=()->{
		return 100;
	};
	System.out.println(s.get());
	
	
	Supplier<String>str=()->{
		return "anjali";
	};
	

	Supplier<int[] >s3=()->{
		return new int[] {1,2,3,4};
	};
	System.out.println(Arrays.toString(s3.get()));
}
}
