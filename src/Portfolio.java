
import java.util.HashMap;
import java.util.Map;

public class Portfolio {
    private Map<String, Integer> stocks;

    public Portfolio() {
        stocks = new HashMap<> ();
    }

    public void buyStock(String symbol, int quantity) {
        stocks.put(symbol, stocks.getOrDefault(symbol, 0) + quantity);
    }

    public void sellStock(String symbol, int quantity) {
        if (stocks.containsKey(symbol)) {
            int currentQuantity = stocks.get(symbol);
            if (currentQuantity >= quantity) {
                stocks.put(symbol, currentQuantity - quantity);
                if (stocks.get(symbol) == 0) {
                    stocks.remove(symbol);
                }
            } else {
                System.out.println("Not enough stock to sell.");
            }
        } else {
            System.out.println("Stock not found in portfolio.");
        }
    }

    public Map<String, Integer> getStocks() {
        return stocks;
    }
}
