package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Kevin", "Smith", "KEVTH223"));
        customers.add(new Customer("Danny", "Fenton", "Gothgirllover1"));

        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customer){
        for (Customer i : customer) {
            System.out.println(i);
        }

    }
}