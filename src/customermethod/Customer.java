package customermethod;

public class Customer {
    String name;
    String address;
    long mobileNo;
    boolean isPremium;
    public Customer()
    {
        System.out.println("No argument constructor called");
    }
    Customer(String name,String address,long mobileNo,boolean isPremium)
    {
        this.name=name;
        this.address=address;
        this.mobileNo=mobileNo;
        this.isPremium=isPremium;
    }
    void displayCustomer(){

    }
}
