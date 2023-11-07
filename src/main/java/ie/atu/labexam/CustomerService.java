package ie.atu.labexam;


import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public CustomerService customerService;
    private Customer customer;

    public CustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void getCustomerById(Customer customer){
        System.out.println(CustomerI);
    }
}
