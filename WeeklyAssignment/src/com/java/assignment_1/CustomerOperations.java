package com.java.assignment_1;

import java.util.HashSet;
import java.util.Iterator;

public class CustomerOperations {
    private HashSet<Customer> customers = new HashSet<>();

    //Adding Values
    public CustomerOperations(){
        Customer c1 = new Customer(101, "Rahul", "Sharma", 'M');
        Customer c2 = new Customer(102, "Priya", "Reddy", 'F');
        Customer c3 = new Customer(103, "Arjun", "Kumar", 'M');
        Customer c4 = new Customer(104, "Sneha", "Rao", 'F');
        Customer c5 = new Customer(105, "Kiran", "Patel", 'M');

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
    }

    //Adding Customer
    public boolean addCustomer(int customerId, String fName,String lName, char customerGender) {
        boolean isAdded = false;
        Customer newCustomer = new Customer(customerId, fName,lName,customerGender);
        isAdded = customers.add(newCustomer);
        return isAdded;
    }

    //Updating Customer
    public boolean updateCustomer(int customerId,String fName,String lName,char customerGender) {
        boolean isUpdated = false;
        Iterator<Customer> it = customers.iterator();
        while (it.hasNext()) {
            Customer customer = it.next();

            if (customer.getId() == customerId) {

                customer.setFirstName(fName);
                customer.setLastName(lName);
                customer.setGender(customerGender);
                isUpdated = true;
                break;
            }

        }
        return isUpdated;
    }

    //Delete Customer
    public boolean deleteCustomer(int customerId) {
        boolean isDeleted = false;
        Iterator<Customer> it = customers.iterator();
        while(it.hasNext()) {
            Customer customer = it.next();

            if(customer.getId() == customerId) {
                isDeleted = customers.remove(customer);
                break;
            }
        }
        return isDeleted;
    }

    //Finding By Customer ID
    public Customer findCustomerById(int customerId){
        for(Customer customer: customers){
            if(customer.getId() == customerId){
                return customer;
            }
        }
        return null;
    }

    //Finding By Customer First Name
    public Customer findCustomerByFirstName(String firstName){
        for(Customer customer : customers){
            if(customer.getFirstName().equals(firstName)){
                return customer;
            }
        }
        return null;
    }

    //Display All customer
    public HashSet<Customer> getCustomers(){
        return customers;
    }
}
