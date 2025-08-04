public class LearningIf {
    
    public static void main(String[] args) {
        
        boolean isMale = true;
        String name = "Bob";

        System.out.println("before if");

        if(isMale){
            System.out.println("Mr." + name);

        }
        System.out.print("after if");

        boolean isSeniorcitizen = false;
        boolean isAdult = false;

        if(isSeniorcitizen){
            System.out.println("Hello senior citizen");

        } 
    else{
            if(isAdult){
                System.out.println("Hello adult");

            }
    else{System.out.println("Hello Child");
         
          }
        }
    }
    
}
