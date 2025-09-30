import java.util.Scanner;

public class Program 
{
    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter your height in inches: ");
      int inches = input.nextInt();

      int feet = inches/12;
      int remainder = inches%12;

      System.out.println("Your height is " + feet + " feet " + remainder + " inches.");

      
    }
}