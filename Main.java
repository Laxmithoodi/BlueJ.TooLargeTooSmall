
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.Scanner;
public class Main
{
    // instance variables - replace the example below with your own
    //private int x;

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
        //x = 0;
         guessnumb();
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void guessnumb()
    {
        // put your code here
        final int num =10;
        int numberToGuess; 
        int guess;
        int count =0;
        boolean result = false;
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        numberToGuess = rand.nextInt(num)+1;
        
        while(result == false)
        {
            System.out.println( "Enter Guess number: " );
            guess = input.nextInt();
            if(guess>numberToGuess)
            {
                System.out.println("Your guess is too large");
            }
            else if(guess<numberToGuess)
            {
                System.out.println("Your guess is too small");
            }
            else
            {
                System.out.println("Your guess is correct");
                
                result=true;
                
            }
            count++;
        
        }
        
        System.out.println("Number of tries" +count); 
        //return numberToGuess;
        //return x + y;
    }
}
