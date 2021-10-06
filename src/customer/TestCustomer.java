package customer;

public class TestCustomer {

    public static void main(String[] args) {
        Customer customer = new Customer("tine", "112");
        VIPCustomer vIPCustomer = new VIPCustomer("guler", "911", 1000);

        System.out.println(customer);
        System.out.println(vIPCustomer);
    }

}
