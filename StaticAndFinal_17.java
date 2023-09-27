class Thing{

    public String name;
    public static String description;
    // btw most of the time member variables are declared private or protected

    public void showName(){
        System.out.println(name);
        System.out.println(description + ": " + name);
        //printing output of static variable description from instance method showName
        
    }

    public static void showInfo(){
        System.out.println(description);
        //System.out.println(name); --> this won't work
    }
    // static methods can access static data
    // but can't output instance variables like 'name'
    // makes sense cause static methods exist before you've even created any objects from your class
    // so they don't know about varaibles like 'name' which is associated with particular objects

    // on the other hand instance methods can access static data cause of course by the time you've got objects ofcourse you already got the class

    public final static int LUCKY_NUMBER = 7;
        //  ^final is Java's version of constant and it just ensures that you can't re-assign a value to this


    
    //say you want to assign a unique id to each object 

    public int id; // an instance variable, by default equal to 0
        
        
    // another good use of sttic isto count the number of objects that you are creating
    public static int count = 0; 

    public Thing(){
        id = count;
        // this will run everytime you create an instance of Thing
        count++;
        
    }
    // works cause everytime I create an object it runs the constructor and increments count

    public void showID(){
        System.out.println(id);
    }

    
}


public class StaticAndFinal_17 {
    
    public static void main(String[] args){

        System.out.println("Before creating objects, object count is: " + Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println("After creating objects, object count is: " + Thing.count);
        
        thing1.name = "Bob";
        thing2.name = "Sue";
        // on creating new objects, each object gets it's own copy of instance variables
        // static variables, don't have copies
        // static member variables or class variables belong to the class and there's only one copy cause there's only one class

        // so if you want to access class description, you access it by the class name
        // you type the class name 
        Thing.description = "I am a Thing";

        
        //System.out.println(thing1.name);
        //System.out.println(thing2.name);
        thing1.showName();
        thing2.showName();

        // now to run public static void showInfo(),
        Thing.showInfo();
        // access it by the class

        //System.out.println(Thing.description);


        System.out.println(Math.PI);
        // accessing PI from Math class - here PI is static - constant i.e.,

        // Math.PI = 3; --> not allowed - it's a constant - unchangeable
        // in a similar way, we can make our own constant

        System.out.println(Thing.LUCKY_NUMBER);


        // (constant values in Java are representeed by uppercase letters by convention)


        // another good use of static is to count the number of objects that you are creating (see class Thing)

        System.out.print("ID for thing1 is: ");
        thing1.showID();

        System.out.print("ID for thing2 is: ");
        thing2.showID();
    }
}
