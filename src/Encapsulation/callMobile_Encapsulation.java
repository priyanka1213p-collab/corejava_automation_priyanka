package Encapsulation;

public class callMobile_Encapsulation {
public static void main(String[] args) {
	Mobile_Encapsulation m = new Mobile_Encapsulation();
	m.setDiscount(40);
	m.setModel("Samsungs");
	
	System.out.println("Mobile Discount: "+m.getDiscount());
	System.out.println("Mobile Model:" +m.getModel());
}

}
