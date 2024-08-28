import java.util.Scanner;
public class IT24102296Lab6Q1
{
  public static void main(String[] args)
  {
  Scanner input=new Scanner(System.in);
  double number;
  System.out.println("Enter a number :");
  number=input.nextDouble();

  double square=(number*number);
  double squareRoot=Math.sqrt(number);

  System.out.println("The square of "+number+" is :"+square);
  System.out.println("The square root of "+number+" is :"+squareRoot);
  }
} 