package OOPS;
class Student {

    private String name;   // data hiding

    public void setName(String name) {   // setter
        this.name = name;
    }

    public String getName() {             // getter
        return name;
    }

   // public static void main(String[] args) {


//public class Task_Encapsulation {
	public static void main(String[] args) {
		Student s = new Student();
        s.setName("Priyanka");
        System.out.println(s.getName());
		
	}
		
	}


