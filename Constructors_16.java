class Machine{

    private String name;
    private int code;
    public String area;

    // Variables declared inside a class but outside the scope of any blocks, constructors, or methods are known as instance variables in Java.

    // Constructors:
    // a Constructor is a special method which is run every time you create an instance of your class
    // usually a method needs to have a return type, even if its void but
    // a Constructor uniquely doesn't have a return type and
    // the name of you constructor has to be the same as the name of your class

    // normally a method starts with lowercase but since name of Constructor needs to be the same as the name of your class.
    // name of your constructor starts with an uppercase letter

    //constructor
    public Machine(){

        System.out.println("Constructor Running");
        name = "Arnie";
        // ^private String name will be initialized as Arnie as soon as object is created
        // so all it's objects will have this initialization running
    }

    // a constructor is a special method cause we don't need to explicitly call it for it to run

    // Constructors are used for initialization of instance variables or to set a kind of a default

    // you can have multiple methods having the same name as long as the parameters are different. Java will figure out whuch method you're trying to call
    // ^ same with constructors

    public Machine(String name){
        
        System.out.println("Second Constructor Running");
        this.name = name;
    }

    public Machine(String name, int code){

        this("Bertie");

        this.name = name;
        this.code = code;
        System.out.println("Third Constructor Running");
        // to call a constructor from within another constructor,
        // we might think, Machine("Bertie"); should work but it doesnt
        // 1. you have to replace the constructor name with 'this' - like - this("Bertie");
        // 2. and this has to be done at the top
    }

    public void printNameAndCode(){
        System.out.println(name);
        System.out.println(code);
    }
}


public class Constructors_16 {
    
    public static void main(String[] args){

        Machine machine1 = new Machine();
        //                  ^just the fact that a new object is created for that class is enough for a constructor to automatically run

        // this means that even just creating a new object using new() would do the trick - no need to even assign a variable to it

        new Machine();
            // ^ in a way you can see this as calling the constructor
        new Machine("Bertie");
        // looks for the constructor with this type of parameter conditions

        new Machine("Harry", 345);

        // we see that Java selects the right constructor depending on the parameter list

        machine1.area = "Bangalore";
    }

}


/* Constructors:
 * In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.

It is a special type of method which is used to initialize the object.

Every time an object is created using the new() keyword, at least one constructor is called.

It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.

There are two types of constructors in Java: no-arg constructor, and parameterized constructor.


NOTE:
It is called constructor because it constructs the values at the time of object creation. 
It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor if your class doesn't have any.
 */