package org.example.solid.singleresponsability.order;

import java.math.BigDecimal;
import java.util.Set;

public interface IOrder {
    Set<Product> showAllProducts();
    void addProduct(Product product);
    BigDecimal calculateValueOrder();
}
