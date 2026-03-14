
public class Assignment2_2D {

	public static void main(String[] args) {
		int arr[][]= {
				{1,3,5},
				{9,4,10}};
		int sum = arr[0][0]+arr[0][1]+arr[0][2]
                +arr[1][0]+arr[1][1]+arr[1][2];
		
		int multi = arr[0][0]*arr[0][1]*arr[0][2]
                *arr[1][0]*arr[1][1]*arr[1][2];
		
		int sub =  arr[0][0]-arr[0][1]-arr[0][2]
                -arr[1][0]-arr[1][1]-arr[1][2];
		
		int div =  arr[0][0]/arr[0][1]/arr[0][2]
                /arr[1][0]/arr[1][1]/arr[1][2];
		
		 int sub1 = arr[1][0] - arr[0][0];  
	     int mul1 = arr[0][1] * arr[1][2];   
	     int div1 = arr[0][2] / arr[1][0];   
	     
	     System.out.println("Sum = " + sum);
	        System.out.println("Subtraction = " + sub);
	        System.out.println("Multiplication = " + multi);
	        System.out.println("Division = " + div);
		

	}

}
