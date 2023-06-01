/******************************************************************************

         Write a Java program to create a class called Animal with a method called 
makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.

Output:
The animal makes a sound.
The cat quarrels. 

*******************************************************************************/

class Animal{
    public void print(){
        System.out.println("The animal makes a sound.");
    }
}

class Cat extends Animal{
    //@Override
    public void print(){
        System.out.println("The cat quarrels.");
    }
}

public class Main
{
	public static void main(String[] args) {
	Animal animal=new Animal();
	Cat cat=new Cat();
	animal.print();
	cat.print();
	}
}
