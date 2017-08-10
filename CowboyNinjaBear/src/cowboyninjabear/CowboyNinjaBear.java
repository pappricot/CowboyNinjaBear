
package cowboyninjabear;

import java.util.Scanner;

/**
 * Due date by 2/2/17
 * Assignment #3: Cowboy Ninja Bear
 * @author Anh Nguyen (Anya)
 */
public class CowboyNinjaBear {

    public static void main(String[] args) {
        
       // Assign two variables to count user's wins and computer's wins 
       int ComputerWon = 0;
       int YouWon = 0;
       
       // for loop starts
       for (int i = 0; i < 5; i++) { 
       final int OPTION1 = 1;
       final int OPTION2 = 2;
       final int OPTION3 = 3;
       
       Scanner in = new Scanner(System.in);
      
       // User's pick
       System.out.print("Enter one of the numbers to represent your choice: 1 for Bear, 2 for Ninja, 3 for Cowboy = ");
       int userGuess = in.nextInt();
       String choice = "";
       switch(userGuess) {
           case OPTION1: choice = "Option 1"; break;
           case OPTION2: choice = "Option 2"; break;
           case OPTION3: choice = "Option 3"; break;
           default: choice = "unknown";
        } System.out.println("You picked " + choice);
        
        
        //Computer's pick
        int computerGuess = (int)(Math.random() * 3) + 1;
        System.out.println("Computer's choice is OPTION " + computerGuess);
        
        //Counting
        
        if (userGuess == computerGuess) {
           i--; 
        }
        else if (userGuess < computerGuess) {
           ComputerWon++;
           System.out.println("You lost..");
        } 
        else if (userGuess > computerGuess) {
            YouWon++;
            System.out.println("You won!");
        }
        
        }
       System.out.println("Computer won " + ComputerWon + " times");
       System.out.println("You won " + YouWon + " times");
       
       // count overall wins
       if (ComputerWon > YouWon) {
           System.out.println("Computer won!");
       }
       else if (ComputerWon < YouWon) {
           System.out.println("You won!");
       }
        
    }
    
}
