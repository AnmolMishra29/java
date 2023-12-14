package training;
public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String address;

    // Default constructor
    public Customer() {
    }

    // Overloaded constructor with Customer attributes
    public Customer(int customerId, String firstName, String lastName, String emailAddress, String phoneNumber, String address) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Getter and setter methods for Customer attributes
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // toString method to print all information of Customer attributes
    @Override
    public String toString() {
        return "Customer ID: " + customerId +
                "\nFirst Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nEmail Address: " + emailAddress +
                "\nPhone Number: " + phoneNumber +
                "\nAddress: " + address;
    }
}

