
import java.util.Scanner;
public class Sum {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcom to your Calculator");
        System.out.print("Please enter first number:");
        int firstNum = input.nextInt();
        System.out.print("Now , please enter second number:");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Sum of your number is:"+sum);

        System.out.println("thanks for using our calculator");
    }
    
}
