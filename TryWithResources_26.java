class Temp implements AutoCloseable {

    @Override
    public void close() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("Closing");
        throw new Exception("oh no!");
    } 
    // the autoCloseable interface just specifies that your class should have a methid called close

}

public class TryWithResources_26 {
    
    public static void main(String[] args) {

        try(Temp temp = new Temp()){
    //  ^try with resources (automatically calls the close method)(java 7 feature)
        } catch (Exception e){
            e.printStackTrace();
        }

        // try {
        //     temp.close();
        // } catch (Exception e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
    }
}
