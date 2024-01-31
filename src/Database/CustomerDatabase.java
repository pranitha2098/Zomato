package Database;

import Entity.Customer;
import Implementation.CustomerImpl;

import java.util.Arrays;

public class CustomerDatabase {
    public static Customer[] custDB= new Customer[2];
    public static int pointer;

    public static int add(Customer customer){

        if(pointer==custDB.length-1)
            extendArray();

        custDB[pointer]=customer;
        pointer++;
        return customer.getCustomerID();
    }

    private static void extendArray(){
        Customer[] newArray = new Customer[custDB.length+2];
        for (int i=0;i<custDB.length;i++){
            newArray[i] = custDB[i];
        }
        custDB= newArray;
    }

    public static void remove(int custId){
        int foundID = searchByCustomerID(custId);
        if(foundID==-1)
            return;
        for (int i=foundID;i<=pointer;i++){
            custDB[i]=custDB[i+1];
        }
        custDB[pointer]= null;
        --pointer;
    }

    public static int searchByCustomerID(int custID){
        for (int i =0 ; i<=pointer;i++){
            if(custDB[i].getCustomerID()==custID)
                return i;
        }
        return -1;
    }


    public static String displayData(){
        return Arrays.toString(custDB);
    }

    static{
        Customer cust1=new Customer(1,"pranitha","Bangalore",78645L,new int[10]);
        Customer cust2=new Customer(2,"prani","begur",78645L,new int[10]);
        Customer cust3=new Customer(3,"sameer","Btm",78645L,new int[10]);
        Customer cust4=new Customer(4,"kruti","Bannerghatta",1234L,new int[10]);
        CustomerImpl c=new CustomerImpl();
        c.addCustomer(cust1);
        c.addCustomer(cust2);
        c.addCustomer(cust3);
        c.addCustomer(cust4);
    }


}


