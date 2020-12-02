import dal.CustomerDal;
import entities.Customer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerDal customerDal=new CustomerDal();
        List<Customer> customerList= customerDal.getAll();
        customerDal.add(new Customer());
        customerDal.delete(new Customer());
        customerDal.update(new Customer());
    }
}
