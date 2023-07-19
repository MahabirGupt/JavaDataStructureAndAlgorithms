public class TwoDimensionArray {
// intialize the array
    int twoDarray[][] = null;

//    create a constructor
    public TwoDimensionArray(int numberOfRows, int numberOfColumns){
        this.twoDarray = new int[numberOfRows][numberOfColumns];
        for (int row =0; row <twoDarray.length; row++){
            for (int col = 0; col <twoDarray[0].length; col++ ){
                twoDarray[row][col] = Integer.MIN_VALUE;
            }
        }
    }

//    Inserting value into an Array
    public void insertValueIntoArray(int row, int col, int value){
        try {
            if (twoDarray[row][col] == Integer.MIN_VALUE){// check to see if the array element is empty
                twoDarray[row][col] = value;
                System.out.println("The value is successfully inserted");
            }else {
                System.out.println("This cell is occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }

//    Accessing cell value of 2 dimensional arrays
    public void accessTwoDimensionalArrays(int row,int column){
        System.out.println("\nAccessing row number " + row + " ," + " col number " + column);

        try {
            int value;
            value = twoDarray[row][column];
            System.out.println("The cell value is " + value);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");

        }

    }

}
