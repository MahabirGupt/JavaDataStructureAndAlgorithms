public class TwoDimensionArray {
    // intialize the array
    int twoDarray[][] = null;

    //    create a constructor
    public TwoDimensionArray(int numberOfRows, int numberOfColumns) {
        this.twoDarray = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < twoDarray.length; row++) {
            for (int col = 0; col < twoDarray[0].length; col++) {
                twoDarray[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    //    Inserting value into an Array
    public void insertValueIntoArray(int row, int col, int value) {
        try {
            if (twoDarray[row][col] == Integer.MIN_VALUE) {// check to see if the array element is empty
                twoDarray[row][col] = value;
                System.out.println("The value is successfully inserted");
            } else {
                System.out.println("This cell is occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }

    //    Accessing cell value of 2 dimensional arrays
    public void accessTwoDimensionalArrays(int row, int column) {
        System.out.println("\nAccessing row number " + row + " ," + " col number " + column);

        try {
            int value;
            value = twoDarray[row][column];
            System.out.println("The cell value is " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");

        }

    }

    //    Traverse 2D arrays
    public void traverse2Darrays() {
        for (int row = 0; row < twoDarray.length; row++) {
            for (int col = 0; col < twoDarray[0].length; col++) {
                int cell_value;
                cell_value = twoDarray[row][col];
                System.out.print(cell_value + " ");
            }
//            printing the arrays row by row
            System.out.println();
        }
    }
//  Searching the elements in 2 dimensional arrays using linear search

    public void searchElements(int element_value) {
        for (int row = 0; row < twoDarray.length; row++) {
            for (int col = 0; col < twoDarray[0].length; col++) {
                if (twoDarray[row][col] == element_value) {
                    System.out.println(element_value + " is in 2 dimensional array of row " + row + " and column " + col);
                    return;
                }

            }

        }
        System.out.println(element_value + " is not an element of 2 dimensional array");

    }

//    Deleting an element of an array
    public void deleteElement(int row,int col){
        try {
            System.out.println("2 dimensional array row " + row + " column " + col + " = " + twoDarray[row][col]);
            twoDarray[row][col] =Integer.MIN_VALUE;
            System.out.println("2 dimensional array row " + row + " column " + col + " = " + twoDarray[row][col]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is invalid");
        }
    }
}
