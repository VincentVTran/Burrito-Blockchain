package restAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class mainAPI {

    public static void main(String[] args){
        SpringApplication.run(mainAPI.class,args); //.run is a static method
    }

}