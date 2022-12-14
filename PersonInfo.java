import java.util.*;

class PersonInfo {
    private String firstName, lastName, address, city, state, emailID, zip, phoneNumber;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Here I am using a constructor
//    public PersonInfo(int Num, String firstName, String lastName, String address, String city, String state, String emailID, long zip, long phoneNumber) {
//        this.Num = Num;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.address = address;
//        this.city = city;
//        this.state = state;
//        this.emailID = emailID;
//        this.zip = zip;
//        this.phoneNumber = phoneNumber;
//    }


    @Override
    public String toString() {
        return "PersonInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", emailID='" + emailID + '\'' +
                ", zip='" + zip + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

