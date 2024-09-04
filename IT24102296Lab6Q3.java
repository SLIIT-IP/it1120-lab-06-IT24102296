import java.util.Scanner;
public class IT24102296Lab6Q3
{
   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);
      int count=0;
      double sumOfsquares=0.0;
      
      System.out.println("Enter positive integer (terminate input with -99)");
      while(true)
      {
	System.out.print("Enter a number:");
	int number=input.nextInt();

	if(number==-99)
	{
	  break;
	}
	if(number<0)
	{
	  System.out.println("Invalid input. Please enter a positive integer 0r -99 to terminate.");
	  continue;
	}
        sumOfsquares+= Math.pow(number,2);
	count++;
	}
	
	double rms= Math.sqrt(sumOfsquares/count);
        System.out.println("The Root Mean Square (RMS) is: "+rms);

   }
}