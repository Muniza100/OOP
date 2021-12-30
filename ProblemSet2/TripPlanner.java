import java.util.Scanner;

public class TripPlanner {
    public static void main(String [] args) {
        // Part 1: Greeting
        greeting();

        // Part 2: Travel Time and Budget
        travelTimeBudget();

        // Part 3: Time difference
        timeDifference();

        // Part 4: Country Area
        countryArea();
    }

    public static void greeting(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to Vacation Planner!\nWhat is your name: ");
        String name = scanner.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you traveling to? ");
        String destination = scanner.nextLine();
        System.out.println("Great! " + destination + " sounds like a great trip\n***********");
    }

    private static void travelTimeBudget(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many days are you going to spend traveling? ");
        int days = scanner.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip: ");
        float usdMoney = scanner.nextFloat();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currencySymbol = scanner.next();
        System.out.print("How many " +
                currencySymbol + " are there in 1 USD? ");
        float currencyValue = scanner.nextFloat();

        float usdMoneyPerDay = (usdMoney/days) * 100;
        usdMoneyPerDay = (int) usdMoneyPerDay;
        float currencyValueMoneyPerDay = ((usdMoney*currencyValue)/days) * 100;
        currencyValueMoneyPerDay = (int) currencyValueMoneyPerDay;
        int usdMoneyToPrint = (int) usdMoney;

        System.out.println("\nIf you are traveling for " +
                days + " days that is same as " +
                (days * 24) + " hours or " +
                (days * 24 * 60) + " minutes or " +
                (days * 24 * 60 * 60) + " seconds.");
        System.out.println("If you are going to spend $" +
                usdMoneyToPrint + " USD that means per day you can spend up to $" +
                usdMoneyPerDay/100.0 + " USD");
        System.out.println("Your total budget in " +
                currencySymbol + " is " +
                usdMoney * currencyValue + " " +
                currencySymbol + ", which per day is " +
                currencyValueMoneyPerDay/100.0 + " " +
                currencySymbol);
        System.out.println("***********");
    }

    public static void timeDifference(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int hoursDifference = scanner.nextInt();
        int midnightDifference = 0;
        if (hoursDifference < 0) {
            midnightDifference = 24;
        }
        System.out.println("That means that when it is midnight at home it will be " +
                (midnightDifference + hoursDifference)%24 +
                ":00 in your travel destination and when it's noon at home it will be " +
                (12 + hoursDifference)%24 + ":00");
        System.out.println("***********");
    }

    public static void countryArea(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is square area of your destination country in km2? ");
        int kmArea = scanner.nextInt();

        double miArea = (kmArea * 0.38610215854245) * 100;
        miArea = (int) miArea;

        System.out.println("In miles2 that is " +
                miArea/100);
        System.out.println("***********");
    }
}