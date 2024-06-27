package org.example.solid.singleresponsability.order;

import java.util.Set;

public class InvoiceGenerator {
    public static String generateInvoice(Order order){

        Set<Product> products = order.showAllProducts();

        StringBuilder str = new StringBuilder();
        str.append("----------------------------------------------");

        if (! products.isEmpty()) {
            for (Product product : products){
                str.append("\n")
                   .append("Product: ").append(product.getName())
                   .append("\n")
                   .append("Price: U$").append(product.getPrice())
                   .append("\n")
                   .append("Amount: ").append(product.getAmount())
                   .append("\n")
                   .append("----------------------------------------------");
            }

            str.append("\n")
               .append("Total Value: U$")
               .append(order.calculateValueOrder());
        }

        return str.toString();
    }
}