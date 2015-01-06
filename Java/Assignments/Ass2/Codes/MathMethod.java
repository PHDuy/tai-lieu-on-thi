/************************************************
 * MathMethod.java --
 *
 * for calling java.lang.Math functions on the fly.
 * pass a method name (i.e. "sin" or "max") and a 
 * number of arguments 1 or 2 to the constructor. 
 * Then call MathMethod's call, passing to it an array
 * of double values as an argument.
 *
 ************************************************/

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class MathMethod {
	private String gMethodName;
	private int gNumArgs;
	private Method gMethod;
	private Math a; // dummy variable, needed to make sure Math 
			// gets compiled!
	private Class gClass;

   /************************
    * returns the String name of the method
    * ***************************/
   public String getName() { return gMethodName; }

   /************************
    * returns the # of args of the method (1 or 2)
    * ************************************/
   public int getNumArgs() { return gNumArgs; }

	/**********************
	 * constructor that takes a string and # of args
	 * *********************/
	public MathMethod(String mMethodName, int mNumArgs) {
		gNumArgs = mNumArgs;
		gMethodName = mMethodName;
		Class[] tArgTypes = new Class[gNumArgs];
		tArgTypes[0] = Double.TYPE;
		if(gNumArgs == 2) tArgTypes[1] = Double.TYPE;
		else if(gNumArgs != 1 && gNumArgs !=2){
			System.out.println("Invalid number of args given to constructor!");
			System.exit(1);
		}
		try {
			gClass = Class.forName("java.lang.Math");
			gMethod = gClass.getMethod(gMethodName, tArgTypes);
		}
		catch(ClassNotFoundException mCNFE) {
			mCNFE.printStackTrace();
		} catch(NoSuchMethodException mNSME) {
			mNSME.printStackTrace();
		} catch(SecurityException mSE) { 
			mSE.printStackTrace();
		}
	}
	
	/****************************************
	 * Method that calls the dynamic
	 * method object that we have
	 * ***************************************/
	public double call(double[] mArgArray) {
		Double result = null;
		try {
			if(gNumArgs == 2)
            result = (Double)gMethod.invoke(gClass, mArgArray[0], mArgArray[1]);
         else result = (Double) gMethod.invoke(gClass, mArgArray[0]);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return result.doubleValue();
	}
}
