
public class ExampleTypeConversion {

	public static void main(String[] args) {
	    int i = 10;
	    long l = i; // automatically - implicit type casting 
	    
	    byte b = (byte) i; //type casting - explicit type casting 
	    
	    long num = 99999999999999999L;
	    int mob_num = (int) num;
	    
	    System.out.println(mob_num);
	    
	    //float to int 
	    
	    float a = 10.0f;
	    float b1 = 3.0f;
	    
	    float f = a/b1; 
	    
	    //float f = 10/3; //int/int => int (3) -> int -> float (3.0)
	    
	    System.out.println(f);
	    int num1 = (int) f;
	    System.out.println(num1);

	}

}
