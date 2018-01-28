public class Main {
    public static void main(String [] args) {
        ContactsManager myContactsManager = new ContactsManager();
        // add contact
        Contact myNewContact = new Contact();
        myNewContact.name = "yu";
        myNewContact.phoneNumber = "123456789";

        Contact myNewContact2 = new Contact();
        myNewContact2.name = "ha";
        myNewContact2.phoneNumber = "12345678";

        Contact myNewContact3 = new Contact();
        myNewContact3.name = "ya";
        myNewContact3.phoneNumber = "12345678";

        Contact myNewContact4 = new Contact();
        myNewContact4.name = "la";
        myNewContact4.phoneNumber = "12345678";

        myContactsManager.addContact(myNewContact);
        myContactsManager.addContact(myNewContact2);
        myContactsManager.addContact(myNewContact3);
        myContactsManager.addContact(myNewContact4);

        // search contact using name
        Contact searchResult = myContactsManager.searchContact("yu");
        System.out.println(searchResult.phoneNumber);
    }
}
