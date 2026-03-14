
public class Return_Demo {

	public static void main(String[] args) {
		testFor();
        testDoWhile();
        testForEach();
    }

    static void testFor(){
        for(int i=1;i<=10;i++){
            if(i==5)
                return;
            System.out.println("For loop: "+i);
        }
    }

    static void testDoWhile(){
        int i=1;

        do{
            if(i==5)
                return;
            System.out.println("Do-while: "+i);
            i++;
        }while(i<=10);
    }

    static void testForEach(){
        int arr[]={1,2,3,4,5};

        for(int num:arr){
            if(num==4)
                return;
            System.out.println("Foreach: "+num);
        }

	}

}
