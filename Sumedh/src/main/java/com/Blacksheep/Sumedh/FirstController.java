package com.Blacksheep.Sumedh;

import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    @GetMapping("/hello")
    public String hello() {
        return "hello from my controller";
    }

    @PostMapping("/post-order")
    public String post(@RequestBody Order order) {
        return "The order is: " + order.toString();
    }

    @PostMapping("/post")
    public String post(@RequestBody String message) {
        return "The message is: " + message;
    }
    @PostMapping("/post-order-record")
    public String post(@RequestBody orderRecord order) {
        return "The order is: " + order.toString();
    }
    @GetMapping("/hello/{record}")
    public String getRecord(
            @PathVariable("record") String record) {
        return "Record is "+record;
    }
}
