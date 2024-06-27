package org.example.solid.singleresponsability.order;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Order implements IOrder {
    private Set<Product> products;
    @Override
    public Set<Product> showAllProducts() {

        if (products == null)
            products = new HashSet<>();

        return products;
    }

    @Override
    public void addProduct(Product product) {

        if (products == null)
            products = new HashSet<>();

        products.add(product);
    }

    @Override
    public BigDecimal calculateValueOrder() {

        BigDecimal totalValue = new BigDecimal(0);

        if (Objects.nonNull(products))
        {
            for (Product product : products) {

                BigDecimal amount = new BigDecimal(product.getAmount());

                BigDecimal valuePerOrder = product.getPrice().multiply(amount);

                totalValue = totalValue.add(valuePerOrder);
            }
        }

        return totalValue;
    }
}
