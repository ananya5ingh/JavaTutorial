import java.util.Scanner;

public class InputInArray_12_1 {
    
    public static void main(String[] args){

        int arr[] = new int[3];

        Scanner inputVar = new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            arr[i] = inputVar.nextInt();
        }

        
        for(int element: arr){
            
            System.out.print(element + "\t");
        }
        
        
        inputVar.close();
    }
}
