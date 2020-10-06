import java.util.Scanner;
/**
 *Determines factors of a number
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
     //create a Scanner
     Scanner input = new Scanner(System.in);
     //declare a variable 
       int userNum;
     //declare a variable to count
       int count = 1; 
     //craete a loop to force the user to type in a positive number 
        do{
          
          System.out.println("Please enter a positive integer to determine its factors:");
           userNum = input.nextInt();
       }while(userNum <= 0);
     
      //tell user the factors of their number
       System.out.println("The factors of " + userNum + " are:");
     
      //loop stsement for the calculation of factors
       while(userNum >= count){
       if(userNum % count == 0){
         System.out.println(count);
      }
         count = count + 1;
      }
           
  
  }
}

       


    
     

    

