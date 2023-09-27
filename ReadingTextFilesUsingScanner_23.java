import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingTextFilesUsingScanner_23 {
    
    public static void main(String[] args) throws FileNotFoundException{

        String fileName = "textFile.txt";
        File textFile = new File(fileName);
        Scanner in = new Scanner(textFile);

        while(in.hasNextLine()){
            
            String line = in.nextLine();
            System.out.println(line);
        }
        in.close();
    }
}
