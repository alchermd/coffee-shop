package coffeeshop;

import javax.swing.JCheckBox;


/**
 * Represents a product being sold.
 */
class Product {
    private String name;
    private int price;
    private JCheckBox checkBox;
    
    public Product(String name, int price, JCheckBox checkBox) {
        this.name = name;
        this.price = price;
        this.checkBox = checkBox;
    }
}
