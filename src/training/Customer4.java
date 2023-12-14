package training;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Customer4 {
    private static int nextCustomerId = 1;

    private final int customerId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String address;

    public Customer4() {
        this.customerId = generateCustomerId();
    }

    public Customer4(String firstName, String lastName, String emailAddress, String phoneNumber, String address) {
        this.customerId = generateCustomerId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = validateEmail(emailAddress) ? emailAddress : "";
        this.phoneNumber = validatePhoneNumber(phoneNumber) ? phoneNumber : "";
        this.address = address;
    }

    // Getter and Setter methods

    public int getCustomerId() {
        return customerId;
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
        if (validateEmail(emailAddress)) {
            this.emailAddress = emailAddress;
        } else {
            System.out.println("Invalid email address.");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (validatePhoneNumber(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid phone number.");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId +
                "\nFirst Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nEmail Address: " + emailAddress +
                "\nPhone Number: " + phoneNumber +
                "\nAddress: " + address;
    }

    private int generateCustomerId() {
        return nextCustomerId++;
    }

    private boolean validateEmail(String email) {
        // You can add more sophisticated email validation logic here
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    private boolean validatePhoneNumber(String phoneNumber) {
        // You can add more sophisticated phone number validation logic here
        return phoneNumber.matches("\\d{10}");
    }
}
