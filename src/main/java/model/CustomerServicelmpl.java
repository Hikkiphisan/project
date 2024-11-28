package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServicelmpl implements CustomerService {
    private static Map<Integer, Customer> customerMapers;

    static {
        customerMapers = new HashMap<>();
        customerMapers.put(1, new Customer(1,"Trần Minh Trí","tmtri310251@gmail.com","Hanoi"));
        customerMapers.put(2, new Customer(2,"Lê Tuấn Dũng","tuandung9594@gmail.com","Hanoi"));
        customerMapers.put(3,  new Customer(3,"Nguyễn Đức Thắng","thang.nd0226@gmail.com","Hanoi"));
        customerMapers.put(4,  new Customer(4,"Đào Văn Huy Hưng","daohung151003@gmail.com","Hanoi"));

    }


    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMapers.values());
    }

    @Override
    public void save(Customer customer) {  //// Lưu khách hàng vào Map với key là 1
         customerMapers.put(customer.getId(), customer);
    }

    @Override
    public Customer findByID(int id) {
        return customerMapers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
       customerMapers.put(id,customer);
    }

    @Override
    public void remove(int id) {
       customerMapers.remove(id);
    }
}
