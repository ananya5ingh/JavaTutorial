import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class ReadingFilesUsingFileReader_25 {
    
    public static void main(String[] args){

        File file = new File("textFile.txt");

        BufferedReader br = null;
        try{ 
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line;

            while((line = br.readLine()) != null){
                System.out.println(line);
                
            }

            
        }
        catch(FileNotFoundException e) {

            System.out.println("File Not Found: "+ file.toString());
        } catch (IOException e) {
            System.out.println("Cannot read file: " + file.toString());
            // in case, file corrupted or permissions don't allow
        }
        finally{
            
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Unable to close file: " + file.toString());
            }
            catch(NullPointerException ex){

            }
        }
    }
}
