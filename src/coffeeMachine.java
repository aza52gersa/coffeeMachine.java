import java.util.Scanner;

public class coffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write how many ml of water the coffee machine has: ");
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
        }
    }
}
