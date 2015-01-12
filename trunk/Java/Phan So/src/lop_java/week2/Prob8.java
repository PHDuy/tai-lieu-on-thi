/**
 * 
 */
package lop_java.week2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author cuongtk
 * 
 */
public class Prob8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String toanTu = "";
		String[] toanHang = new String[2];

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out
					.println("Input a simple math expression (1+3; 7-3; 5*23; 6/2...): ");
			String input = scanner.nextLine();
			// Exit
			if (input.isEmpty()) {
				return;
			}

			StringTokenizer toanTuToken = new StringTokenizer(input,
					"1234567890");
			StringTokenizer toanHangToken = new StringTokenizer(input, "+-*/");

			// Verification
			if ((toanTuToken.countTokens() > 1)
					|| (toanTuToken.countTokens() < 1)) {
				System.out
						.println("The expression is not valid. Please try again!");
				continue;
			}
			if ((toanHangToken.countTokens() > 2)
					|| (toanHangToken.countTokens() < 2)) {
				System.out
						.println("The expression is not valid. Please try again!");
				continue;
			}

			// Processing
			// Have only one token
			toanTu = toanTuToken.nextToken();
			if (!"+-*/".contains(toanTu)) {
				System.out
						.println("The operator is not valid. Please try again!");
				continue;
			}

			int index = 0;
			while (toanHangToken.hasMoreTokens()) {
				toanHang[index++] = toanHangToken.nextToken();
			}
			double left = 0, right = 0;
			try {
				left = Double.parseDouble(toanHang[0]);
				right = Double.parseDouble(toanHang[1]);
			} catch (Exception e) {
				// TODO: handle exception
				System.out
						.println("The operands are not valid. Please try again!");
				continue;
			}
			if (toanTu.equalsIgnoreCase("+")) {
				System.out.println(input + " = " + (left + right));
			} else if (toanTu.equalsIgnoreCase("-")) {
				System.out.println(input + " = " + (left - right));
			} else if (toanTu.equalsIgnoreCase("*")) {
				System.out.println(input + " = " + (left * right));
			} else if (toanTu.equalsIgnoreCase("/")) {
				if (right == 0) {
					System.out.println("Divide zero");
				} else {
					System.out.println(input + " = " + (left / right));
				}
			}
		}
	}

}
