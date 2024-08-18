package com.Blacksheep.Sumedh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    public MyFirstService(@Qualifier("mySecondClass") MyFirstClass firstClass) {
        this.firstClass = firstClass;
    }

    private MyFirstClass firstClass;

    public String tellAStory() {
        return "the dependency is saying " + firstClass.sayHello();
    }
}
