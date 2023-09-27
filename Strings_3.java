public class Strings_3 {
    public static void main(String[] args){

        String text = "Hello";
        // ^class        ^instance of the class / object
        System.out.println(text);

        String blank = " ";
        String name = "Bob";
        String greeting = text+blank+name; // Concatenation (Adding strings)

        System.out.println(greeting);
        System.out.println("Hello" + " " + "Bob"); // Concatenation (Adding strings)

        int myInt = 21;
        System.out.println("My integer is: " + myInt);

    }
}



// String is a non-primitive data type in java 
// i.e, it is actually a class, therefore first letter uppercase