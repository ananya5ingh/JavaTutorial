public class MultiDimensionalArrays_12 {
    

    public static void main(String[] args){

        int values[] = {3, 5, 2343};

        System.out.println(values[2]);

        int grid[][] = {
            {3, 4, 1234},
            {2, 4},
            {1, 2, 3, 4}
        };

        System.out.println(grid[0][2]);

        for(int row=0; row<grid.length; row++){
            for(int col=0; col<grid[row].length; col++){

                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }
    }

}
