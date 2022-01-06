package JUNIT.AddressBookStreams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import JUNIT.AddressBookStreams.Contactperson.ContactPerson;

public interface Addressbook {
	 HashMap<String, ArrayList<ContactPerson>> personByCity = null;
	HashMap<String, ArrayList<ContactPerson>> personByState = null;

	public void operation();

	    public ArrayList<ContactPerson> getContact();

	    public void displayDirectoryContent1();

	    public void editPerson();

	    public void deletePerson();

	    public void addPersonToCity(ContactPerson contact);

	    public void addPersonToState(ContactPerson contact);

	    public void printSortedList(List<ContactPerson> sortedContactList);

	    public void sortAddressBook(int sortingChoice);

		public void setAddressbookName(String bookNameToAdd);


}
