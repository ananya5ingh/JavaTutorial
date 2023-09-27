import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// public class ExceptionHandling_24 {
    
//     public static void main(String [] args) throws FileNotFoundException {

//         File file =  new File("test.txt");

//         FileReader fr = new FileReader(file);
//     }
// }

public class ExceptionHandling_24 {
    
    public static void main(String [] args) {

        File file =  new File("test.txt");

        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }

        // try to this code and if that code throws an exception,
        // then immediately go to the catch block  

        System.out.println("Done.");
    }
}