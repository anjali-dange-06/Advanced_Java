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



@FunctionalInterface
public interface AO {
    // This is the single abstract method.
    void Operation(int a, int b);
}