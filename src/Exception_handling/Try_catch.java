package Exception_handling;

public class Try_catch {
		
		void airthmetic_exception() {
			try
			{
			int i=10,y=0;
			double div=i/y;
			System.out.println(div);
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
		}
		
		void array_exception() {
			try {
			int arr[]=new int[3];
			arr[3]=34;
			System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		void null_data() {
			try {
			String s=null;
			System.out.println(s.length());
			}
			catch(NullPointerException e) {
				System.out.println(e);
			}
		}
		void number_format() {
			
			String s="232dfdf32";
			int i=Integer.parseInt(s);
			System.out.println(i);
			
			
		}
		void throw_throws() throws Exception {
			
			int i=-10;
			if(i>0) {
				System.out.println("positive val");
			}
			else {
				throw new Exception("negetive value");
			}
			
			
			
			
		}
	public static void main(String[] args) throws Exception {
		
		Try_catch t=new Try_catch();
		//t.array_exception();
		//t.null_data();
		//t.number_format();
		t.throw_throws();
	}
	}




















