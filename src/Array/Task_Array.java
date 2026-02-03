package Array;
class Employee {
    int emp_id;
    String emp_name;
    double emp_salary;

    Employee(int emp_id, String emp_name, double emp_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
    }   

}

class FullTimeEmployee extends Employee {
    double bounus;

    FullTimeEmployee(int emp_id, String emp_name, double emp_salary, double bounus) {
        super(emp_id, emp_name, emp_salary);
        this.bounus = bounus;
    }

    void calculate_salary() {
        emp_salary = emp_salary + bounus;
        //System.out.println(emp_salary);
    }

}

class PartTimeEmployee extends Employee {

    int hours_worked;
    double hourly_rate;

    PartTimeEmployee(int emp_id, String emp_name, double emp_salary, int hours_worked, double hourly_rate) {
        super(emp_id, emp_name, emp_salary);
        this.hours_worked = hours_worked;
        this.hourly_rate = hourly_rate;
    }

    void calculate_salary() {
        emp_salary = hours_worked * hourly_rate;
       // System.out.println(emp_salary);
    }
}

public class Task_Array {
	public static void main(String[] args) {
		Employee[] employees = new Employee[6];
        employees[0] = new Employee(1, "yogita", 10000.0);
        employees[1] = new Employee(2, "priynaka", 20000.0);
        employees[2] = new Employee(3, "shefali", 30000.0);
        employees[3] = new Employee(4, "test", 50000.0);

        // Store both FullTimeEmployee and PartTimeEmployee objects in the same array
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(5, "fulltime", 1000.0, 10000.0);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(6, "parttime", 500.0, 10, 1000.0);
        employees[4] = fullTimeEmployee;
        employees[5] = partTimeEmployee;
        fullTimeEmployee.calculate_salary();
        partTimeEmployee.calculate_salary();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].emp_id + " " + employees[i].emp_name + " " + employees[i].emp_salary);
        }

    }



		
	}


