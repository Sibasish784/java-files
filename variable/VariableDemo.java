public class VariableDemo 
{
    public static void main(String[] args) 
		{
        
		//1) Declaration of a variable
			int a;

        //2) Initialization of the variable
			a = 10;
		
        //3) Declaration and initialization in one line
			int b = 20; 

        //4) Utilization of the variables
			System.out.println("Value of a: " + a); // Output: Value of a: 10
			System.out.println("Value of b: " + b); // Output: Value of b: 20

        //5) Value re-initialization
			a = 30; // 'a' is re-initialized with the value 30
			System.out.println("New value of a: " + a); // Output: New value of a: 30

        //6) Copying value using another variable
			int c; // Declaration of variable 'c'
			c = a; // Copying the value of 'a' into 'c'
			System.out.println("Value of c (copied from a): " + c); // Output: Value of c (copied from a): 30
		}
}
