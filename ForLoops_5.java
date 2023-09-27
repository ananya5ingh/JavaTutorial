public class ForLoops_5 {
    public static void main(String[] args){

        for(int i=0; i<5; i++){
            System.out.println("\nValue of i is: " + i);
            System.out.printf("Value of i is %d\n", i);
            //                                      ^format specifier
            // notice difference between println and printf
            // println also prints a new line by default, printf doesn't
            // can use format specifiers (e.g. %d) in printf 
            // \n - escape sequence for new line
            // \t - escape sequence for tab space
        }
    }
}
