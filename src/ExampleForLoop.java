
public class ExampleForLoop {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println("array "+ arr);

		System.out.println("Value in array "+ arr[0]);

		for (int i=arr.length-1; i>0; i--) {
			System.out.println("Value in array index " +i+" = " +arr[i]);
		}
		for (int i=0; i < arr.length ; i++) {
			System.out.println("Value in arry index " + i + " = " +arr[i]);
		}
		
	for(int value : arr) { //for each loop
		if(value % 2 == 0) { // for break  
			System.out.println("Even number skip the execution");
			continue; // must be the last statement in that block of code
			// System.out.println("Even number skip the execution"); // unreachable block of code 
			
		}
		System.out.println("Value from arr = "+value);
	}
}

}
