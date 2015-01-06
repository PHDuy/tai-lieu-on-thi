/**
 * 
 */
package caculator;

import java.awt.*;
import java.awt.event.*;

/**
 * @author cuongtk
 * 
 */
public class Calculator extends Frame {

	private Button[] btnNumbers = new Button[10]; // Array of 10 numeric buttons
	private Button btnPlus, btnSub, btnMul, btnDiv, btnClear, btnEqu;
	private TextField tfDisplay;
	private boolean calculated = false;

	/** Constructor to setup GUI components */
	public Calculator() {
		// Set up display panel
		Panel panelDisplay = new Panel(new FlowLayout());
		tfDisplay = new TextField("0", 20);
		panelDisplay.add(tfDisplay);

		// Set up button panel
		Panel panelButtons = new Panel(new GridLayout(4, 4));
		btnNumbers[1] = new Button("1");
		panelButtons.add(btnNumbers[1]);
		btnNumbers[2] = new Button("2");
		panelButtons.add(btnNumbers[2]);
		btnNumbers[3] = new Button("3");
		panelButtons.add(btnNumbers[3]);
		btnPlus = new Button("+");
		panelButtons.add(btnPlus);

		btnNumbers[4] = new Button("4");
		panelButtons.add(btnNumbers[4]);
		btnNumbers[5] = new Button("5");
		panelButtons.add(btnNumbers[5]);
		btnNumbers[6] = new Button("6");
		panelButtons.add(btnNumbers[6]);
		btnSub = new Button("-");
		panelButtons.add(btnSub);

		btnNumbers[7] = new Button("7");
		panelButtons.add(btnNumbers[7]);
		btnNumbers[8] = new Button("8");
		panelButtons.add(btnNumbers[8]);
		btnNumbers[9] = new Button("9");
		panelButtons.add(btnNumbers[9]);
		btnMul = new Button("*");
		panelButtons.add(btnMul);

		btnNumbers[0] = new Button("0");
		panelButtons.add(btnNumbers[0]);
		btnClear = new Button("C");
		panelButtons.add(btnClear);
		btnEqu = new Button("=");
		panelButtons.add(btnEqu);
		btnDiv = new Button("/");
		panelButtons.add(btnDiv);

		setLayout(new BorderLayout()); // "this" Frame sets to BorderLayout
		add(panelDisplay, BorderLayout.NORTH);
		add(panelButtons, BorderLayout.CENTER);

		setTitle("BorderLayout Demo"); // "this" Frame sets title
		setSize(200, 200); // "this" Frame sets initial size
		setVisible(true); // "this" Frame shows

		// Event for the Frame
		addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// Events for each numeric button
		for (int i = 0; i < btnNumbers.length; ++i) {
			final int k = i;
			btnNumbers[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					if(calculated){
						tfDisplay.setText("0");
						calculated = false;
					}
					if (!tfDisplay.getText().equalsIgnoreCase("0")) {
						tfDisplay.setText(tfDisplay.getText() + k);
					} else {
						tfDisplay.setText("" + k);
						
					}
				}
			});
		}

		// Events for operator buttons
		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tfDisplay.setText("0");
			}
		});

		btnDiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(calculated){
					tfDisplay.setText("0");
					calculated = false;
					return;
				}
				tfDisplay.setText(tfDisplay.getText() + "/");
			}
		});

		btnPlus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(calculated){
					tfDisplay.setText("0");
					calculated = false;
					return;
				}
				tfDisplay.setText(tfDisplay.getText() + "+");
			}
		});

		btnMul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(calculated){
					tfDisplay.setText("0");
					calculated = false;
					return;
				}
				tfDisplay.setText(tfDisplay.getText() + "*");
			}
		});

		btnSub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(calculated){
					tfDisplay.setText("0");
					calculated = false;
					return;
				}
				tfDisplay.setText(tfDisplay.getText() + "-");
			}
		});

		btnEqu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String expression = tfDisplay.getText();
				String postFix = ExpressionEvaluator.toPostfix(expression);
				if (ExpressionEvaluator.evaluate(postFix) == -32767) {
					tfDisplay.setText("Error");
				} else {
					tfDisplay.setText(""
							+ ExpressionEvaluator.evaluate(postFix));
				}
				calculated = true;
			}
		});
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();
	}

}