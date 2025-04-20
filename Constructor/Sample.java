package Constructor;

class Sample  
{
        Sample()
        {
                System.out.println("Constructor called");
        }

        public static void main(String[] args)
        {
            System.out.println("Main method called");
                new Sample();
            System.out.println("Main method ended");
		}
}

//
//1. Special method which is used to initilize the variable/data members
//2. RULES
//		1. class name and constroctor name must need to be same.
//		2. This is non-static.
//		3. no return statement is there 
//		4. can't able to return any value
//		5. when object is created on that time constructor is automatically going to executed.

