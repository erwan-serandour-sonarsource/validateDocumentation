package org.example;

public class Person {
  private int age;
  private String name;

  public Person(int age, String name){
    this.name = name;
    this.age = age;
  }

  public int age(){return age;}
  public String name(){return name;}
  public void sayHello(){System.out.println("Hello I am "+name);}
}
