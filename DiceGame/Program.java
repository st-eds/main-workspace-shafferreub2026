import java.util.Scanner;

public class Program 
{
    static int mult = 1;
    static int base = 0;
    static int diceAmount = 1;
    static int points = 0;
    static boolean playing = true;

    public static void main(String[] args) 
    {
        System.out.println("Welcome to my Dice Game!");
        while (playing)
        {
        System.out.println("Points: " + points);
        menu();
        }
    }

    static void menu()
    {   
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number to go to that corresponding place\nMenu:\n");
        System.out.println("1: Roll");
        System.out.println("2: Shop");
        System.out.println("3: Stats");
        System.out.println("4: Rules");
        System.out.println("5: Exit");
        System.out.print("Input: ");
        int choice = input.nextInt();

        switch(choice)
        {
            case 1:
                    rollDice2();
            break;
            case 2:
                    shop();
            break;
            case 3:
                    stats();
            break;
            case 4:
                    rules();
            break;
            case 5:
                    exit();
            break;
            default:
                    error();
            break;
        }
    }
    static int rollDice1()
    {
        return (int) (Math.random() + (1+base))*mult;
    }
    static int rollDice2()
    {
        for (int i = 0; i < diceAmount; i++)
        {
            points += rollDice1();
        }

        return points;
    }
    static int shop()
    {
        return 1; //placeholder
    }
    static void stats()
    {
        System.out.println("Stats:\nMultiplier: " + mult);
        System.out.println("Base Value: " + base);
        return;
    }
    static void rules()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\nRules:\nEach number rolled on a die is equal to 1 point.\nYou can use these points in the shop to upgrade the mult, base value, and the amount of die!");//add different colors for mult, base, and other crap
        System.out.println("\nPress enter to continue...");
        input.nextLine();
    }
    static void exit()
    {
        System.out.println("Thank you for playing!");
        System.exit(0);
    }
    static void error()
    {
        System.out.println("Something went wrong. Please try again.");
        return;
    }
}