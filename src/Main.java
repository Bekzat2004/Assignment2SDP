import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Burger myBurger = new BasicBurger();
        System.out.println("Welcome to burger builder tool!");
        System.out.println("Do you want to start? (1 for yes, 0 for no)");
        int startChoice = scanner.nextInt();
        if (startChoice == 1) {
            System.out.println("Excellent!");
            System.out.println("Do you want to add extra cutlet? (1 for yes, 0 for no)");
            int cutletChoice = scanner.nextInt();
            if (cutletChoice == 1) {
                myBurger = new CutletDecorator(myBurger);
            }
            System.out.println("Do you want to add cheese? (1 for yes, 0 for no)");
            int cheeseChoice = scanner.nextInt();
            if (cheeseChoice == 1) {
                myBurger = new CheeseDecorator(myBurger);
            }
            System.out.println("Do you want to add tomato? (1 for yes, 0 for no)");
            int tomatoChoice = scanner.nextInt();
            if (tomatoChoice == 1) {
                myBurger = new TomatoDecorator(myBurger);
            }
            System.out.println("Do you want to add salad? (1 for yes, 0 for no)");
            int saladChoice = scanner.nextInt();
            if (saladChoice == 1) {
                myBurger = new SaladDecorator(myBurger);
            }
        }
        System.out.println("Burger Description: " + myBurger.getDescription());
        System.out.println("Total Cost: " + myBurger.getCost() + " tenge");
    }
}


