public class StringBuilderAndFormatting_18 {
    
    public static void main(String[] args){

        String info = "";

        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";

        System.out.println(info);

        // in Java strings are immutable but here it looks as if you're changing it
        // here we're not changing the string, we're creating new strings each time and the re-assigning it to variable info
        // which is inefficient - use a lot of memory and also slow down your program
        // solution - StringBulider object

        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");
        // appending
        // on doing so we are not creating a new StringBuilder each time,
        // instead we are just modifying the contents of the existing string builder
        // which is much more efficient

        // to print the text that the string builder now contains,
        System.out.println(sb.toString());

        // (OR)

        StringBuilder s = new StringBuilder();

        s.append("My name is Roger.")
        .append(" ")
        .append("I am a sky diver.");

        System.out.println(s.toString());

        // String Buffer
        // String Buffer is just a thread safe version of String Builder (String Builder is not thread safe)

        // Formatting

        System.out.println();
        System.out.println("Here is some text.\tThat was a tab.\nThat was a newline.");
        System.out.println("more text.");

        System.out.println();

        System.out.print("Here is some text.\tThat was a tab.\nThat was a newline.");
        System.out.print("more text.");

        System.out.println("\n");
        // printf --> print format
        System.out.printf("Total no. of cows: %d\n", 68);
        //                                           ^format specifier
        System.out.printf("Name: %s\n", "Simon");
        System.out.printf("Total cost: %f\n", 678.99);

        System.out.printf("Total no. of cows: %10d\n", 68);
        //                                              ^represents that it's going to be 10 characters wide

        System.out.printf("Total no. of cows: %-10d\n", 68);
        //                                              ^use minus to left align

        for(int i=0; i<20; i++){
            System.out.printf("%-2d: some text.\n", i);
            // gives output in aligned format - concatenation would do the same job but output would be misaligned
        }


        System.out.printf("Total no. of cows: %-10d\nName: %s\nTotal cost: %10.2f", 77, "Ariana", 678.44);
        //                                                                          ^for 2 decimal places (it rounds it up to 2 decimal places)
    }

}
