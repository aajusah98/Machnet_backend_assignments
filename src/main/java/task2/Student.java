package task2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Student {
    private int Sid;
    private String SName;
}
