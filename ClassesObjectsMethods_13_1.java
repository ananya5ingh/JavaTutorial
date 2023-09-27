public class ClassesObjectsMethods_13_1 {
    public static void main(String[] args){

        Person person3 = new Person();
        person3.name = "Jim Halpert";
        person3.age = 33;

        Person person4 = new Person();

        person4.name = "Dwight Schrute";
        person4.age = 35;

        System.out.println(person3.name);
    }
}

// can create objects for a class defined in a different file as well
// just make sure that the .class file for that class exists