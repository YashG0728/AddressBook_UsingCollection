import java.util.*;

public class RefactorAddressBook {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        //PROVIDE MENU
        boolean exit = true;
        while (exit) {
            System.out.print(" 1.INSERT ");
            System.out.print(" 2.DISPLAY ");
            System.out.print(" 3.SEARCH ");
            System.out.print(" 4.DELETE ");
            System.out.print(" 5.EDIT ");
            System.out.print(" 6.ADD NEW ADDRESS BOOK ");
            System.out.print(" 7.DISPLAY ADDRESS BOOK");
            System.out.println(" 0.EXIT ");
            System.out.print("->");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: //addAddressBook
                    addressBook.newAddressBook();
                    break;
                case 2: //Insert details
                    addressBook.addContact();
                    break;
                case 3: //For Display
                    addressBook.displayContact();
                    break;
                case 4: //For Searching
                    addressBook.searchContact();
                    break;
                case 5: //For deleting
                    addressBook.deleteContact();
                    break;
                case 6: //For update
                    addressBook.editContact();
                    break;
                case 7: //addAddressBook
                    addressBook.displayAddressBook();
                    break;
                case 0:
                    exit = false;
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}

