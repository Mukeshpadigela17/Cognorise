import java.util.*;
public class HangmanGame 
{
public static void main(String[] args) 
{
String[] words={"apple","banana","chocolate","elephant","giraffe"};
Random rd=new Random();
String selectedWord=words[rd.nextInt(words.length)];
int maxAttempts = 6; 
StringBuilder guessedWord=new StringBuilder("_".repeat(selectedWord.length()));
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to Hangman!");
System.out.println("Guess the word: "+guessedWord);
int attempts=0;
while(attempts<maxAttempts) 
{
System.out.print("Enter a letter: ");
char guess=sc.next().charAt(0);
boolean found=false;
for(int i=0;i<selectedWord.length();i++) 
{
if(selectedWord.charAt(i)==guess) 
{
guessedWord.setCharAt(i,guess);
found=true;
}
}
if(!found) 
{
attempts++;
System.out.println("Incorrect guess! Attempts left: "+(maxAttempts-attempts));
}
System.out.println("Current progress: "+guessedWord);
if(guessedWord.toString().equals(selectedWord)) 
{
System.out.println("Congratulations! You've guessed the word: "+selectedWord);
break;
}
}
if(attempts==maxAttempts) 
{
System.out.println("Oops! You've run out of attempts. The word was: "+selectedWord);
}
sc.close();
}
}
