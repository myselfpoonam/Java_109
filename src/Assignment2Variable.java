
public class Assignment2Variable {

	int instanceVar=50;
	
	static int staticVar=100;
	
	public void show() {
		
		int localVar =10;
		
		System.out.println ("Local Variable: "+ localVar);
		
		System.out.println ("Instance Variable: " + instanceVar);
		
		System.out.println ("Static Variable: "+ staticVar);
		
		
	}
	public static void main(String[] args) {
		
		Assignment2Variable obj = new Assignment2Variable();
		obj.show();
		

	}

}
