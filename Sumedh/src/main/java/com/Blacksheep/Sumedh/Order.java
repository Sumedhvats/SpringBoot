package com.Blacksheep.Sumedh;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
    @JsonProperty("cName")
    String customerName;
    @JsonProperty("pName")

    String productId;
    @JsonProperty("q")

    int quantity;

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", productId='" + productId + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
