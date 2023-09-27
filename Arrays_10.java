public class Arrays_10 {

    public static void main(String[] args){

       int values[]; //declaring an array or int[] values 
       values = new int[3]; //allocating memory to array

       //or

       int values1[] = new int[3]; //combining both in one

       int values2[] = {20, 40, 60, 80, 100}; // another way of declaring + initializing

       values[0] = 10;
       values[1] = 20;
       values[2] = 30;

       System.out.println(values[0]);
       System.out.println(values[1]);
       System.out.println(values[2]);

    // Iterating through an array

    for(int i=0; i<values.length; i++){
        
        System.out.println(values[i]+2);
    }

        System.out.println("Length of values array: "+values.length);
        System.out.println("Length of values1 array: "+values1.length);
        System.out.println("Length of values2 array: "+values2.length);
    }
}
