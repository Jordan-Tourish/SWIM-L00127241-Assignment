package ie.lyit.serialize;
import ie.lyit.hotel.Customer;

import java.util.ArrayList;
import java.util.*;
import java.io.*;

	@SuppressWarnings("serial")
	public class CustomerSerializer implements Serializable, CustomerDAO{
		private ArrayList<Customer> customers;
		
		 final String FILENAME = "customers.ser";	
		 
		public   CustomerSerializer(){
			// Construct customers ArrayList
			customers = new ArrayList<Customer>();
			
		}
	
	
		// Purpose : Reads one customer record from the user    
		//           and adds it to the ArrayList customers 
		
		public void add()
		{
			Customer customer = new Customer();
			customer.read();	
			customers.add(customer);
		}

	
		//Purpose : Lists all customer records in the ArrayList  
		
		public void list(){
			// for every customer object in customers
	      for(Customer tmpcustomer:customers)
				// display it
				System.out.println(tmpcustomer);
		}
		
									      
		// Purpose : Displays the required customer record on screen 
		//         : And returns it, or null if not found           
			
		public Customer view(){
			Scanner keyboard = new Scanner(System.in);		

			// Read the number of the customer to be viewed from the user
			System.out.println("ENTER NUMBER OF customer : ");
			int customerToView=keyboard.nextInt();
		
			// for every customer object in customers
		    for(Customer tmpcustomer:customers){
			   // if it's number equals the number of the customerToView
			   if(tmpcustomer.getNumber() == customerToView){
			      // display it
				  System.out.println(tmpcustomer);
				  return tmpcustomer;
			   }
			}
		    // if we reach this code the customer was not found so return null
		    return null;		
		}

		
		 //Purpose : Deletes the required customer record from customers 
			
		public void delete(){	
			// Call view() to find, display, & return the customer to delete
			Customer tempcustomer = view();
			// If the customer != null, i.e. it was found then...
		    if(tempcustomer != null)
			   // ...remove it from customers
		       customers.remove(tempcustomer);
		}
		
		
		// Purpose : Edits the required customer record in customers 
			
		public void edit(){	
			// Call view() to find, display, & return the customer to edit
			Customer tempcustomer = view();
			// If the customer != null, i.e. it was found then...
		    if(tempcustomer != null){
			   // get it's index
			   int index=customers.indexOf(tempcustomer);
			   // read in a new customer and...
			   tempcustomer.read();
			   // reset the object in customers
			   customers.set(index, tempcustomer);
		    }
		}
		
		
		// Purpose : Writes the ArrayList customers to the       
		//		     File customers.bin before closing the File  
		
		public void writeRecordsToFile(){
			try{
				// Serialize the ArrayList...
				FileOutputStream fileStream = new FileOutputStream(FILENAME);
		
				ObjectOutputStream os = new ObjectOutputStream(fileStream);
		
				os.writeObject(customers);
		
				os.close();
			}
			catch(FileNotFoundException fNFE){
				System.out.println("Cannot create file to store customers.");
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}

		
		// Purpose : Reads the ArrayList from the File back  
		//		     into customers before closing the File   
	
		public void readRecordsFromFile(){
			try{
				//Deserialize the ArrayList...
				FileInputStream fis = new FileInputStream(FILENAME);
				
				ObjectInputStream is = new ObjectInputStream(fis);

				// COULD use code below to ensure it is an ArrayList
				// BUT no need-we are confident file contains an ArrayList
				// Object o = is.readObject(); 	// READ an object from the file
				// if(o instanceof ArrayList)  	// IF object is an ArrayList
				//    customers=(ArrayList<customer>)o;//    ASSIGN object to customers			
				customers = (ArrayList<Customer>)is.readObject();

				is.close();
			}
			catch(FileNotFoundException fNFE){
				System.out.println("Cannot find customers file.");
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}				
		}


		@Override
		public void readRecordFromFile() {
			// TODO Auto-generated method stub
			
		}	

	}
