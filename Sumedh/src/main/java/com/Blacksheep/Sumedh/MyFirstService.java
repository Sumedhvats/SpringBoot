package com.Blacksheep.Sumedh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
@Service
public class MyFirstService {
    private MyFirstClass firstClass;
   // private Environment environment;
    @Autowired
    public void injectDependencies(
            @Qualifier("mySecondClass") MyFirstClass firstClass
    ){
        this.firstClass=firstClass;
    }
    public MyFirstService(@Qualifier("mySecondClass") MyFirstClass firstClass) {
        this.firstClass = firstClass;
    }
    public String tellAStory() {
        return "the dependency is saying " + firstClass.sayHello();
    }
//    public String getJavaVersion() {
//        return environment.getProperty("java.version");
//    }
//    public String getOSVersion() {
//        return environment.getProperty("os.name");
//    }

//    public String  getProperty(){
//        return  environment.getProperty("my.custom.property");
//    }
//    @Autowired
//    public void setEnvironment(Environment environment) {
//        this.environment = environment;
//    }
}