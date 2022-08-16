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
    //getter methods
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setMobileNo(long mobileNo){
        this.mobileNo=mobileNo;
    }
    public void setPremium(boolean isPremium){
        this.isPremium=isPremium;
    }
    public Customer(String name, String address, long mobileNo, boolean isPremium)
    {
        this.name=name;
        this.address=address;
        this.mobileNo=mobileNo;
        this.isPremium=isPremium;
    }
    public void displayCustomer(){
        System.out.println("name = " + name);
        System.out.println("address = " + address);
        System.out.println("mobileNo = " + mobileNo);
        System.out.println("Premium = " + isPremium);
    }
}
