import java.util.Arrays;

public class PrintArray {

//    Create 4 overloaded methods called printArray:
//            1. accepts a single dimensional integer array and prints its contents in a single line with a space
//    {1,2,3,4,5} -> 1 2 3 4 5
//            2. accepts a single dimensional character array and prints its contents in a single line without a space
//    {'h','e','l','l','o'} -> hello
// 3. accepts a 2 dimensional String array and prints its contents as a matrix
//    { {"hey","what's","up"},
//        {"hola","que","hondas"},
//        {"como","te","vas"},
//        {"how","do","you", "do"}
//    }
//    hey what's up
//    hola que hondas
//    como te vas
//    how do you do
//            4. accepts a 3 dimensional long array and prints its contents as a matrix
//    {
//        { {21,3,4,5},{11,33,44,22} },
//        { {1,1,1},{2,1,2}, {3,1} },
//        { {9,6},{5,5,5,5}, {99,4,21,11} },
//    }
//        21 3 4 5 11 33 44 22
//                1 1 1 2 1 2 3 1
//                9 6 5 5 5 5 99 4 21 11

    public static void main(String[] args) {
        //Test your methods by passing the given arrays
        int[] arr1;
        printArray(arr1 = new int[]{1, 2, 3, 4, 5});

        System.out.println();

        char[] arr2;
        printArray(arr2 = new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println();

        String[][] arr3;
        printArray(arr3 = new String[][]
                {{"hey", "what's", "up"},
                        {"hola", "que", "hondas"},
                        {"como", "te", "vas"},
                        {"how", "do", "you", "do"}});


        long[][][] arr4;

        printArray(arr4 = new long[][][]{
                {{21, 3, 4, 5}, {11, 33, 44, 22}},
                {{1, 1, 1}, {2, 1, 2}, {3, 1}},
                {{9, 6}, {5, 5, 5, 5}, {99, 4, 21, 11}}
        });
    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void printArray(char[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);

        }
    }

    public static void printArray(String[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void printArray(long[][][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + "\t");
                }
            }
            System.out.println();
        }
    }
}

    
    






