package task3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class javaScript implements Programming {


    @Override
    public void programming() {
        System.out.println("Hey Buddy I Am JavaScript");
    }
}
