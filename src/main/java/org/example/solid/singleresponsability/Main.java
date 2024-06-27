package org.example.solid.singleresponsability;

import org.example.solid.singleresponsability.order.InvoiceGenerator;
import org.example.solid.singleresponsability.order.Order;
import org.example.solid.singleresponsability.order.Product;
import org.example.solid.singleresponsability.order.ProductBuilder;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {

        Product pizza =  new ProductBuilder().setName("Pizza")
                                                .setPrice(new BigDecimal(85))
                                                .setAmount(3L).build();

        Product soda =  new ProductBuilder().setName("Soda")
                                             .setPrice(new BigDecimal(10))
                                             .setAmount(2L).build();

        Order order = new Order();

        System.out.println(order.showAllProducts());

        order.addProduct(pizza);

        System.out.println(order.calculateValueOrder());

        order.addProduct(soda);

        System.out.println(order.showAllProducts());

        System.out.println(order.calculateValueOrder());

        System.out.println(InvoiceGenerator.generateInvoice(order));

    }
}