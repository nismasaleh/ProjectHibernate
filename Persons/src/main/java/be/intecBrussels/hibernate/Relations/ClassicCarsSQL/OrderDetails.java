package be.intecBrussels.hibernate.Relations.ClassicCarsSQL;

import javax.persistence.*;

@Entity
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private Products products;

    private int orderNumber;
    private String productCode;
    private int quantityOrdered;
    private double priceEach;
    private int orderLineNumber;

    public int getId() {
        return id;
    }

    public OrderDetails setId(int id) {
        this.id = id;
        return this;
    }

    public Products getProducts() {
        return products;
    }

    public OrderDetails setProducts(Products products) {
        this.products = products;
        return this;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public OrderDetails setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public String getProductCode() {
        return productCode;
    }

    public OrderDetails setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public OrderDetails setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
        return this;
    }

    public double getPriceEach() {
        return priceEach;
    }

    public OrderDetails setPriceEach(double priceEach) {
        this.priceEach = priceEach;
        return this;
    }

    public int getOrderLineNumber() {
        return orderLineNumber;
    }

    public OrderDetails setOrderLineNumber(int orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
        return this;
    }
}
