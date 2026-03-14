
public class BreakExample {

	public static void main(String[] args) {
		 for(int i=1; i<=10; i++){
	            if(i==5)
	                break;
	            System.out.println("For loop: " + i);
	        }

	        // break in do-while loop
	        int j=1;
	        do{
	            if(j==5)
	                break;
	            System.out.println("Do-while: " + j);
	            System.out.println	("Poonam");            j++;
	        }while(j<=10);

	        // break in foreach loop
	        int arr[] = {1,2,3,4,5,6};

	        for(int num : arr){
	            if(num==4)
	                break;
	            System.out.println("Foreach: " + num);
	        }
	    

	}

}
