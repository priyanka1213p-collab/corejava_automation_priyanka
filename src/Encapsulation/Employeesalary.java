package Encapsulation;

public class Employeesalary {
//private data member
private int empld;
private double salary;

//getter for empid
public int getEmpld() {
	return empld;
}
//setter for empid
public void setEmpld(int empld) {
	this.empld = empld;
}

//getter for salary
public double getSalary() {
	return salary;
}
//setter for salary
public void setSalary(double salary) {
	if (salary>0) {
	this.salary = salary;
	
	}
	else {
		System.out.println("Salary can not be negative");
	}
}


}


