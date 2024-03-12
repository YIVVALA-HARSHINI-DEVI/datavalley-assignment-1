import java.io.*;
import java.util.*;

class Animal{
    void makeSound(){
        System.out.println("Animals makes sounds");
    }
}
class Dog extends Animal{
     void makeSound(){
        System.out.println("Dog Barks!!");
    }
}
class Cat extends Animal{
     void makeSound(){
            System.out.println("Cat Meows!!");
    }
}
public class Main1
{
	public static void main(String[] args) {
	  Dog d=new Dog();
	  d.makeSound();
	  Cat c=new Cat();
	  c.makeSound();
		
	}
}
