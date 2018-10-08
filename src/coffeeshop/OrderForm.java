package coffeeshop;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class OrderForm extends javax.swing.JFrame {
    ArrayList<Product> products = new ArrayList<>();
    DefaultListModel<String> selectedProductsNames = new DefaultListModel<>();
    
    /**
     * Creates new form OrderForm
     */
    public OrderForm() {
        initComponents();
        initProducts();
    }
    
    /**
     * Initialize the products ArrayList.
     */
    private void initProducts() {
        products.add(new Product("Caffe Latte",  50, caffeLatteItem));
        products.add(new Product("Cappucino",    50, cappucinoItem));
        products.add(new Product("Espresso",     60, espressoItem));
        products.add(new Product("Flat White",   90, flatWhiteItem));
        products.add(new Product("Long Black",   50, longBlackItem));
        products.add(new Product("Macchiato",    60, macchiatoItem));
        products.add(new Product("Mochacinno",   80, mochacinnoItem));
        products.add(new Product("Irish Coffee", 90, irishCoffeeItem));
    }
    
    /**
     * Unselect all products.
     */
    private void unselectAll() {
        for (Product product: products) {
            product.getCheckBox().setSelected(false);
        }
    }
    
    
    /**
     * Compute the total price of the products ordered.
     */
    private int computeTotal() {
        int total = 0;
        for (int i = 0; i < selectedProductsNames.size(); i++) {
            for (int j = 0; j < products.size(); j++) {
                if (products.get(j).getName().equals(selectedProductsNames.get(i))) {
                    total += products.get(j).getPrice();
                }
            }
        }
        
        totalLabel.setText(Integer.toString(total));
        return total;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        caffeLatteItem = new javax.swing.JCheckBox();
        cappucinoItem = new javax.swing.JCheckBox();
        espressoItem = new javax.swing.JCheckBox();
        flatWhiteItem = new javax.swing.JCheckBox();
        irishCoffeeItem = new javax.swing.JCheckBox();
        longBlackItem = new javax.swing.JCheckBox();
        macchiatoItem = new javax.swing.JCheckBox();
        mochacinnoItem = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        productsOrderList = new javax.swing.JList<>();
        addButton = new javax.swing.JButton();
        clearListButton = new javax.swing.JButton();
        removeItemButton = new javax.swing.JButton();
        unselectAllButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        paymentField = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        checkoutButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        changeField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Riza's Coffee Shop");

        jLabel2.setText("Menu for Today");

        caffeLatteItem.setText(" (50) Caffe Latte");

        cappucinoItem.setText(" (50) Cappucino");

        espressoItem.setText(" (60) Espresso");

        flatWhiteItem.setText(" (90) Flat White");

        irishCoffeeItem.setText(" (90) Irish Coffee");

        longBlackItem.setText(" (50) Long Black");

        macchiatoItem.setText(" (60) Macchiato");

        mochacinnoItem.setText(" (80) Mochaccino");

        jScrollPane1.setViewportView(productsOrderList);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        clearListButton.setText("Clear");
        clearListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearListButtonActionPerformed(evt);
            }
        });

        removeItemButton.setText("Remove");
        removeItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemButtonActionPerformed(evt);
            }
        });

        unselectAllButton.setText("Unselect All");
        unselectAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unselectAllButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Total:");

        jLabel4.setText("Payment:");

        totalLabel.setText("0");

        checkoutButton.setText("Checkout");
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Your change is:");

        changeField.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cappucinoItem)
                                    .addComponent(caffeLatteItem)
                                    .addComponent(espressoItem)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(addButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(flatWhiteItem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(macchiatoItem)
                                    .addComponent(longBlackItem)
                                    .addComponent(mochacinnoItem)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(unselectAllButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(irishCoffeeItem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(removeItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(50, 50, 50)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(paymentField)
                                    .addComponent(clearListButton, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                            .addComponent(checkoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(changeField))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(caffeLatteItem)
                                .addGap(18, 18, 18)
                                .addComponent(cappucinoItem)
                                .addGap(18, 18, 18)
                                .addComponent(espressoItem)
                                .addGap(18, 18, 18)
                                .addComponent(flatWhiteItem))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(longBlackItem)
                                .addGap(18, 18, 18)
                                .addComponent(macchiatoItem)
                                .addGap(18, 18, 18)
                                .addComponent(mochacinnoItem)
                                .addGap(18, 18, 18)
                                .addComponent(irishCoffeeItem))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(unselectAllButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeItemButton)
                            .addComponent(clearListButton))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(totalLabel))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(paymentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkoutButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(changeField))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Add the selected products onto the orders list.
     * 
     * @param evt 
     */
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        for (Product product: products) {
            if (product.getCheckBox().isSelected()) {
                selectedProductsNames.addElement(product.getName());
            }
        }
        
        productsOrderList.setModel(selectedProductsNames);
        unselectAll();
        computeTotal();
    }//GEN-LAST:event_addButtonActionPerformed
    
    /**
     * Unselect all products.
     * 
     * @param evt 
     */
    private void unselectAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unselectAllButtonActionPerformed
        unselectAll();
    }//GEN-LAST:event_unselectAllButtonActionPerformed

    /**
     * Remove an item from the orders list.
     * 
     * @param evt 
     */
    private void removeItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemButtonActionPerformed
        int selectedProductIndex = productsOrderList.getSelectedIndex();
        
        if (selectedProductIndex < 0) {
            return;
        }
        
        selectedProductsNames.remove(selectedProductIndex);
        productsOrderList.setModel(selectedProductsNames);
        computeTotal();
    }//GEN-LAST:event_removeItemButtonActionPerformed
    
    /**
     * Clear the orders list.
     * 
     * @param evt 
     */
    private void clearListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearListButtonActionPerformed
        selectedProductsNames.clear();
        productsOrderList.setModel(selectedProductsNames);
        
        computeTotal();
    }//GEN-LAST:event_clearListButtonActionPerformed
    
    /**
     * Accept the payment and compute the change.
     * 
     * @param evt 
     */
    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
        try {
            int payment = Integer.parseInt(paymentField.getText());
            int total = computeTotal();
            
            if (payment < total) {
                JOptionPane.showMessageDialog(this, "Insufficient amount.");
                return;
            }
            
            int change = payment - total;
            
            if (change == 0) { 
                changeField.setText("Exact Bill");
            } else {  
                changeField.setText(Integer.toString(change));
            }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Can't process payment. Please enter a valid amount.");
        }
    }//GEN-LAST:event_checkoutButtonActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JCheckBox caffeLatteItem;
    private javax.swing.JCheckBox cappucinoItem;
    private javax.swing.JLabel changeField;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JButton clearListButton;
    private javax.swing.JCheckBox espressoItem;
    private javax.swing.JCheckBox flatWhiteItem;
    private javax.swing.JCheckBox irishCoffeeItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox longBlackItem;
    private javax.swing.JCheckBox macchiatoItem;
    private javax.swing.JCheckBox mochacinnoItem;
    private javax.swing.JTextField paymentField;
    private javax.swing.JList<String> productsOrderList;
    private javax.swing.JButton removeItemButton;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JButton unselectAllButton;
    // End of variables declaration//GEN-END:variables
}
