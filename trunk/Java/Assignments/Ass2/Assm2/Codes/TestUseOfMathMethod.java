package lop_java.assignments;

public class TestUseOfMathMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sinMethod = "sin";
		int numOfSinArg = 1;

		String maxMethod = "max";
		int numOfMaxArg = 2;

		// Thuc hien tinh ham sin(30)
		MathMethod sin = new MathMethod(sinMethod, numOfSinArg);
		double[] x_sin = new double[numOfSinArg];
		x_sin[0] = 30;

		// Thuc hien ham max(29, 60)
		MathMethod max = new MathMethod(maxMethod, numOfMaxArg);
		double[] x_max = new double[numOfMaxArg];
		x_max[0] = 29;
		x_max[1] = 60;

		// Tinh ham sin(x)
		double result = sin.call(x_sin);
		System.out.println("Gia tri ham sin(30)= " + result);

		// Tinh ham max(29, 60)
		result = max.call(x_max);
		System.out.println("Gia tri ham max (29, 60)= " + result);
	}

}
