/******************************************************************************

                Overloading and Overriding usage.

*******************************************************************************/
import java.util.*;

class Parent {
    public void print() {
        System.out.println("I am Parent..!");
    }
}

class Child extends Parent {
    @Override
    public void print() {
        System.out.println("I am Child...!");
    }

    public void print(String message) {
        System.out.println("Child says: " + message);
    }
}

class Child1 extends Parent {
    @Override
    public void print() {
        System.out.println("I am Child1...!");
    }
}

public class Overloading {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.print();

        parent = new Child();
        parent.print();
        
        // Overloaded method with different parameter
        ((Child) parent).print("Hello from the child!");

        parent = new Child1();
        parent.print();
    }
}
