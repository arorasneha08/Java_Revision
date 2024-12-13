import java.util.Scanner;

public class practice {

    public class PizzaShop {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean continueOrdering = true;

            System.out.println("Welcome to the Pizza Shop!");

            while (continueOrdering) {
                double totalCost = 0;

                // Display pizza menu
                System.out.println("\nPizza Menu:");
                System.out.println("1. Margherita - $8");
                System.out.println("2. Pepperoni - $10");
                System.out.println("3. Veggie - $9");
                System.out.println("4. BBQ Chicken - $12");
                System.out.print("Enter your choice (1-4): ");
                int pizzaChoice = scanner.nextInt();

                double pizzaPrice = 0;
                switch (pizzaChoice) {
                    case 1 -> {
                        pizzaPrice = 8;
                        System.out.println("You selected Margherita Pizza.");
                    }
                    case 2 -> {
                        pizzaPrice = 10;
                        System.out.println("You selected Pepperoni Pizza.");
                    }
                    case 3 -> {
                        pizzaPrice = 9;
                        System.out.println("You selected Veggie Pizza.");
                    }
                    case 4 -> {
                        pizzaPrice = 12;
                        System.out.println("You selected BBQ Chicken Pizza.");
                    }
                    default -> {
                        System.out.println("Invalid choice! Please start over.");
                        continue;
                    }
                }

                // Select size
                System.out.println("\nSelect the size of your pizza:");
                System.out.println("1. Small - $2");
                System.out.println("2. Medium - $4");
                System.out.println("3. Large - $6");
                System.out.print("Enter your choice (1-3): ");
                int sizeChoice = scanner.nextInt();

                double sizePrice = 0;
                switch (sizeChoice) {
                    case 1 -> {
                        sizePrice = 2;
                        System.out.println("You selected Small size.");
                    }
                    case 2 -> {
                        sizePrice = 4;
                        System.out.println("You selected Medium size.");
                    }
                    case 3 -> {
                        sizePrice = 6;
                        System.out.println("You selected Large size.");
                    }
                    default -> {
                        System.out.println("Invalid choice! Please start over.");
                        continue;
                    }
                }

                // Add toppings
                double toppingsCost = 0;
                boolean addingToppings = true;
                while (addingToppings) {
                    System.out.println("\nDo you want to add toppings?");
                    System.out.println("1. Cheese - $1");
                    System.out.println("2. Olives - $1.5");
                    System.out.println("3. Mushrooms - $2");
                    System.out.println("4. Bacon - $3");
                    System.out.println("5. No more toppings");
                    System.out.print("Enter your topping choice (1-5): ");
                    int toppingChoice = scanner.nextInt();

                    switch (toppingChoice) {
                        case 1 -> {
                            toppingsCost += 1;
                            System.out.println("You added Cheese.");
                        }
                        case 2 -> {
                            toppingsCost += 1.5;
                            System.out.println("You added Olives.");
                        }
                        case 3 -> {
                            toppingsCost += 2;
                            System.out.println("You added Mushrooms.");
                        }
                        case 4 -> {
                            toppingsCost += 3;
                            System.out.println("You added Bacon.");
                        }
                        case 5 -> {
                            addingToppings = false;
                            System.out.println("No more toppings added.");
                        }
                        default -> System.out.println("Invalid choice! Please select a valid option.");
                    }
                }

                // Calculate total cost
                totalCost = pizzaPrice + sizePrice + toppingsCost;
                System.out.printf("\nYour total cost is: $%.2f\n", totalCost);

                // Prompt for another order
                System.out.println("\nWould you like to order another pizza?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                System.out.print("Enter your choice (1-2): ");
                int anotherOrderChoice = scanner.nextInt();

                if (anotherOrderChoice == 2) {
                    continueOrdering = false;
                    System.out.println("Thank you for your order! Have a great day!");
                }
            }

            scanner.close();
        }
    }

}
