/*
 * Name: Miriam Monroe
 * Title: Guessing Game
 * Date: 9/27 
*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class GuessingGame
{
	public static void main(String[]args)
	{
		int guess = 0;
		int amtofguess = 0;
		int answer = (int)(Math.random()*100 + 3);
		boolean isNumber = false;
		Scanner input = new Scanner(System.in);
		
		while(guess != answer)
		{
			isNumber = false;
			
			while(!isNumber)
			{
				
				try
				{
					System.out.println("What is your number?");
					System.out.println("You took" + amtofguess + "guess(es)" );
					guess = input.nextInt();	
					isNumber = true;
					
				}
				catch(InputMismatchException e)
				{
					System.out.println("That was error type" + e);
				}
			}
		}
	}
}

