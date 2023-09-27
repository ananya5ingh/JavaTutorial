import java.util.Scanner;

public class GetUserInput_7{

    public static void main(String[] args){

        Scanner inputVariable = new Scanner(System.in);
        // ^Scanner class          ^creating new Scanner object

        System.out.println("Enter your name: "); // prompt
        String line = inputVariable.nextLine();
        // ^taking whatever user enters as input as a string 
        // takes user input as whatever typed in next line before user hits Enter

        System.out.println("Enter your age: ");
        int value = inputVariable.nextInt();
        //^taking whatever user enters as input as a integer - crashes if non int value entered

        System.out.println("Enter a floating point value: ");
        double value1 = inputVariable.nextDouble();

        System.out.println(line + " is " + value + " years old.");
        System.out.println("The floating point value you entered is: "+value1);

        inputVariable.close(); // required to close our Scanner otherwise we'll be hit by a 'Resource leak' warning 
    }
}

// we use Scanner class to get input
// we need to import the Scanner class so that our program knows where to find it


