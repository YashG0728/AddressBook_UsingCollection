package UC1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
            choice = sc.nextInt();

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
            }
        } while (choice != 0);
    }
}



	
