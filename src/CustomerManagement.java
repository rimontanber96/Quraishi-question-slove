public class CustomerManagement {

    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setCustomerName("Rahim");
        c1.setCustomerId(101);
        c1.setLoyaltyScore(90);

        Customer c2 = new Customer();
        c2.setCustomerName("Karim");
        c2.setCustomerId(102);
        c2.setLoyaltyScore(65);

        Customer c3 = new Customer();
        c3.setCustomerName("Sara");
        c3.setCustomerId(103);
        c3.setLoyaltyScore(30);

        c1.display();
        c2.display();
        c3.display();
    }
}