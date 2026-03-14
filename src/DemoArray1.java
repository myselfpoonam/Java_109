
public class DemoArray1 {

	public static void main(String[] args) {
		int arr[]; // Declaration
		arr = new int [5]; //Definition
		//int arr[] = new int [5];

		System.out.println(arr);
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[1]=60;
		
		
		System.out.println("value at 1 " +arr[1]);
		System.out.println("value at 2 " +arr[2]);
		System.out.println("value at 3 " +arr[3]);
		System.out.println("value at 4 " +arr[4]);
	}

}

/*
 int -> type of data an array will hold
 arr-> array variable name
 [] -> array symbol
 
 new -> fixed keyword to allocate the memory.
 */
