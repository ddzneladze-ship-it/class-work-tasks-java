// Pizza class with toppings, diameter (in inches) and price
// Must-have comments are included for important members.
public class Pizza {
    // toppings description
    private String toppings;
    // diameter in inches
    private int diameter;
    // price in dollars
    private double price;

    // Getter for toppings
    public String getToppings() {
        return toppings;
    }

    // Setter for toppings
    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    // Getter for diameter
    public int getDiameter() {
        return diameter;
    }

    // Setter for diameter
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Override toString to present the pizza information
    @Override
    public String toString() {
        return "Pizza{toppings='" + toppings + "', diameter=" + diameter + ", price=" + String.format("%.2f", price) + "}";
    }
}
