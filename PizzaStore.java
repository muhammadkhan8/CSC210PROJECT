public class PizzaStore {
    private String[][] loginInfo = {{"username1", "password1"}, {"username2", "password2"}};
    private String[] items = {"Cheese", "Pepperoni", “pPineapple", "Hawaiian"};
    private double[] prices = {9.99, 11.99, 9.99, 12.99};
    private double taxRate = 0.08;
    public String[] getUsernamePassword() {
        return loginInfo;
    }

    public double getPrice(String item) {
        int index = -1;
        for (int i = 0; i < items.length; i++) {
            if (items[]equals(item)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            return prices[index];
        }
        return -1; // Return -1 if item not found
    }

    public String[] getItems() {
        return items;
    }

    public double calculateCost(int quantity, String item) {
        double price = getPrice(item);
        if (price != -1) {
            return price * quantity;
        }
        return -1; // Return -1 if item not found
    }

    public double calculateTaxes(double cost) {
        return cost * taxRate;
    }

    public double calculateTotalCost(double cost, double tax) {
        return cost + tax;
    }
}
