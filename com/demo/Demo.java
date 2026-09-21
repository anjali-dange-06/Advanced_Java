//package com.demo;
//import java.util.ArrayList;
//import java.util.List;
//public class Demo {
//	//int good();
//	//void add(int a,int b);
//    //void add(float a,float b);
//  // String ans();
//   //String concat(String s1,String s2);
//    //void takeNumbers(int[]arr);
// //void takeStudent(Student s);
//	void takeStudents(List<Student>students) {
//		
//	}
//public static void main(String[] args) {
////	Test t=(a,b)->
////	{
////		System.out.println("hello add");
////	};
////t.add(3,5);
////Test2 t2=(a,b)->{
////	System.out.println(a+b);
////};
////Test t3=(a,b)->{
////	System.out.println(a+b);
////};
////t3.add(45.55,66.45);
////}
////}
////interface Test2{
////void add(float a,float b);
////}
////interface Test3{
////void add(double a,double b);
////}
////Test3.add(54.34f, 10.0f);
////
////
////           ()->{
////           //code
//
//
//              }
//
//}

package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Demo {

    public static void main(String[] args) {
//   	Test t=(a,b)->
//    	{
//    		System.out.println("hello add");
//    	};
//    t.add(3,5);
    //Test2 t2=(a,b)->{
//    	System.out.println(a+b);
    //};
    //Test t3=(a,b)->{
//    	System.out.println(a+b);
    //};
    //t3.add(45.55,66.45);
    //}
    //}
    //interface Test2{
    //void add(float a,float b);
    //}
    //interface Test3{
    //void add(double a,double b);
    //}
    //Test3.add(54.34f, 10.0f);
//      Test t=(int[]arr)->{
//    	  int sum=0;
//    	  for(int x:arr) {
//    	  sum=sum+x;
//    	  }
//      System.out.println(sum);
//      };
//      int numbers[]= {1,2,3,4};
//     t.takeNumbers(numbers);
    	
//    Test t=(arr)->{
//    	for(int x : arr) {
//    		System.out.print(x+"   ");
//    	}
//    };
//    int arr[]= {1,2,3,4,5};
//    	t.getArray(arr);
    	
//    	Test t=(Student student)->{
//    		System.out.println(student.getId());
//    		System.out.println(student.getName());
//    	};
//    	Student s1=new Student(1,"ram");
//    	t.takeStudent(s1);
   
    	Test t3=(ArrayList<Student> students)->{
    		for(Student s1:students) {
    			System.out.println(s1);
    		}
    	};
    	ArrayList<Student> students = new ArrayList<>();
    	students.add(new Student(1, "ram"));
    	students.add(new Student(2, "bhakti"));
    	students.add(new Student(3, "devyani"));

    	t3.takeStudents(students);
    }
}


























