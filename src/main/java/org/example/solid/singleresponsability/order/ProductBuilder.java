package org.example.solid.singleresponsability.order;

import java.math.BigDecimal;

public class ProductBuilder {
    private String name;
    private BigDecimal price;
    private Long amount;

    public ProductBuilder setName(String name){
        this.name = name;
        return this;
    }

    public ProductBuilder setPrice(BigDecimal price){
        this.price = price;
        return this;
    }

    public ProductBuilder setAmount(Long amount){
        this.amount = amount;
        return this;
    }
    public Product build() {
        return new Product(name, price, amount);
    }


}
