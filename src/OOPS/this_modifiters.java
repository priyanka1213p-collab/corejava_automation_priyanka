package OOPS;

	//this modifier refers to current class property
	//constructor chaining using this()
	//method chaining using this.



	public class this_modifiters {
		
		public this_modifiters() {
			System.out.println("default con");
			// TODO Auto-generated constructor stub
		}
		this_modifiters(int a){
			this(); //no param con
			System.out.println(a);
		}
		this_modifiters(String s){
			this(19);
			System.out.println(s);
		}
		this_modifiters(Double d){
			this("java");
			System.out.println(d);
		}
		
	public static void main(String[] args) {
		this_modifiters t=new this_modifiters(12.22);
	}
	}
