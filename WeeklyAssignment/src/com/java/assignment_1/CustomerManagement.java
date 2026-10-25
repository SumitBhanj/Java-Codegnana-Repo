package com.java.assignment_1;

public class CustomerManagement {
    public static void main(String[] args) {
        CustomerOperations co = new CustomerOperations();
        Customer customer = new Customer();

        System.out.println("Pre-added Customers");
        System.out.println(co.getCustomers());

        System.out.println();

        boolean isCustomerAdded = co.addCustomer(106,"Ananya","Verma",'F');
        if(isCustomerAdded){
            System.out.println("Customer Added Succesfully");
        } else{
            System.out.println("Customer not added");
        }
        System.out.println(co.getCustomers());

        System.out.println();

        isCustomerAdded = co.addCustomer(106,"Ananya","Verma",'F');
        if(isCustomerAdded){
            System.out.println("Customer Added Succesfully");
        } else{
            System.out.println("Customer not added");
        }
        System.out.println(co.getCustomers());

        System.out.println();

        System.out.println("Update Customer Id 103");
        co.updateCustomer(103,"Arjun","Reddy",'M');
        System.out.println(co.getCustomers());

        System.out.println();

        System.out.println("Deleting Customer Id 104");
        co.deleteCustomer(104);
        System.out.println(co.getCustomers());

        System.out.println();

        System.out.println("Find customer by Id");
        Customer id = co.findCustomerById(102);
        if (id != null) {
            System.out.println("Found: " + id);
        } else {
            System.out.println("Customer not found with id 102");
        }

        System.out.println();

        System.out.println("Find Customer by FirstName");
        Customer name = co.findCustomerByFirstName("Kiran");
        if (name != null) {
            System.out.println("Found: " + name);
        } else {
            System.out.println("Customer not found with first name Kiran");
        }

        System.out.println();

        System.out.println("Finding customer by Id: 999");
        id = co.findCustomerById(999);
        if (id != null) {
            System.out.println("Found: " + id);
        } else {
            System.out.println("Customer not found with id 999");
        }

        System.out.println();
        
        System.out.println("Customers Detail");
        System.out.println(co.getCustomers());
    }
}
