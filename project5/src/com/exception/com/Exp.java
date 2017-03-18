package com.exception.com;

public class Exp {
	 static void myMethod(int testnum) throws Exception {
	      System.out.println ("START - myMethod");
	      if (testnum == 12) 
	         throw new Exception();
	      System.out.println("END - myMethod");
	      return;	
	   }
	   public static void main(String  args[]) {
	      int testnum = 12;
	      try {
	         System.out.println("try - first statement");
	         myMethod(testnum);
	         System.out.println("try - last statement");
	      }
	      catch ( Exception ex) {
	         System.out.println("An Exception");
	      }
	      finally {
	         System.out.println( "Finally") ;
	      }
	      System.out.println("Out of try/catch/finally - statement");
	   }

	
}

