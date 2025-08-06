import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the World of Three\n");
        System.out.print("Please enter first number:");
        int first = input.nextInt();
        System.out.print("Now please enter second number:");
        int second = input.nextInt();
        System.out.print("Finally, please enter third number:");
        int third = input.nextInt();

        if (first >= second && first >= third){
            System.out.println(first + " is the greatest number");

        }
        else if (second >= first && second >= third){
            System.out.println(second + "is the greatest number");
        }
        else{
            System.out.println(third + " is the greatest number");
        }
    }
        
    }

