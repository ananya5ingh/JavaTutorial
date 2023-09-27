package inheritance_20;

// did Inheritance, Packages and from there on done in eclipse
/*
A package in Java is used to group related classes. 
Think of it as a folder in a file directory. 
We use packages to avoid class name conflicts, and to write a better maintainable code. 
say you have two classes called Fish,
as long as they are in different packages it is okay
Packages must be lowercase, usually don't even use lowercase in them

Packages are divided into two categories:

Built-in Packages (packages from the Java API)
User-defined Packages (create your own packages)
 */
/* package name must be unique in the whole world in case your code is being shared to avoid conflict in package names or class names,
therefore by convention, --> com.websiteOrName.ClassName*/
public class Machine{
    
    public void start(){
        
        System.out.println("Machine started.");
    }
    
    public void stop(){
        
        System.out.println("Machine stopped.");

    }
}
