package Encapsulation;
//Mobile Discount Limit
//
//Create a Mobile class
//
//Private fields: model, discount
//
//Setter should not allow discount > 50%
//
//Getter to view discount
//
//Concept: Business Rule Validation

public class Mobile_Encapsulation {
private String model;
private int discount;

//Setter for model 
public void setModel(String Model) {
	this.model = Model;
	
}
//Getter for model
public String getModel() {
	return model;
}

//Setter for Discount 
public void setDiscount(int discount ) {
	if(discount<=40) {
		this.discount = discount;
	}
	else
	{
		System.out.println("Discount can not be more than 50%");
	}
}

//Getter for Discount 
public int getDiscount() {
	return discount;
}
}
