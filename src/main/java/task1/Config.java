package task1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public  Calculator calculator(){
        return  new Calculator();
    }
}