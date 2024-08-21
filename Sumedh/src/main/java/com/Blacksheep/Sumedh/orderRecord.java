package com.Blacksheep.Sumedh;

import com.fasterxml.jackson.annotation.JsonProperty;

public record orderRecord(
        String customerName,
        String productId,
        int quantity
) {

}
