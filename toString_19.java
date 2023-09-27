// toString() Method


class Frog{
    
    private int id;
    private String name;

    public Frog(int id, String name){

        this.id = id;
        this.name = name;
    }

    public String toString(){

        return String.format("%-4d: %s", id, name);
        
        // StringBuilder sb = new StringBuilder();
        // sb.append(id).append(": ").append(name);
        // return sb.toString();


        // return "Hello";
        // return id + " : " + name;
        // this is inefficient cause we're converting int to string and then concatenating all these strings
        // concatenating involves creating new strings

        // more efficient way would be to use StringBuilder to append
        // that way we're not creating a new string each time
        // every time you use a '+' symbol you are basically creating a new string

    }
}

public class toString_19 {
    
    public static void main(String[] args){

        // Object obj = new Object();
        // obj.
        // ^ you see methods show up
        
        // Frog frog1 = new Frog();
        // frog1.
        // ^ you see same methods show here cause it has inherited them from the Object class
        // which is secretly the parent of the Frog class

        // toString v useful to debug applications
        Frog frog1 = new Frog(7, "Freddie");
        System.out.println(frog1);
        // output is "Hello" - why? - cause when you run an Object it tends to invoke the toString method,
        // to get a string representation of the object

        // and if you don't have any toString method defined for your object then,
        //  you get the class name '@' sign and a 'hashCode' -- we're not getting it :(
    }
}


// all objects in Java have the 'Object' class as their ultimate parent
// so if I create my own class, it will have Object secretly as it's parent, 
// i.e., as the class that it actually derives from
