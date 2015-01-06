package testUI;
import java.awt.*;
import java.awt.event.*;

import caculator.Calculator;
public class ui extends Frame{
	private Button[] btnSinhvien = new Button[10];
	private Button btnLopsv, btnDat, btnKhongdat, btnThoat;
	private TextField tfDisplay;
	private Label lb;
	//-------------------------------------------
	public ui()
	{
		Panel panelDisplay = new Panel(new FlowLayout());
		lb=new Label("Chương Trình Quản Lý Học Sinh-Sinh Viên");
		panelDisplay.add(lb);
		//======================================================
		Panel panelButtons = new Panel(new GridLayout(4, 1));
		btnSinhvien[1] = new Button("Lop SV");
		panelButtons.add(btnSinhvien[1]);
		btnSinhvien[2] = new Button("SV dat");
		panelButtons.add(btnSinhvien[2]);
		btnSinhvien[3] = new Button("SV khong dat");
		panelButtons.add(btnSinhvien[3]);
		btnSinhvien[4] = new Button("Thoat");
		panelButtons.add(btnSinhvien[4]);
		
		setLayout(new BorderLayout()); // "this" Frame sets to BorderLayout
		add(panelDisplay, BorderLayout.NORTH);
		add(panelButtons, BorderLayout.CENTER);

		setTitle("SGi.Hunters"); // "this" Frame sets title
		setSize(500, 500); // "this" Frame sets initial size
		setVisible(true); // "this" Frame shows
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ui();
	}
}
