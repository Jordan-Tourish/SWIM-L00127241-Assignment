package ie.lyit.testers;
import java.util.*;
import ie.lyit.hotel.Customer;
import ie.lyit.serialize.CustomerSerializer;

public class CustomerSerializerTester {

	public static void main(String[] args) {

		CustomerSerializer customerSerializer = new CustomerSerializer();
		//Customer list = new Customer();
		//Add two records to the ArrayList
		//customerSerializer.add();
		customerSerializer.readRecordsFromFile();
		// Read the ArrayList from the File
		int option;
		do {
		System.out.print("\n 1= Add \n 2= List \n 3= View \n 4= Edit \n 5= Delete \n 6= Quit \n Enter Option \n ");
		Scanner KeyIn = new Scanner(System.in);
		option = KeyIn.nextInt() ;
		String  Options;
		switch (option) {
		case 1:  Options = "Add";
		customerSerializer.add();         
		break;
		case 2:  Options = "List";
		customerSerializer.list();
		break;
		case 3:  Options = "View";
		customerSerializer.view();
		break;
		case 4:  Options = "Edit";
		customerSerializer.edit();
		break;
		case 5:  Options = "Delete";
		customerSerializer.delete();
		break;
		case 6:  Options = "Quit";
		break;
		default:
			System.out.println("Invalid Entry");
		}

		System.out.println();
		
		customerSerializer.writeRecordsToFile();
		
		}while(option!=6);
}
}

