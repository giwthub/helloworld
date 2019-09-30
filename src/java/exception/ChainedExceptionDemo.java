package exception;

public class ChainedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}
	
	
	
	
	
	
	public static void method1() throws Exception{
		try {
			method2();
			
		}
		catch(Exception ex){
			throw new Exception("New info from method2", ex);
		}
	}
	
	public static void method2() throws Exception{
		throw new Exception("New info from method2");
	}
	
	

}
