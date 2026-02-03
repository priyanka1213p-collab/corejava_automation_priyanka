package Encapsulation;

public class call_encapsulation {
public static void main(String[] args) {
	Encapsulation e = new Encapsulation();
	e.setId(12);
	e.setMobilenum("9870071648");
	e.setPassword("password");
	System.out.println(e.getId()+ " "+e.getPassword()+ " "+e.getMobilenum());
//	System.out.println(e.toString());
}

}
