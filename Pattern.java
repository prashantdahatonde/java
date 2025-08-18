public class Pattern {
     
    public static void main(int[] args){
        System.out.println("Welcome to pattern printing program");

        for(int i=1; i<=4; i++){
            for(int j=4; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
