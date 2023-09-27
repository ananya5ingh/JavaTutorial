import java.util.Scanner;

class Robot{

    void speak(String name){

        System.out.println("Hello I am Robot "+ name + "!");
    }

    void jump(int noOfTimes){
        
        System.out.println("Jumping "+ noOfTimes + " times...");
    }
}


public class MethodParametersEg_14 {

    public static void main(String[] args){

        System.out.println("Give me a name: ");

        Scanner inputVar = new Scanner(System.in);
        String name = inputVar.nextLine();
//              ^reference - like a label - points to memory - non primitive

        System.out.println("How many times do you want me to jump?");
        int times = inputVar.nextInt();
//             ^value - like a bucket - stores memory - primitive 
        Robot robot1 = new Robot();
        robot1.speak(name);
        robot1.jump(times);

        inputVar.close();
    }
    
}
