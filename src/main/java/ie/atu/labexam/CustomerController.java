package ie.atu.labexam;

import lombok.AllArgsConstructor;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
public class CustomerController {
    CustomerService customerService;
    Customer customer;
    @PostMapping("/CustomerId")
    public String getCustomer(@RequestBody CustomerService customerService){
         customerService.customerService.getCustomerById();
        return customer.getCustomerId();
    }
}
