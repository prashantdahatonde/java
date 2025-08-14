public class ArrayNumberAverage {
    public static void main(String[] args){
        System.out.println("Welcome to Array sum and average");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        int avg = average(numArray);
        System.out.println("sumof the numbers is:" + sum);
        System.out.println("Average of the numbers is:" + avg);
    }

    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while (i < numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static int average(int[] numberArray){
        long sum = sum(numArray);
        return (int) (sum / numArray.length);
       
    }
}
