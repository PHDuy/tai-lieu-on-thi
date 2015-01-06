package java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test {
	public static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
      
		//if no argument, read input from user
		if(args.length < 1) {
    	  try{
    		  String pf=null;
    		  NumStack ns=new NumStack();
    		  
    		  System.out.println("Please enter the postfix expression: ");
    		  pf=stdin.readLine();
    		  double result=ns.evaluatePostfix(pf);
    		  System.out.println("The result of ("+pf+") is: "+result);
    	  }catch (IOException e){
    		  e.printStackTrace();
    	  }
     
      } else if(args[0].equalsIgnoreCase("c")) {
         System.out.println("Running C level...");
         ctest();
      } else if(args[0].equalsIgnoreCase("b")) {
         System.out.println("Running B level...");
         btest();
      } else if(args[0].equalsIgnoreCase("a")) {
         System.out.println("Running A level...");
         atest();
      }
   }
	
	public static void ctest() {
		NumStack ns=new NumStack();
		String pf="12 3 +";
		System.out.println("The result of ("+ pf + ") is: "+ ns.evaluatePostfix(pf));
		
		pf="16 2 /";
		System.out.println("The result of ("+ pf + ") is: "+ ns.evaluatePostfix(pf));
		
		pf="5 3 4 + *";
		System.out.println("The result of ("+ pf + ") is: "+ ns.evaluatePostfix(pf));	
	}
	 
	 public static void btest() {
		NumStack ns=new NumStack();
		
		String pf="1.2.2 3 +";
      try {
   		System.out.println("The result of ("+ pf + ") is: "+ ns.evaluatePostfix(pf));
      } catch(Exception e) {
         System.err.println("Caught exception (should be IllegalArgument): "+e);
         e.printStackTrace();
      }
		
      try {
   		pf="1..2 3 +";
   		System.out.println("The result of ("+ pf + ") is: "+ ns.evaluatePostfix(pf));
      } catch(Exception e) {
         System.err.println("Caught exception (should be IllegalArgument): "+e);
         e.printStackTrace();
      }
		
      try {
   		pf="12 /";
   		System.out.println("The result of ("+ pf + ") is: "+ ns.evaluatePostfix(pf));
      } catch(Exception e) {
         System.err.println("Caught exception (should be IllegalPostfixExpression): "+e);
         e.printStackTrace();
      }
		
      try {
   		pf="3 8 + 7 * -";
   		System.out.println("The result of ("+ pf + ") is: "+ ns.evaluatePostfix(pf));	
      } catch(Exception e) {
         System.err.println("Caught exception (should be IllegalPostfixExpression): "+e);
         e.printStackTrace();
      }
	 }
	 
	 public static void atest() {
      System.out.println("Initializing NumStack with functions.txt...");
		NumStack ns=new NumStack("functions.txt");
		String pf="30 toDegrees sin";
		System.out.println("The result of ("+ pf + ") is: "+ ns.evaluatePostfix(pf));
			
		pf="-2 abs 4 abs max sqrt";
		System.out.println("The result of ("+ pf + ") is: "+ ns.evaluatePostfix(pf));	
	 }

}
