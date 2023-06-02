import java.util.Scanner;

public class coffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write how many cups of coffee you will need: ");
        int userInput = scanner.nextInt();
        int water = userInput * 200;
        int milk = userInput * 50;
        int beans = userInput * 15;
        System.out.printf("""
                For %d cups of coffee you will need:
                %d ml of water
                %d ml of milk
                %d g of coffee beans
                """ , userInput, water, milk, beans);
        //
    }
}
