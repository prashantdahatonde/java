import java.util.Scanner;

public class Relational {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter youe age:");
        int age = input.nextInt();

        if (age >= 18){

            System.out.println("you are eligiable to drive");
        }
        else{
            System.out.println("Beta cycle chala lo");
        }

        }
    }