/**
 * 
 * @ Joshua Gonsalves
 * Craps Game
 * 
 */
import java.util.Scanner;
public class CrapsTest {

	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the craps game!");
		System.out.println("The rules go as follows:");
		System.out.println("If a 7 or an 11 is rolled  first, you win.");
		System.out.println("If a 2 or a 12 is rolled first, you lose.");
		System.out.println("If you roll anything else, that becomes your point");
		System.out.println("On subsequent rolls, a 7 will make you lose, while getting your point will make you win.");
		System.out.println("Please press enter to roll:");
		in.nextLine();
		
		int roll1 = dice1.roll();
		int roll2 = dice2.roll();
		int sum = roll1+roll2;
		String choice = "Yes";
		
		while (choice.equals("Yes"))
		{
		if  (sum == 7)
		{
			System.out.println("You rolled a " + sum + ", so you won!");
			System.out.println("If you want to play again, type Yes. If you don't, type No: ");
			choice = in.next();
			in.nextLine();
			while (!choice.equals("Yes") && (!choice.equals("No")))
			{
				System.out.println("You entered the wrong string. Please enter it again: ");
				choice = in.next();
				in.nextLine();
			}
		}
		else if (sum == 11)	
		{
			System.out.println("You rolled a " + sum + ", so you won!");
			System.out.println("If you want to play again, type Yes. If you don't, type No: ");
			choice = in.next();
			in.nextLine();
			while (!choice.equals("Yes") && (!choice.equals("No")))
			{
				System.out.println("You entered the wrong string. Please enter it again: ");
				choice = in.next();
				in.nextLine();
			}
		}
		else if (sum == 2)
		{
			System.out.println("You rolled a " + sum + ", so you lost.");
			System.out.println("If you want to play again, type Yes. If you don't, type No: ");
			choice = in.next();
			in.nextLine();
			while (!choice.equals("Yes") && (!choice.equals("No")))
			{
				System.out.println("You entered the wrong string. Please enter it again: ");
				choice = in.next();
				in.nextLine();
			}
		}
		else if (sum == 12)
		{	
			System.out.println("You rolled a " + sum + ", so you lost.");
			System.out.println("If you want to play again, type Yes. If you don't, type No: ");
			choice = in.next();
			in.nextLine();
			while (!choice.equals("Yes") && (!choice.equals("No")))
			{
				System.out.println("You entered the wrong string. Please enter it again: ");
				choice = in.next();
				in.nextLine();
			}
		}
		else if (sum > 2 || sum < 7 || sum > 7 || sum < 11)
		{
			int point = sum;
			System.out.println("You rolled a " + sum + ". That is now your point.");
			System.out.println("Press enter to roll again: ");
			in.nextLine();
			roll1 = dice1.roll();
			roll2 = dice2.roll();
			sum = roll1 + roll2;
			
			while (point != sum && sum != 7)
			{
				System.out.println("You rolled a " + sum + ". Keep trying!");
				System.out.println("Press enter to roll again: ");
				in.nextLine();
				roll1 = dice1.roll();
				roll2 = dice2.roll();
				sum = roll1 + roll2;
			}
			
			if (sum == 7)
			{
				System.out.println("You rolled a " + sum + ". You lost.");
				System.out.println("If you want to play again, type Yes. If you don't, type No: ");
				choice = in.next();
				in.nextLine();
				while (!choice.equals("Yes") && (!choice.equals("No")))
				{
					System.out.println("You entered the wrong string. Please enter it again: ");
					choice = in.next();
					in.nextLine();
				}
			}
			
			if (point == sum)
			{
				System.out.println("You rolled a " + sum + "! You won! Press enter to continue: ");
				System.out.println("If you want to play again, type Yes. If you don't, type No: ");
				choice = in.next();
				in.nextLine();
				while (!choice.equals("Yes") && (!choice.equals("No")))
				{
					System.out.println("You entered the wrong string. Please enter it again: ");
					choice = in.next();
					in.nextLine();
				}
			}
		}
			
			roll1 = dice1.roll();
			roll2 = dice2.roll();
			sum = roll1 + roll2;
		}
		
		if (choice.equals("No"))
		{
			System.out.println("Thanks for playing!");
		}
		
	}

}
