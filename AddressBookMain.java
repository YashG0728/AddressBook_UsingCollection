package UC3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        //here i am creating instance of collection
        List<PersonInfo> c = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        //DO-WHILE LOOP GOR CHECKING INPUT ITS !=(NOT EQUAL TOO) 0
        //loop continuously run until user provide ZERO
        do {
            //PROVIDE MENU
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.DELETE");
            System.out.println("4.EDIT");
            System.out.println("ENTER YOUR CHOICE : ");
            choice = sc.nextInt();

            boolean found;
			switch (choice) {
                case 1: //Insert details
                    System.out.println("Enter Num : ");
                    int Num = sc.nextInt();
                    String empty = sc.nextLine();
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
                    System.out.println("Enter phoneNumber : ");
                    long phoneNumber = sc.nextLong();
                    System.out.println("Enter zip : ");
                    long zip = sc.nextLong();
                    c.add(new PersonInfo(Num, firstName, lastName, address, city, state, emailId, zip, phoneNumber));
                    break;

                case 2: //For Display
                    System.out.println("------------------------------------------");
                    Iterator<PersonInfo> i = c.iterator(); //iterator used to return every record one by one
                    while (i.hasNext()) {
                        PersonInfo e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("------------------------------------------");
                    break;

                case 3: //For deleting
                    found = false;
                    System.out.println("Enter num to delete : ");
                    Num = sc.nextInt();
                    System.out.println("------------------------------------------");
                    i = c.iterator(); //iterator used to return every record one by one
                    while (i.hasNext()) {
                        PersonInfo e = i.next();
                        if (e.getNum() == Num) {
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not Found");
                    } else {
                        System.out.println("record is deleted succesfully...!");
                    }
                    System.out.println("------------------------------------------");
                    break;

                case 4: //For update
                    found = false;
                    System.out.println("Enter num to update : ");
                    Num = sc.nextInt();
                    System.out.println("------------------------------------------");
                    ListIterator<PersonInfo> li = c.listIterator(); //iterator used to return every record one by one
                    while (li.hasNext()) {
                        PersonInfo e = li.next();
                        if (e.getNum() == Num) {
                            System.out.println("Edit Num Name : ");
                            Num = sc.nextInt();
                            String empty1 = sc.nextLine();
                            System.out.println("Edit First Name : ");
                            firstName = sc.nextLine();
                            System.out.println("Edit Last Name ; ");
                            lastName = sc.nextLine();
                            System.out.println("Edit Address Name ; ");
                            address = sc.nextLine();
                            System.out.println("Edit city Name ; ");
                            city = sc.nextLine();
                            System.out.println("Edit state Name ; ");
                            state = sc.nextLine();
                            System.out.println("Edit email Name ; ");
                            String emailID = sc.nextLine();
                            System.out.println("Edit phoneNumber Name ; ");
                            phoneNumber = sc.nextLong();
                            System.out.println("Edit ZIP ; ");
                            zip = sc.nextLong();
                            li.set(new PersonInfo(Num, firstName, lastName, address, city, state, emailID, phoneNumber, zip));
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not Found");
                    } else {
                        System.out.println("record is Edited successfully...!");
                    }
                    System.out.println("------------------------------------------");
                    break;
            }
        } while (choice != 0);
    }
}