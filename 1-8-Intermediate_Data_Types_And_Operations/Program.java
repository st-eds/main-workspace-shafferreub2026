import java.util.Scanner;

public class Program 
{
    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);

      System.out.println("Task 1: Increment, Decrement, and Compound Assignment");
      
      int score = 10;
      System.out.println("Initial score: " + score);

      score += 5;
      System.out.println("Score after += 5: " + score);

      score++;
      System.out.println("Score after ++: " + score);

      score--;
      System.out.println("Score after --: " + score);

      System.out.println("\nPress enter to continue...");
      input.nextLine();

      //New task

      System.out.println("Task 2: Type Casting");

      double price = 29.99;
      System.out.println("Original price (double) " + price);

      int intPrice = (int) price;
      System.out.println("Price after casting to int: " + intPrice);

      int items = 3;
      double average = (double) intPrice / items;
      System.out.println("Average price with explicit casting: " + average);
      
      System.out.print("\nPress enter to continue...");
      input.nextLine();

      //Next task

      System.out.println("Task 3: The Math Class and Constants");

      final double PI = 3.14159265;
      int radius = 5;

      double area = PI * Math.pow(radius,2);
      System.out.println("Area of circle with radius " + radius + ":" + area);

      int diceRoll = (int)(Math.random() * 6) + 1;
      System.out.println("Random dice roll: " + diceRoll);

      System.out.println("\nPress enter to continue...");
      input.nextLine();

      //New Task

      System.out.println("Task 4: Escape Characters");

      String table = "Item\t\tPrine\nKeyboard\t$75\nMouse\t\t$25";
      System.out.println(table);

      String message = "He said, \"Hello, world!\"\nAnd the program responded, 'Hi.'";
      System.out.println(message);

      System.out.println("Press enter to continue");
      input.nextLine();

      // New Task

      System.out.println("Task 5: Challenge Task (Combining Concepts)");

      int totalStudents = 15;
      final double GRADE_INCREASE = 1.05;
      double newGrade = 80;

      newGrade *= GRADE_INCREASE;

      long roundedGrade = Math.round(newGrade);

      String finalMessage = "Out of " + totalStudents + " students, the new rounded grade is: " + roundedGrade + ".\n\tThis is a " + (GRADE_INCREASE -1)*100 + "% increase.";
      System.out.println(finalMessage);
    }
}