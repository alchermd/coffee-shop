package coffeeshop;

import javax.swing.JCheckBox;


/**
 * Represents a product being sold.
 */
class Product {
    private final String name;
    private final int price;
    private final JCheckBox checkBox;
    
    public Product(String name, int price, JCheckBox checkBox) {
        this.name = name;
        this.price = price;
        this.checkBox = checkBox;
    }
    
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public JCheckBox getCheckBox() {
        return checkBox;
    }
}
