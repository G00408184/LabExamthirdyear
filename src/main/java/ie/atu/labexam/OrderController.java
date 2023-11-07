package ie.atu.labexam;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@AllArgsConstructor
@RestController
public class OrderController {
    private OrderService orderService;

    @GetMapping("/order")

        public ArrayList<Order>CreateOrder(){
        return orderService.getOrderById();
        }
        

    }

