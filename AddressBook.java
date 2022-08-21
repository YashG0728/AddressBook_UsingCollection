import java.util.*;

public class AddressBook {
    Scanner sc = new Scanner(System.in);

    ArrayList<PersonInfo> list = new ArrayList<>();
    Map<String, ArrayList<PersonInfo>> map = new HashMap<>();

    void addContact() {

        PersonInfo personInfo = new PersonInfo();

        System.out.println("Enter FirstName : ");
        String firstName = sc.nextLine();

        System.out.println("Enter lastName : ");
        String lastName = sc.nextLine();

        System.out.println("Enter address : ");
        String address = sc.nextLine();

        System.out.println("Enter city : ");
        String city = sc.nextLine();

        System.out.println("Enter state : ");
        String state = sc.nextLine();

        System.out.println("Enter emailID : ");
        String emailId = sc.nextLine();

        System.out.println("Enter zip : ");
        String zip = sc.nextLine();

        System.out.println("Enter phoneNumber : ");
        String phoneNumber = sc.nextLine();

        personInfo.setFirstName(firstName);
        personInfo.setLastName(lastName);
        personInfo.setAddress(address);
        personInfo.setCity(city);
        personInfo.setState(state);
        personInfo.setEmailID(emailId);
        personInfo.setZip(zip);
        personInfo.setPhoneNumber(phoneNumber);


        list.add(personInfo);
        System.out.println(personInfo);
        System.out.println("Contact Added Successfully");
    }

    void displayContact() {
        System.out.println("------------------------------------------");
        for (PersonInfo display : list) {
            System.out.println(display);
        }
        System.out.println("------------------------------------------");
    }

    void searchContact() {
        System.out.println("Enter First Name to search : ");
        String searchName = sc.nextLine();
        System.out.println("------------------------------------------");
        //iterator used to return every record one by one
        for (PersonInfo personInfo : list) {
            if (personInfo.getFirstName().equals(searchName)) {
                System.out.println(personInfo);
            }
        }
        System.out.println("------------------------------------------");
    }

    void deleteContact() {
        System.out.println("Enter First Name to delete : ");
        String deleteName = sc.nextLine();
        System.out.println("------------------------------------------");
        for (PersonInfo personInfo : list) {
            if (personInfo.getFirstName().equals(deleteName)) {
                list.remove(personInfo);
                System.out.println("Record is deleted Successfully...!");
                System.out.println("------------------------------------------");
                break;
            }
        }
    }

    void editContact() {
        boolean found = false;
        System.out.println("Enter First Name to update : ");
        String editName = sc.nextLine();
        System.out.println("------------------------------------------");
        for (PersonInfo personInfo : list) {
            if (personInfo.getFirstName().equals(editName)) {

                System.out.println("Edit First Name : ");
                String firstName = sc.nextLine();

                System.out.println("Edit Last Name ; ");
                String lastName = sc.nextLine();

                System.out.println("Edit Address Name ; ");
                String address = sc.nextLine();

                System.out.println("Edit city Name ; ");
                String city = sc.nextLine();

                System.out.println("Edit state Name ; ");
                String state = sc.nextLine();

                System.out.println("Edit email Name ; ");
                String emailId = sc.nextLine();

                System.out.println("Edit Zip Name ; ");
                String zip = sc.nextLine();

                System.out.println("Edit phoneNumber Name ; ");
                String phoneNumber = sc.nextLine();

                personInfo.setFirstName(firstName);
                personInfo.setLastName(lastName);
                personInfo.setAddress(address);
                personInfo.setCity(city);
                personInfo.setState(state);
                personInfo.setEmailID(emailId);
                personInfo.setZip(zip);
                personInfo.setPhoneNumber(phoneNumber);
                System.out.println(personInfo);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Record Not Found");
        } else {
            System.out.println("record is Edited successfully...!");
        }
        System.out.println("------------------------------------------");
    }

    void newAddressBook() {
        System.out.println("Enter Name Of Address Book : ");
        String addressBookName = sc.nextLine();
        System.out.println("------------------------------------------");
        if (map.containsKey(addressBookName)) {
            System.out.println("AddressBook Already Exists");
        } else {
            map.put(addressBookName, list);
            System.out.println(addressBookName);
        }
        System.out.println("------------------------------------------");
    }

    void displayAddressBook() {
        System.out.println("------------------------------------------");
        for (Map.Entry<String, ArrayList<PersonInfo>> displayBook : map.entrySet()) {
            System.out.println(displayBook.getKey());
            System.out.println(displayBook.getValue());
        }
        System.out.println("------------------------------------------");
    }
}