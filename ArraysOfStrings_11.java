public class ArraysOfStrings_11 {
    

    public static void main(String[] args){

        String words[] = new String[3];

        words[0] = "Hello ";
        words[1] = "to ";
        words[2] = "you";

        System.out.println(words[0]+words[1]+words[2]);

        String fruits[] = {"apple", "banana", "mango"};

        for(int i=0; i<fruits.length; i++){

            System.out.printf("\nFruit %d: %s\n",i+1, fruits[i]);
        }

        //another way of iterating through arrays - without a loop index

        for(String fruit: fruits){

            System.out.println("Fruit: " + fruit);
        }


    }
}
