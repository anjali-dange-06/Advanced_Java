package com.demo;
import java.util.Arrays;
import java.util.function.Function;
public class FunctionDemo {

	
	
	
	
	
	
	public static void main(String[] args) {
		Function<Integer,String>f=(i)->{
			return "ram";
		};
	     //OR
		//	Function<Integer,String>f1=(i)->"ram";
		System.out.println(f.apply(1060));//output=ram
		
		
		
		
		Function<Integer,Integer>f1=(i)->{
			return i;
		};
		System.out.println(f1.apply(1060));//output=1060
		
		
		
		
		Function<Integer,int[]>ff=(i)->{
			return new int[] {2,4,6,8};
		};
		System.out.println(Arrays.toString((ff.apply(45))));
		
		
		
		
		
		Function<Integer,String[]>fs=(i)->{
			return new String[] {"anjali","hello","how"};
		};
		String[] arr=fs.apply(123);
		for(String s:arr) {
			System.out.println(s);
		}
		
		
		
		
		
		//output will be about student ram
		//but if u want output of all students then return i
//		Function<Student,Student>st=(i)->{
//			return new Student(1,"anjali");
//		};
//		System.out.println(st.apply(new Student(1,"sakshi"),new Student(3,"vaishnavi"),new Student(4,"ravathi")));
		
		  Function<Student, Student> st = (i) -> {
	            return new Student(1, "anjali");
	        };

	        System.out.println(
	            st.apply(new Student(1, "sakshi"))
	        );

	        System.out.println(
	            st.apply(new Student(3, "vaishnavi"))
	        );

	        System.out.println(
	            st.apply(new Student(4, "ravathi"))
	        );
	    }
	
		
		
	}

