import java.util.Scanner;

public class Program 
{

    public static void main(String[] args) 
    {
        int point = 0;

        System.out.println("--- CRAPS ---");
        promptRoll();
        int roll = rollDice();

        boolean roundOver = evalutateComeOutRoll(roll);

        if (!roundOver)
        {
            point = roll;
            System.out.println("The point is now " + point + ".");
        }
    }
    static int rollDie()
    {
        return (int)(Math.random()*6) + 1;
    }
    static int rollDice()
    {
      int d1 = rollDie();
      int d2 = rollDie();

      int total = (d1+d2);
      System.out.println("You rolled " + d1 + " & " + d2 + "\nYou got: " + total);
      return total;
    }
    static void promptRoll()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Press Enter to roll... ");
        input.nextLine();
    }
    static boolean evalutateComeOutRoll()
    {
        
    }
}
/*
CRAPS:

2 rounds:
round 1: coming out
1 roll
3 possible outcom:
7 or 11 win
2, 3, or 12: lose
else - point: go to round 2

round 2: point
roll up to SAME NUMBER as many times
7 you lose

*/