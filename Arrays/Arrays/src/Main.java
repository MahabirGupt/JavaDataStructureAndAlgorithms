import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Printing a 1D Array
        int marks5[] = { 25, 30, 50, 10, 5 };
        System.out.println(marks5); //[I@6db3f829
//        To print 1 dimensional arrays need to use Arrays.toString

         System.out.println(Arrays.toString(marks5));//[25, 30, 50, 10, 5]
        System.out.println();

//        Printing a 2D Array
        int[][] matrix3 = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(matrix3); //[[I@1d5a0305
         System.out.println(Arrays.toString(matrix3)); //[[I@6db3f829, [I@42698403]
//        To print 2 dimensional arrays need to use Arrays.deepToString
        System.out.println( Arrays.deepToString(matrix3));//[[1, 2, 3], [4, 5, 6]]
        System.out.println();

//        matrix3[0] is a 1D Array
        System.out.println(matrix3[0]);//[I@86c347
         System.out.println(Arrays.toString(matrix3[0]));//[1, 2, 3]
        System.out.println();

        int[] numbers1 = { 1, 2, 3 };
        int[] numbers2 = { 4, 5, 6 };
        System.out.println(Arrays.equals(numbers1, numbers2)); //false
        int[] numbers3 = { 1, 2, 3 };
        System.out.println(Arrays.equals(numbers1, numbers3)); //true
        System.out.println();

        // Sorting An Array
        int rollNos[] = { 12, 5, 7, 9 };
        Arrays.sort(rollNos);
        System.out.println(Arrays.toString(rollNos));// [5, 7, 9, 12]

        // Array of Objects(ArrayOnHeap.xls)
        Person[] persons = new Person[3];

        // Creating an array of Persons creates
        // 4 Reference Variables to Person
        // It does not create the Person Objects
        // ArrayOnHeap.xls
        System.out.println(persons[0]);// null

        // to assign objects we would need to create them
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();

        // Other way
        // How may objects are created?
        Person[] personsAgain = { new Person(), new Person(), new Person() };

        // How may objects are created?
        Person[][] persons2D = { { new Person(), new Person(), new Person() },
                { new Person(), new Person() } };

    }
}
