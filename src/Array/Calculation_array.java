package Array;

public class Calculation_array {
	public Calculation_array() {
		//find sum of array elements
			int arr[]= {2,3,3,4,5,6,7};
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum=sum+arr[i];
			}
			System.out.println("Sum of array elements is: "+sum);
			// TODO Auto-generated constructor stub
		}	
		void maxnum() {
			int arr[]= {0,1,2,3,4,544,6,77};
			int max=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>max) {
					max=arr[i];
					
				}
			}
			System.out.println("Maximum number in array is: "+max);
		}
		void revserse_array() {
			int arr[]= {1,2,3,4,5,6};
			System.out.println("Array in reverse order:");
			for(int i=arr.length-1;i>=0;i--) {
				System.out.println(arr[i]);
			}
		}
		public static void main(String[] args) {
			Calculation_array c=new Calculation_array();
			c.maxnum();
			c.revserse_array();
	}
	}

