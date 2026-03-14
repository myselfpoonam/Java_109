
public class FirstProject {

	public static void main(String[] args) { // Main method entry point in the program execution
		System.out.println("Welcome to JAVA Class. " + args [0]+ " " +args[1]); // sysout
		System.out.println("iInput value from args "+ args[0]);

	}
	public void show () { // access-modifier return-type/void method-name ( may or may not have parameter list ) {}
		//body of the method
	}

}
/* 
 public: Access Modifier = accessible from every where
 class: Pre-definrf keyword used to create or declare class
 FirstProject: Class name or program name ( provide by user )
               Name has to be same as file name, if class is declared as public, always prefer to use same name. 
 static: make main method visible to be executed.
 void:return type. Nothing to be returned. 
 main: Fixed method name. If we change the name then it will not allow to execute the program.  
 String: Pre-defined class in java ( any char/special char/ num /alphabet
 []: to represent an array.
 args: variable name - used to accept the input value(s) during program execution. 
 System: Class name System.
 out: Object of printstream used to call the println() method.
 println: pre-defined method used to print value on console.
*/