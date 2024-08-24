import java.util.*;
public class NumberGuessingGame 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
Random rd=new Random();
int lowerBound=1; 
int upperBound=100; 
int targetNumber=rd.nextInt(upperBound-lowerBound+1)+lowerBound;
int maxAttempts=10; 
System.out.println("Welcome to the Number Guessing Game!");
System.out.println("I've picked a number between "+lowerBound+" and "+upperBound+". Can you guess it?");
int attempts=0;
boolean guessedCorrectly = false;
while(attempts<maxAttempts) 
{
System.out.print("Enter your guess: ");
int userGuess=sc.nextInt();
attempts++;
if(userGuess==targetNumber) 
{
guessedCorrectly=true;
break;
} 
else if(userGuess<targetNumber) 
{
System.out.println("Too low! Try a higher number.");
} 
else 
{
System.out.println("Too high! Try a lower number.");
}
}
if(guessedCorrectly) 
{
System.out.println("Congratulations! You guessed the number "+targetNumber+" in "+attempts+" attempts.");
} 
else 
{
System.out.println("Oops! You've reached the maximum number of attempts. The correct number was "+targetNumber+".");
}
sc.close();
}
}
