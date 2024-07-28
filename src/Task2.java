import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        TradingPlatform tradingPlatform = new TradingPlatform();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Display Market Data");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. Display Portfolio");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option;
            try {
                option = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (option) {
                    case 1:
                        tradingPlatform.displayMarketData();
                        break;
                    case 2:
                        System.out.print("Enter stock symbol to buy: ");
                        String buySymbol = scanner.nextLine();
                        System.out.print("Enter quantity to buy: ");
                        int buyQuantity = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        tradingPlatform.buyStock(buySymbol, buyQuantity);
                        break;
                    case 3:
                        System.out.print("Enter stock symbol to sell: ");
                        String sellSymbol = scanner.nextLine();
                        System.out.print("Enter quantity to sell: ");
                        int sellQuantity = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        tradingPlatform.sellStock(sellSymbol, sellQuantity);
                        break;
                    case 4:
                        tradingPlatform.displayPortfolio();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the buffer
            }
        }
    }
}
