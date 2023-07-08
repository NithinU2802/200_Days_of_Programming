/******************************************************************************

    Person to load name and methods to access the class and implement the 
concept of Employee Management.

Output:
[[Name: Nithin], [Name: Aslam], [Name: Jameer]]

*******************************************************************************/
import java.util.*;

class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean hasSameName(Person person){
        return person.name == this.name;
    }

    @Override
    public String toString(){
        return "[Name: " + this.name + "]";
    }
}

public class Main {
    public static void main(String[] args) { 
        
        Person nithin = new Person("Nithin");
        ArrayList<Person> persons = new ArrayList();
        persons.add(new Person(new String("Nithin")));
        persons.add(new Person(new String("Aslam")));
        persons.add(new Person(new String("Jameer")));
        
        for (Person person : persons)
            if(person.hasSameName(nithin)){
                persons.remove(person);
            }
        
        System.out.println(persons);
    }
}
