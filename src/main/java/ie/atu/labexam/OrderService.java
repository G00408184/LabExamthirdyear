package ie.atu.labexam;

import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class OrderService {
    ArrayList<Order> list = new ArrayList<>();
    public void createOrder(Order order){

        list.add(order);
    }
    public ArrayList<Order>getOrderById(){

        return list;

    }
}
