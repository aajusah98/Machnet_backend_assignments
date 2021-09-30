package task3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

    @Value("${address.address_id}")
    private int adddressId;
    @Value("${address.address_name}")
    private String addressName;

    public  void  displayAdress(){
        System.out.println("Address Id: "+ adddressId);
        System.out.println("Address Name: "+ addressName );
    }
}
