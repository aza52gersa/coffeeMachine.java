import java.util.Scanner;

public class coffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400,  milk = 540,  beans = 120;
        int cups = 9, money = 550;
        boolean exit = false;

        while (!exit) {
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit)");
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "buy":
                    int[] buyResult = buyCoffee(water, milk, beans, cups, money);
                    water = buyResult[0];
                    milk = buyResult[1];
                    beans = buyResult[2];
                    cups = buyResult[3];
                    money = buyResult[4];
                    break;
                case "fill":
                    int[] fillResult = fillCoffeeMachine(water, milk, beans, cups, money);
                    water = fillResult[0];
                    milk = fillResult[1];
                    beans = fillResult[2];
                    cups = fillResult[3];
                    money = fillResult[4];
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;
                case "remaining":
                    System.out.printf(
                            """
                            The coffee machine has:
                            %d ml of water
                            %d ml of milk
                            %d g of coffee beans
                            %d disposable cups
                            $%d of money
                            """, water, milk, beans, cups, money);
                    break;
                case "exit":
                    exit = true;
            }
        }
    }

    public static int[] buyCoffee(int water, int milk, int beans, int cups, int money) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String coffeeChoice = scanner.next();

        switch (coffeeChoice) {
            case "1":
                if (water <= 250) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (beans <= 16) {
                    System.out.println("Sorry, not enough beans!");
                    break;
                } else if (cups <= 0) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 250;
                    beans -= 16;
                    cups -= 1;
                    money += 4;
                    break;
                }
            case "2":
                if (water <= 350) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (milk <= 75) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                } else if (beans <= 20) {
                    System.out.println("Sorry, not enough beans!");
                    break;
                } else if (cups <= 0) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    cups -= 1;
                    money += 7;
                    break;
                }

            case "3":
                if (water <= 200) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (milk <= 100) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                } else if (beans <= 12) {
                    System.out.println("Sorry, not enough beans!");
                    break;
                } else if (cups <= 0) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    cups -= 1;
                    money += 6;
                    break;
                }

            case "back":
                return new int[]{water, milk, beans, cups, money};
            }
        return new int[] {water, milk, beans, cups, money};
    }

    public static int[] fillCoffeeMachine(int water, int milk, int beans, int cups, int money) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add: ");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        beans  += scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add: ");
        cups += scanner.nextInt();
        return new int[] {water, milk, beans, cups, money};
    }
}




        /*System.out.print("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();

        System.out.print("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();

        System.out.print("Write how many grams of coffee beans the coffee machine has: ");
        int beans = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need: ");
        int userInput = scanner.nextInt();

        int waterCups = water / 200;
        int milkCups = milk / 50;
        int beansCups = beans / 15;
        int coffeeMachineCups = Math.min(waterCups, milkCups);
        int result = Math.min(coffeeMachineCups, beansCups);

        if (userInput - result == 0) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (result > userInput) {
            int moreCups = result - userInput;
            System.out.printf("Yes, I can make that amount of coffee (and even " + moreCups + " more than that)");
        } else {
            System.out.printf("No, I can make only %d cup(s) of coffee" , result);
        }*/
