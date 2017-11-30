package ie.lyit.hotel;

public class PersonController {
	 private Person model; // CONTROLLER //
	 private PersonView view; ////////////////
	 public PersonController(Person model, PersonView view){
	 this.model = model;
	 this.view = view;
	 }
	 public void setName(Name name){
	 model.setName(name);
	 }
	 public Name gettName(){
	 return model.getName();
	 }
	 public void setPhoneNumber(String phoneNumber){
	 model.setPhoneNumber(phoneNumber);
	 }
	 public String getPhoneNumber(){
	 return model.getPhoneNumber();
	 }
	 public void updateView()
	 {
	 view.printPersonDetails(model.getName(), model.getPhoneNumber());
	 }
}