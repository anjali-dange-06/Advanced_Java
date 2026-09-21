package com.demo;
// Functional Interface = Interface with exactly ONE abstract method
// It is used with Lambda Expressions in Java 8.
// @FunctionalInterface tells Java that this interface
// must contain only one abstract method.
//if u wrote like AO extends Test===>it will give error becuase your 
//Test class is also containing a method and here you have defined it as
// a functional interface so it will become normal interface
//marker interface is ==>dont have any method 
//eg.Serializable
//interface AO implement Serializable 
//that is object is converted into a stream
//because of implementing serializabe jvm la instruction jate ki particular
//object is contervrt into stream
<<<<<<< HEAD



=======
>>>>>>> f58c03e (Added Java 8 practice programs)
@FunctionalInterface
public interface AO {
    // This is the single abstract method.
    void Operation(int a, int b);
<<<<<<< HEAD
}
=======
}





//TYPES OF INTERFACE

//FUNCTIONAL INTERFACE ==>1==> CONTAINS ONLY ONE ABSTRACT METHOD and also we can write @Functionalnterface here yo denote
  //          @FunctionalInterface
 //           public interface AO{
//            void claculate(int a,int b);
//             
//                                 }




//MARKER INTERFACE     ===>2===>DOES NOT HAVE ANY METHOD   EG.serializable,clonable
//when we implment marker interface with our class our  object will get converted into stream
//when u implement immidieately jvm la msg jato ki particular object which is implementing serilizable please convert into stream
  //eg   public class Cal implements Searializable{
        //Cal cc=new Cal();
        //cc.id=1;
       //cc.name="anjali";
      //above objects will get converted into stream  
  //   }
//GENERIC INTERFACE   ===>GENERIC INTERFACE
//NORMAL INTERFACE    ===>	

//}
//}
//by using java 8 we can implement functional oriented prgramming
//to implement functional programming lambada came
//Lambda expression only works on functional Interface
//package com.demo;
//public class Calculator {
//// This method accepts an object/reference of Functional Interface AO.
//// AO x means: x can refer to any class that implements AO
//// OR it can receive a Lambda Expression.
//static void Operation(AO x) {
//    // Calling the Operation() method of AO.
//    x.Operation(100, 20);
//}
//public static void main(String args[]) {
//    // Addition addition = new Addition();
//    // substraction subtraction = new substraction();
//
//    // In Java 8, Lambda Expressions allow us to
//    // provide the implementation of a method directly.
//    // We are passing an OBJECT as an argument.
//    // This is the traditional Object-Oriented approach.
//    Calculator.Operation(new Addition());
//    // Lambda Expression
//    // Here we are directly providing the implementation
//    // of Operation(int a, int b).
//    //
//    // (int a, int b) = parameters
//    // ->               = Lambda operator
//    // System.out...     = method implementation
//    Calculator.Operation(
//        (int a, int b) ->
//            System.out.println("Subtraction is : " + (a - b))
//    );
//    // Lambda Expression with multiple statements.
//    // Curly braces { } are used when Lambda has multiple statements.
//    Calculator.Operation(
//        (int a, int b) -> {
//            System.out.println("Multiplication is : " + (a * b));
//        }
//    );
//    // Creating an object of Division class.
//    // Division implements the AO Functional Interface.
//    Division div = new Division();
//    // Passing the Division object as an argument.
//    // This is the traditional OOP approach.
//    Calculator.Operation(div);
//}
//}
>>>>>>> f58c03e (Added Java 8 practice programs)
