package com.Blacksheep.Sumedh;

import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    @PostMapping("/post")
    public String post(@RequestBody String message) {
        return "The message is: " + message;
    }
    @GetMapping("/hello")
    public String paramVariable(
            @RequestParam("user-name") String UserName1,
            @RequestParam("user-Lastname") String UserLastName

    ) {
        return "My name is  " + UserName1+ " "+UserLastName;
    }














//    @GetMapping("/hello")
//    public String hello() {
//        return "hello from my controller";
//    }
//
//    @PostMapping("/post-order")
//    public String post(@RequestBody Order order) {
//        return "The order is: " + order.toString();
//    }
//    @PostMapping("/post-order-record")
//    public String post(@RequestBody orderRecord order) {
//        return "The order is: " + order.toString();
//    }
//
//    @GetMapping("/hello/{record}")
//    public String pathVariable(
//            @PathVariable("record") String record) {
//        return "Record is " + record;
//    }


}
