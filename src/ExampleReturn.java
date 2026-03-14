
public class ExampleReturn {

	public static void main(String[] args) {
		System.out.println(" Area = "+calculateArea());
        doIterate();
	}
	public static int calculateArea()
	{
		return 10*10;
	}
    public static void doIterate() {
    	int arr[]= {1,2,3,4,5,6};
    	for(int value : arr) { //for each loop
    		if(value == 10) { // for break  
    			System.out.println("10 number skip the execution");
    			return;
    			
    			
    		}
    		System.out.println("Value from arr = "+value);
    	}
    	System.out.println("End of method");
    }
}
