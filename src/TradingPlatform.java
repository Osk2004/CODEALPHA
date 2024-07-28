
import java.util.HashMap;
import java.util.Map;

public class TradingPlatform {
    private Map<String, Stock> marketData;
    private Portfolio portfolio;

    public TradingPlatform() {
        marketData = new HashMap<> ();
        portfolio = new Portfolio();
        // Initialize with some sample stocks
        marketData.put("AAPL", new Stock("AAPL", 150.0));
        marketData.put("GOOGL", new Stock("GOOGL", 2800.0));
        marketData.put("MSFT", new Stock("MSFT", 300.0));
    }

    public void displayMarketData() {
        System.out.println("Market Data:");
        for (Stock stock : marketData.values()) {
            System.out.println(stock.getSymbol() + ": $" + stock.getPrice());
        }
    }

    public void buyStock(String symbol, int quantity) {
        Stock stock = marketData.get(symbol);
        if (stock != null) {
            portfolio.buyStock(symbol, quantity);
            System.out.println("Bought " + quantity + " shares of " + symbol);
        } else {
            System.out.println("Stock not found.");
        }
    }

    public void sellStock(String symbol, int quantity) {
        Stock stock = marketData.get(symbol);
        if (stock != null) {
            portfolio.sellStock(symbol, quantity);
            System.out.println("Sold " + quantity + " shares of " + symbol);
        } else {
            System.out.println("Stock not found.");
        }
    }

    public void displayPortfolio() {
        System.out.println("Portfolio:");
        for (Map.Entry<String, Integer> entry : portfolio.getStocks().entrySet()) {
            String symbol = entry.getKey();
            int quantity = entry.getValue();
            double price = marketData.get(symbol).getPrice();
            System.out.println(symbol + ": " + quantity + " shares, $" + (quantity * price));
        }
    }
}
