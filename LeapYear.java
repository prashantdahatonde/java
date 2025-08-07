import java.util.Scanner;
class LeapYear {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to New year calculator\n");
        System.out.print("Please enter year that you want to check:");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 !=0)){
            System.out.println("Your year is a leap year");
        }else{
            System.out.println("Your year is not a leap year");
        }
    }
}
