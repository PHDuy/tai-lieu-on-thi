package java;

public interface NumStackInterface {
	// push a number node to the stack
	public void push(double d);
	//pop a number node out of the stack
	//use EmptyStackException to give errors if necessary.
	public double pop();
	//test if the stack is empty
	public boolean isEmpty();
	// look at the number node at the top of the stack
	//without removing it from the stack.
	//use EmptyStackException to give errors if necessary.
	public double peek();
	
	public double evaluatePostfix(String pf);

}
