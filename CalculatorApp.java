import java.util.Scanner;
public class CalculatorApp 
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
try 
{
System.out.print("Enter the first number: ");
double num1=sc.nextDouble();
System.out.print("Enter the operator (+, -, *, /): ");
char operator=sc.next().charAt(0);
System.out.print("Enter the second number: ");
double num2=sc.nextDouble();
double result;
switch(operator) 
{
case '+':result = num1 + num2;break;
case '-':result = num1 - num2;break;
case '*':result = num1 * num2;break;
case '/':
if (num2 == 0) 
{
System.out.println("Error: Division by zero is not allowed.");
return;
}
result=num1/num2;
break;
default:
System.out.println("Invalid operator. Please use +, -, *, or /.");
return;
}
System.out.println("Result: " + result);
} 
catch(Exception e) 
{
System.out.println("An error occurred. Please check your input.");
} 
finally 
{
sc.close();
}
}
}
