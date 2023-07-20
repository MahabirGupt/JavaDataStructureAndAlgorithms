import java.util.*;
public class Main {

    public static int multiplyNumbers(int n){
        return n*n;
    }
    public static void main(String[] args) {

//        System.out.println(multiplyNumbers(10));
//        printNumbers(5);;
//        printNumbers2Inputs(3,2);;
//        printNumbersNestedFor(6,7);
//        System.out.println(sumNumbers(1));
//        pairSumSequence(3);

//        System.out.println(pairSumSequence(3));
//        findTotalNumber(25);

//        creating an intArrayay of integers
        int[] intArray;
//        set the size of the array
        intArray = new int[3];

//        initialise the array
        intArray[0] = 20;
        intArray[1] = 30;
        intArray[2] = 40;
//        System.out.println(Arrays.toString(intArray));

//        create an array in 1 step instead of 3 steps
//        String stringArray[] = {"M","A","H"};
//        System.out.println(Arrays.toString(stringArray));

        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(10);
        singleDimensionArray.insert(0,10);
        singleDimensionArray.insert(1,20);
        singleDimensionArray.insert(2,30);
        singleDimensionArray.insert(1,30);
        singleDimensionArray.insert(12,120);

        var firstElement = singleDimensionArray.intArrays[0];
        System.out.println(firstElement);
        var secondElement = singleDimensionArray.intArrays[1];
        System.out.println(secondElement);
//        var thirdElement = singleDimensionArray.intArrays[13];
//        System.out.println(thirdElement);

        System.out.println("Array Traversal");
        singleDimensionArray.traverseArray();

        System.out.println("Search for an element in a given array");
        singleDimensionArray.searchInArray(20);
        singleDimensionArray.searchInArray(5);

        System.out.println("Delete an element in a given array");
        singleDimensionArray.deleteValueOfArray(2);
        singleDimensionArray.deleteValueOfArray(10);

//        creating a 2-dimensional array
//        creating an intArrayay of integers
        int[][] int2dArray;

//        set the size of the array
        int2dArray = new int[2][2];

//        initialise the array
        int2dArray[0][0] = 1;
        int2dArray[0][1] = 2;
        int2dArray[1][0] = 3;
        int2dArray[1][1] = 4;

//        printing out the arrays
        System.out.println(Arrays.deepToString(int2dArray));

//        creating a 2-dimensional array in one step
        String str2dArray[][] = {{"a","b"},{"c","d"}};
        System.out.println(Arrays.deepToString(str2dArray));

        TwoDimensionArray twoDimensionArray = new TwoDimensionArray(3,3);
        twoDimensionArray.insertValueIntoArray(0,0,10);
        twoDimensionArray.insertValueIntoArray(0,0,20);
        twoDimensionArray.insertValueIntoArray(0,1,30);
        twoDimensionArray.insertValueIntoArray(1,0,40);
        twoDimensionArray.insertValueIntoArray(2,0,50);




        System.out.println(Arrays.deepToString(twoDimensionArray.twoDarray)); // print out the 2 dimensional array

        twoDimensionArray.insertValueIntoArray(3,0,40);

        twoDimensionArray.accessTwoDimensionalArrays(0,0);
        twoDimensionArray.accessTwoDimensionalArrays(0,1);

        twoDimensionArray.accessTwoDimensionalArrays(3,0);

        twoDimensionArray.traverse2Darrays();

        twoDimensionArray.searchElements(50);
        twoDimensionArray.searchElements(70);
        twoDimensionArray.searchElements(30);
        twoDimensionArray.searchElements(80);

        System.out.println(Arrays.deepToString(twoDimensionArray.twoDarray)); // print out the 2 dimensional array

        twoDimensionArray.deleteElement(0,1);
        twoDimensionArray.deleteElement(4,4);

        System.out.println(Arrays.deepToString(twoDimensionArray.twoDarray)); // print out the 2 dimensional array








    }

//    public static void printNumbers(int m){
//        for (int i=0; i<=m; i++){
//            for (int j=0; j<=m; j++){
//                System.out.println(i+ "," +j);
//
//            }
//        }
//        for (int k=0; k<=m; k++){
//            System.out.println(k);
//
//        }
//
//
//    }

    public static void printNumbers2Inputs(int a, int b){
        for (int i=0; i<=a; i++){
            System.out.println(i);

        }
        for (int k=0; k<=b; k++){
            System.out.println(k);

        }

    }

    public static void printNumbersNestedFor(int c, int d){
        for (int i=0; i<=c; i++){
            for (int k=0; k<=d; k++){
                System.out.println(i + " " + k);

            }

        }

    }

    public static int sumNumbers(int n) {
        int m;
        if (n <= 0) {
            return 0;
        }
        m = n + sumNumbers((n - 1));
//        System.out.println(m);
        return m;
    }

    public static int pairSumSequence(int n){
        int total =0;
        for (int i=0; i<=n; i++){
            total = total + pairSum(i,i+1);
        }
        return total;
    }

    public static int pairSum(int a, int b){
        int c;
        c = a + b;
        System.out.println(c);
        return c;
    }

    public static void findTotalNumber(int n){
        int total = 0;
        for (int i=0; i<=n; i++){
            total +=i;
        }
        if(total > 100){
            System.out.println("The total number is greater than 100");
        }
        else {
            System.out.println(total);
        }

    }
}
