package budget;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        double cost = 0;
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            String price = input.substring(input.lastIndexOf("$") + 1);
            cost += Double.parseDouble(price);
            System.out.println(input);
        }
        System.out.println("Total: $" + cost);

    }
}
