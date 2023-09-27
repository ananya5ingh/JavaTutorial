class Person{
    // a Class is a template/blueprint for creating objects
    // another way of looking at it could be that a Class is a little bit like a type like int, String
    
    // Classes can contain:
    // 1. Data (or 'instance variables' or 'state')
    // 2. Sub-routines (methods)

    String name;
    int age;

    void speak(){
    //    ^method names should be in lowerCamelCase
        System.out.println("My name is "+name+" and I am " +age+ " years old.");
    }
    // to run this method you have to call it

    void sayHello(String name){
        //          ^parameter - passing a parameter into this method
        System.out.println("Hello there "+ name + "!");
    }

    int calcYearsToRetirement(int age){
        // void type cannot return anything

        int yearsLeft = 65 - age;
        return yearsLeft;
        // ^return --> returns and leaves the method from there
    }
} 

public class ClassesObjectsMethods_13 {
// ^if class is public, then class name must match the name of the file
// also you can only have one public class in a file

// a Class is a template/blueprint for creating objects

    public static void main(String[] args){
        // your Java program starts wherever you declare main
        // here, this main method is a 'sub-routine'/'method'
        // "main-method"

        Person person1 = new Person();
        //      ^variable name that refers to person object
        //               new Person() --> object
        person1.name = "Joe Bloggs";
        person1.age = 37;
        

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 22;
        

        person1.sayHello(person2.name);
        person1.speak();
        System.out.println("YearsToRetirement is: "+person1.calcYearsToRetirement(person1.age));

        int yearsMinusTwo = person1.calcYearsToRetirement(person1.age) - 2;
        System.out.println("YearsToRetirement is - 2: "+yearsMinusTwo);

        System.out.println();

        person2.sayHello(person1.name);
        person2.speak();
        
        

        
    }
}
