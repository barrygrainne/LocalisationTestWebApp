package ie.rccourse;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalMessage { // class is encapsulating the resource bundle so i can use on webpage
	
	// properties
	ResourceBundle bundle;
	Locale locale = Locale.ENGLISH;
	
	// get & set methods
	
	// constructor // constructor always public, same name as class , may or may not take parameters
	public LocalMessage(Locale locale){
		this.locale = locale; // now i can specify what language i want
		
		 bundle = ResourceBundle.getBundle("resources.messages", locale); // pass in local when load resources
		
	} 
	
	//other methods
	public String getMessage(String message){ 
		return bundle.getString(message);
	}
	

}
