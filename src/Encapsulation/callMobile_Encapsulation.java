package Encapsulation;

public class callMobile_Encapsulation {
public static void main(String[] args) {
	Mobile_Encapsulation m = new Mobile_Encapsulation();
	m.setDiscount(40);
	m.setModel("Samsung");
	
	System.out.println("Mobile Discount: "+m.GetDiscount());
	System.out.println("Mobile Model:" +m.getModel());
}

}
