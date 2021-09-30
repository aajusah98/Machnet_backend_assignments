package task3;

import org.springframework.stereotype.Component;

@Component
public class javaPrograming implements Programming{
    @Override
    public void programming() {
        System.out.println("Hey Man I am Java");
    }
}
