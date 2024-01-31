package Implementation;

import Database.CustomerDatabase;
import Entity.Customer;

import java.sql.SQLOutput;

public class CustomerImpl {

    public int addCustomer(Customer customer){
        if(checkByCustomerID(customer.getCustomerID())){
            System.out.println("Customer ID already exists");
            return -1;
        }
        return CustomerDatabase.add(customer);
    }

    private boolean checkByCustomerID(int custID){
        for(int i=0;i<CustomerDatabase.pointer;i++){
            if(CustomerDatabase.custDB[i].getCustomerID()==custID)
                return true;
        }
        return false;
    }

    public void removeCustomer(int custID){
         CustomerDatabase.remove(custID);
    }
}
