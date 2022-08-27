class test{
	public static void main(String args[]){
		try{
		int a = 0;
		int b = 5/a;
	}
	catch(ArithmeticException e){
		System.out.println(e);
		System.out.println("Working");	
	}
	finally{
		System.out.println("Execute at any cost");
	}
	}
}

//this causes the program named test to stop because once a exception is thrown it must be caught by an exception handler and
// delt with immidiately

// in the above program we have not supplied any exception handler of our code , so the exception is caught by default hander provided by the java runtime system
// any exception that id not caught by your program will ultimately be processed by the default handler the default handler diaplays a string describing the exception 
// prints a stack trace from the point at which the excption accoured and terminates the program