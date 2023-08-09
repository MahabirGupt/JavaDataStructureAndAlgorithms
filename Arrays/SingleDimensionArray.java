import com.sun.jdi.event.ExceptionEvent;

public class SingleDimensionArray {
    int intArrays[] = null;

    //    creating a constructor
    public SingleDimensionArray(int sizeOfArray) {
//        Setting the size of the array
        intArrays = new int[sizeOfArray];
        for (int i = 0; i < intArrays.length; i++) {
            intArrays[i] = Integer.MIN_VALUE; //set all empty intArrays[] = Integer.MIN_VALUE
        }
    }

    //    creating another method
    public void insert(int location, int valueToBeInserted) { //cell location
        try {
            if (intArrays[location] == Integer.MIN_VALUE) { //check to see if cell location is empty
                intArrays[location] = valueToBeInserted;
                System.out.println("This value has been successfully inserted");
//                System.out.println(intArrays[location]);

            } else {
                System.out.println("This cell is occupied by another value");
//                System.out.println(intArrays[location]);

            }

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to assess an array");
//            System.out.println(intArrays[location]);

        }
    }

//    Array Traversal - means to visit all the elements of the array.
    public void traverseArray(){
        try {
            for (int i = 0; i< intArrays.length; i++){
                System.out.print(intArrays[i] + " ");
            }
        }catch (Exception e){
            System.out.println("Array does not exist");
        }


    }

//    Search for an element in a given array
    public void searchInArray(int valueToSearch){
        for (int i =0; i<intArrays.length; i++){
            if(intArrays[i] == valueToSearch){
                System.out.println("The value is found at the index of " + i);
                return;
            }


        }
        System.out.println(valueToSearch + " not found");


    }

//    Delete value from an array
    public void deleteValueOfArray(int valueToDeleteIndex){
        try {
                intArrays[valueToDeleteIndex] = Integer.MIN_VALUE;

                    System.out.println("Successfully deleted " + intArrays[valueToDeleteIndex]);


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The provided index is not in the range of the Array");

        }


    }
}
