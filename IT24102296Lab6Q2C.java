import java.util.Scanner;
public class IT24102296Lab6Q2C
{
  public static void main(String[] args)
  {
    System.out.println("Please enter 10 numbers:");
    Scanner input=new Scanner(System.in);
    int[] numbers=new int[10];
    int sum=0;

    for(int i=0; i<10; i++)
    {
      System.out.print("Enter number "+(i+1)+":");
      int number=input.nextInt();
      number[i]=number;
      sum+=number;
    }
    ⁪
    double average=sum/10.0;
    System.out.println();
    System.out.println("The numbers you entered are: ");
    
    for(int i=0; i<10; i++)
    {
      System.out.print(numbers[i]+" ");
    }

    System.out.println();
    System.out.println("Sum of the numbers: "+sum);
    System.out.println("Average of the numbers: "+average);
  }
}
    

    
    
    
   
