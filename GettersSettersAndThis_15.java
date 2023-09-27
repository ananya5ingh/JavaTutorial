class Frog{

    String name;
    int age;
    // ^public by default

    // private String name;
    // private int age;


    public void setName(String newName){
        name = newName;
    }
    // setter - set method

    /* 
       ^ here above we introduced 'newName' as a new variable and didn't use 'name'
       again so that we don't have two 'name' variables in the same scope

       if we had done that, then 'name' would represent the variable that was declared the closest to it

       i.e.,
           public void setName(String name){
           name --> any us of name here inside the method would
           represent 'name' declared in setName itself since that is the closest declaration
           }

           i.e.,
            so local variables or parameters mask the insatnce variables if they have the same name

            to solve this problem read further
    */ 

    // if you want to refer to the instance variable, just prefix the variable with 'this.'

    // for eg.
    public void setAge(int age){
        this.age = age;
        //          ^this refers to the local variable 'age' of the setAge method
        //    ^this refers to the instance variable 'age' of the class Frog
        // this --> basically like a reference to the object tht you're in
    }


    public String getName(){
        return name;
    }
    // getter - get method

    public int getAge(){
        return age;
    }
    // getter - get method
}


public class GettersSettersAndThis_15{

    public static void main(String[] args){

        Frog frog1 = new Frog();
        frog1.name = "Bertie";
        frog1.age = 1;
        // here we are setting an instance using an equal to sign

        Frog frog2 = new Frog();
        frog2.setName("Billy");
        frog2.setAge(3);

        // here we are calling a method (set method)
        // 'encapsulation' - hiding away the instance data of the class

        /* if in class 'Frog' we make the instance variables name and age 'private',
        we will no longer be able to access variables 'name' and 'age' directly here i.e, outside of that class
        we have 'encapsulated' the data there

        name and age will only be able to be functional through the setters in this case */

        System.out.println("Name of first frog: "+frog1.getName());
        System.out.println("Age of first frog: "+frog1.getAge());

        System.out.println();
        System.out.println("Name of second frog: "+frog2.getName());
        System.out.println("Age of second frog: "+frog2.getAge());
    }
}