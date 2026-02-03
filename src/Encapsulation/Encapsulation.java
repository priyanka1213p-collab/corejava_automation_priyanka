package Encapsulation;
//Create an Employee class:
//
//private fields: empId, salary
//
//Setter should not allow negative salary
//
//Getter to view salary.
//
//Concept: Validation using encapsulation
// Call to main class like "call_encapsulation"

public class Encapsulation {
private int id;
private String password,mobilenum;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMobilenum() {
	return mobilenum;
}
public void setMobilenum(String mobilenum) {
	this.mobilenum = mobilenum;
}

}
