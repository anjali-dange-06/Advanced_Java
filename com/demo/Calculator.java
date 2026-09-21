package com.demo;
public class Calculator {
	
static void Operation(AO x) {
	x.Operation(100, 20);
}
public static void main(String args[]) {
	//Addition addition=new Addition();//we cant make the object of an interface hence here we implemented AO with Addition class
	//substraction substractionn= new substraction();
	//by using java8 we can implemetn functional oriented programming
	//if we are pasing a funvtion to another function is called functional orientedprogramming

<<<<<<< HEAD

=======
>>>>>>> f58c03e (Added Java 8 practice programs)
	
	//way 1
	Addition add=new Addition();
	substraction sub=new substraction();
	Multiplication mult=new Multiplication();
	Division div=new Division();
	Calculator.Operation(add);
	Calculator.Operation(sub);
	Calculator.Operation(mult);
	Calculator.Operation(div);
	
	
	
	System.out.println("=====================================");
	
	//way  2
	//we are passing an object as an argument
    //is called object oriented programming
	Calculator.Operation(new Addition());
	Calculator.Operation(new substraction());
	Calculator.Operation(new Multiplication());
	Calculator.Operation(new Division());
	
	
	
	
	
	System.out.println("=====================================");
	//lambda expression works on only functional interface
<<<<<<< HEAD

=======
    //when we pass one function to another function is called functional oriented programming
    //here we dont need to make class and no need to make any object
>>>>>>> f58c03e (Added Java 8 practice programs)
	//way 3
	Calculator.Operation((int a,int b)->{
		System.out.println("Addition  is : "+(a+b));
	});
	Calculator.Operation((int a,int b)->{
		System.out.println("Subtraction is is : "+(a-b));
	});
	Calculator.Operation((int a,int b)->{
		System.out.println("multiplication is : "+(a*b));
	});
	Calculator.Operation((int a,int b)->{
		System.out.println("Division is : "+(a/b));
	});
	
	
	
	
	
	System.out.println("=====================================");
	
	//way 4 
	Calculator.Operation((int a,int b)->System.out.println("Addition is : "+(a+b)));
	Calculator.Operation((int a,int b)->System.out.println("Subtraction is : "+(a-b)));
	Calculator.Operation((int a,int b)->System.out.println("Multiplication is : "+(a*b)));
	Calculator.Operation((int a,int b)->System.out.println("Division : "+(a/b)));
	//no need to implement any extra class here just we
	//have passed the one function  to another function 
	//Calculator.calculate(mult);
	//when we pass a function to another function its functional oriented programming
	//Lambda Expression
	//here we dont need to make class and  also  no need to make an any object
	//but if we are doing without lambda function we need to implement our interface by making its class the we have to make an object and so on
	
	
	
	//here we are passing an object to the method as an argument is called as object oriented programming
	Calculator.Operation(div);
	//AO x=new Addition();

	
	
	//TYPES OF INTERFACE
	
//	FUNCTIONAL INTERFACE ==>1==> CONTAINS ONLY ONE ABSTRACT METHOD and also we can write @Functionalnterface here yo denote
	  //          @FunctionalInterface
     //           public interface AO{
    //            void claculate(int a,int b);
   //             
  //                                 }

<<<<<<< HEAD

	
	
	
	
	
	
	
	
=======
>>>>>>> f58c03e (Added Java 8 practice programs)
	
	
//  MARKER INTERFACE     ===>2===>DOES NOT HAVE ANY METHOD   EG.serializable,clonable
	//when we implment marker interface with our class our  object will get converted into stream
	//when u implement immidieately jvm la msg jato ki particular object which is implementing serilizable please convert into stream
	  //eg   public class Cal implements Searializable{
	        //Cal cc=new Cal();
	        //cc.id=1;
	       //cc.name="anjali";
          //above objects will get converted into stream  
	  //   }
<<<<<<< HEAD
=======

	
	
>>>>>>> f58c03e (Added Java 8 practice programs)
//  GENERIC INTERFACE   ===>GENERIC INTERFACE
//  NORMAL INTERFACE    ===>	
	
}
}
//by using java 8 we can implement functional oriented prgramming
//to implement functional programming lambada came
//Lambda expression only works on functional Interface
//package com.demo;
//public class Calculator {
//    // This method accepts an object/reference of Functional Interface AO.
//    // AO x means: x can refer to any class that implements AO
//    // OR it can receive a Lambda Expression.
//    static void Operation(AO x) {
//        // Calling the Operation() method of AO.
//        x.Operation(100, 20);
//    }
//    public static void main(String args[]) {
//        // Addition addition = new Addition();
//        // substraction subtraction = new substraction();
//
//        // In Java 8, Lambda Expressions allow us to
//        // provide the implementation of a method directly.
//        // We are passing an OBJECT as an argument.
//        // This is the traditional Object-Oriented approach.
//        Calculator.Operation(new Addition());
//        // Lambda Expression
//        // Here we are directly providing the implementation
//        // of Operation(int a, int b).
//        //
//        // (int a, int b) = parameters
//        // ->               = Lambda operator
//        // System.out...     = method implementation
//        Calculator.Operation(
//            (int a, int b) ->
//                System.out.println("Subtraction is : " + (a - b))
//        );
//        // Lambda Expression with multiple statements.
//        // Curly braces { } are used when Lambda has multiple statements.
//        Calculator.Operation(
//            (int a, int b) -> {
//                System.out.println("Multiplication is : " + (a * b));
//            }
//        );
//        // Creating an object of Division class.
//        // Division implements the AO Functional Interface.
//        Division div = new Division();
//        // Passing the Division object as an argument.
//        // This is the traditional OOP approach.
//        Calculator.Operation(div);
//    }
//}
//
//
