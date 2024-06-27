package org.example.solid.singleresponsability.order;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;
    private Long amount;

    public Product(String name, BigDecimal price, Long amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
