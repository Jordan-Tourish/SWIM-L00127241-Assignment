package ie.lyit.hotel;

public  abstract class FactoryPerson {
	
	public Person createPerson(String type)
	{
		if(type.equalsIgnoreCase("Male"))
			return new FactoryMale();
		else if( type.equalsIgnoreCase("Female"))
			return new FactoryFemale();
		else 
			return null;
		
	}

}
