package Entity;

import java.util.Arrays;

public class Customer {
    private int customerID;
    private String customerName;
    private String customerAddress;
    private long contactNumber;
    private int[] orderId;

    public Customer(int customerID, String customerName, String customerAddress, long contactNumber, int[] orderId) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.contactNumber = contactNumber;
        this.orderId = orderId;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int[] getOrderId() {
        return orderId;
    }

    public void setOrderId(int[] orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", contactNumber=" + contactNumber +
                ", orderId=" + Arrays.toString(orderId) +
                '}';
    }
}
