
public class ExampleContinue {

	public static void main(String[] args) {
		// continue in for loop
        for(int i=1; i<=10; i++){
            if(i==5)
                continue;
            System.out.println("For loop: " + i);
        }

        // continue in do-while loop
        int j=0;

        do{
            j++;
            if(j==5)
                continue;

            System.out.println("Do-while: " + j);

        }while(j<10);

        // continue in foreach loop
        int arr[] = {1,2,3,4,5,6};

        for(int num : arr){
            if(num==4)
                continue;
            System.out.println("Foreach: " + num);
        }

	}

}
