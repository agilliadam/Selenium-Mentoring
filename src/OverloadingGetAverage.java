public class OverloadingGetAverage {
//
//    Create 2 overloaded methods called getAverage:
//            1. accepts an integer array and returns the average of its all values
//    {3,2,5,1,6} -> 3  (17/5)
//            2. accepts a double array and returns the average of its all values
//    {2.3 ,6.1 , 9.1 , 2.9} -> 5.1

        public static void main(String[] args) {
            //Test your methods by passing the given array
            int[] arr1 = {3,2,5,1,6};
            double [] arr2 = {2.3 ,6.1 , 9.1 , 2.9};

            System.out.println("Average with int: " + getAverage(arr1 =new int[]{3, 2, 5, 1, 6}));

            System.out.println("Average with double: " + getAverage(arr2=new double[]{2.3 ,6.1 , 9.1 , 2.9}));
        }

    public static int getAverage(int[] arr) {

        int sum = 0;
        int average = 0;

        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];

            average = sum / arr.length;

        } return average;
    }

    public static double getAverage(double[] arr) {

        double sum = 0;
        double average = 0.0;

        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];

            average = 1.0 * sum / arr.length;

        }
        return average;
    }
}








