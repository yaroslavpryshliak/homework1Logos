package myexception;

public class Main {
	

	public static void main(String[] args) throws MyException , IllegalAccessException {
		
	try {
			      exceptionMethod(-6, -4);
			  } catch (IllegalArgumentException e) {
			   System.out.println("change argument    ---Error handling");
			  }
			  
			  try {
				  exceptionMethod(7, 0);
			  } catch (ArithmeticException e) {
			   System.out.println("one argument = 0    ---Error handling");
			  }
			  
			  try {
				  exceptionMethod(21, 23);
			  } catch (MyException e) {
			   System.out.println("bought of argument pozitive   ---Error handling");
			  }
			  
			  try {
				  exceptionMethod(0, 0);
			  } catch (ArithmeticException e) {
			   System.out.println("bought of argument = 0    ---Error handling");
			  }
			  
			  
			   
		}
			  
				static void exceptionMethod(int a, int b) throws MyException , IllegalAccessException{
					  if(a < 0 || b < 0){
					   throw new IllegalArgumentException("value is negative  EXCEPTION");
					  }
					  if((a == 0 && b != 0) || (a != 0 && b == 0)){
					   throw new ArithmeticException ("one of values equals 0   EXCEPTION");
					  }
					  if(a == 0 && b == 0){
					   throw new IllegalAccessException  ("bought of value equals 0   EXCEPTION");
					  }
					  if(a > 0 && b > 0){
					   throw new MyException("bought of is positive   EXCEPTION");
					  }
			  
				}

}
