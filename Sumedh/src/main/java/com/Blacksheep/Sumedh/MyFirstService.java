package com.Blacksheep.Sumedh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
@Service
@PropertySource("classpath:custom.properties")
public class MyFirstService {
    private final MyFirstClass firstClass;
    @Value("${my.prop}")
    private String customProperty;
    @Value("${my.custom.properties.int}")
    private Integer newCustomProperty;
    public MyFirstService(@Qualifier("myFirstClass") MyFirstClass firstClass) {
        this.firstClass = firstClass;
    }
    public String tellAStory() {
        return "the dependency is saying " + firstClass.sayHello();
    }

    public String getCustomProperty() {
        return customProperty;
    }

    public Integer getNewCustomProperty() {
        return newCustomProperty;
    }

    // private Environment environment;
  //  @Autowired
//    public void injectDependencies(
//            @Qualifier("mySecondClass") MyFirstClass firstClass
//    ){
//        this.firstClass=firstClass;
//    }

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