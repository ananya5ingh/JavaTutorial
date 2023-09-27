public class IfStatement_6 {
    public static void main(String[] args){
        int val = 6;
        if(val==4){
            System.out.println("True");
        }
        else if(val==5){
            System.out.println("Neither True nor False");
        }
        else{
            System.out.println("False");
        }

        //extension

        while(true){
            System.out.println("Looping");

            if(val == 10){
                break;
            }
            val++;
        }
    }
}

// = --> assignment
// == --> test for equality

// can have just if-(else if) combos also
// break --> break statement is used to immediately terminate the loop 