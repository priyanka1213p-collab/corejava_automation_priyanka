package Encapsulation;

public class CallEmSalary_Encapsulation {
	public static void main(String[] args) {
		Employeesalary e2 = new Employeesalary();
		e2.setEmpld(101);
		e2.setSalary(2500);
		
		System.out.println("Employee Salary: " +e2.getSalary());
		System.out.println("Employee Id :" +e2.getEmpld());
		
	}

}
