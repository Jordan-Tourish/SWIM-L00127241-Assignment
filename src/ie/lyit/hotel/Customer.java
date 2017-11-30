package ie.lyit.hotel;

import java.io.Serializable;
import java.util.ArrayList;

//import javax.swing.JOptionPane;
//import javax.swing.JTextField;
import java.util.Scanner;
public class Customer extends Person implements Serializable {
	private String emailAddress;
	private int number;
	
	private static int nextNumber=1; 
	
	public Customer() 
	{
		super();
		emailAddress=null;
		number=nextNumber++;
	}
	
	public Customer(String t , String fN, String sN , String address, String phoneNumber, String email , String Gender)
	{
		super (t,fN,sN,address,phoneNumber , Gender);
		emailAddress =email;
		number=nextNumber++;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "," + emailAddress +  "," + number;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Customer cObject;
		if (obj instanceof Customer)
			cObject = (Customer)obj;
		else 
			return false;
		
		return(this.number==cObject.number);
	}
	
	public void setEmailAddress(String emailAddress)
	{
		this.emailAddress=emailAddress;
	}
	
	public String getEmailAddress()
	{
		return emailAddress;
	}
	
	public int getNumber()
	{
		return number;
		
	}
	
	// read() - To read a book from the user		
	   public void read(){
		   Scanner keyIn = new Scanner(System.in);
		   
		   System.out.println("Enter Customer Title");
		   this.name.setTitle(keyIn.nextLine());
		   System.out.println("Enter Customer First Name");
		   this.name.setFirstName(keyIn.nextLine());
		   System.out.println("Enter Customer Surname");
		   this.name.setSurname(keyIn.nextLine());
		   System.out.println("Enter Customer Address");
		   this.address=keyIn.nextLine();
		   System.out.println("Enter Phone Number");
		   this.phoneNumber=keyIn.nextLine();
		   System.out.println("Enter Email Address");
		   this.emailAddress=keyIn.nextLine();
		   System.out.println("Enter Gender");
		   this.Gender=keyIn.nextLine();
		   //System.out.println("Enter Number");
		   //this.number=keyIn.nextInt();
	 /*     JTextField txtTitle = new JTextField();
	      JTextField txtSurName = new JTextField();
	      txtSurName.requestFocus();
	      JTextField txtFirstName = new JTextField();
	      JTextField txtPhoneNumber = new JTextField();
	      JTextField txtNumber = new JTextField();
	      JTextField txtEmail = new JTextField();
	      
	      Object[] message = {
	          "Title :", txtTitle,
	          "Surname:", txtSurName,
	          "First Name:", txtFirstName,
	          "Phone Number:", txtPhoneNumber,
	          "Email Address", txtEmail,
	          "Number", txtNumber
	      };
	    

	      int option = JOptionPane.showConfirmDialog(null, message, "Enter book details", JOptionPane.OK_CANCEL_OPTION);

	      if (option == JOptionPane.OK_OPTION){
	          this.emailAddress = txtEmail.getText();
	          //this.number = txtNumber.getText();
	      }  
*/

	   }
}


