package customerinfo;

import customermethod.Customer;

public class CustomerImpl {
    public static void main(String[] args) {
        Customer cust1=new Customer();
        cust1.setName("Suraj");
        cust1.setAddress("India");
        cust1.setMobileNo(9445367302L);
        cust1.setPremium(true);

        Customer cust2=new Customer("Ram","Pakistan",9558754628L,false);

        Customer temp;
        temp=cust1;
        cust1=cust2;
        cust2=temp;
        cust1.displayCustomer();
        cust2.displayCustomer();
    }
}
