/**
 * 
 */
package cocaro;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * @author à®œÛ©ÛžÛ©à®œAnhHazardà®œÛ©ÛžÛ©à®œ
 *
 */
public class menu extends Frame{

	/**
	 * @param args
	 */
	private boolean check= true;
	private String s;
	private int n=10;
	private Button[][] btn_Number =new Button[100][100];
	private Color mau=Color.green;
	public menu()
	{
		final Panel button =new Panel(new GridLayout(10,10));
		khaibao(button);
		setLayout(new BorderLayout());
		add(button, BorderLayout.CENTER);
		
		setVisible(true);
		setTitle("Cá»� Caro");
		setSize(n*40, n*40);		
		
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//set menubar
		MenuBar mbar= new MenuBar();
		setMenuBar(mbar);
		
		//===============================set menu "play"===========================================
		Menu play= new Menu("Play");
		mbar.add(play);
		
		//set menuitem of this menu
		MenuItem New = new MenuItem("New", new MenuShortcut(KeyEvent.VK_N));
		play.add(New);
		New.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
				menu_new();
			}
		});
		
		MenuItem Resize = new MenuItem("Resize");
		play.add(Resize);
		Resize.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub		
				String p=JOptionPane.showInputDialog(null, "input number");
				int m= Integer.parseInt(p);
				String [][]q= new String[n][n];						
				
				for(int i=0; i<n; i++)
				{
					for(int j=0; j<n; j++)
					{
						q[i][j]= btn_Number[i][j].getLabel();
					}
				}	
				
				int num = n;
				n=m;		
				
				removeAll();
				
				final Panel size =new Panel(new GridLayout(m,m));
				khaibao(size);
				
				setLayout(new BorderLayout());
				add(size, BorderLayout.CENTER);
				setSize(n*40, n*40);
				
				for(int i=0; i<n; i++)
				{
					for(int j=0; j<n; j++)
					{
						btn_Number[i][j].setVisible(true);
					}
				}
				
				
				for(int i=0; i<num; i++)
				{
					for(int j=0; j<num; j++)
					{
						btn_Number[i][j].setLabel(q[i][j]);
					}
				}
				setVisible(true);
				
			}
		});
		
		Menu ChangeColor = new Menu("Change Color");
		play.add(ChangeColor);
		MenuItem color = new MenuItem("Color background");
		ChangeColor.add(color);
		color.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				set_color();
				setVisible(true);
			}
		});
		
		MenuItem win = new MenuItem("Win");
		ChangeColor.add(win);
		win.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				color_win();
			}
		});
		
		MenuItem quit = new MenuItem("Quit", new MenuShortcut(KeyEvent.VK_Q));
		play.add(quit);
		quit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(JOptionPane.showConfirmDialog(null, " "," ",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
			}
		});
		
		//===============================set menu "help"===========================================
		Menu Help= new Menu("Help");
		mbar.add(Help);
		
		//set menuitem of this menu
		MenuItem Introduction = new MenuItem("Introduction");
		Help.add(Introduction);
		Introduction.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Nguyen Tuan Anh\n"+"CD12TT1\n"
						+"Người chơi sử dụng chuột để thực hiện các nước đi. Khi người chơi click chuột vào một ô bất kỳ của bàn cờ, nếu là người đi đầu tiên, ô bị click sẽ xuất hiện ký tự “O” (đại diện cho quân cờ của người số 1), ngược lại sẽ là ký tự “X” (đại diện cho quân cờ của người số 2).\n"
						+"Khi một trong hai người chơi có được 5 ô liên tiếp (dọc, ngang hoặc chéo) chứa quân cờ đại diện cho mình thì người đó thắng cuộc, khi đó 5 ô tương ứng sẽ đổi sang mầu khác và ván cờ kết thúc.");
			}
		});
	}
	
	public void khaibao(final Panel button)
	{
		int m=n;
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<m; j++)
			{
				btn_Number[i][j] =  new Button(" ");				
				final int i1=i;
				final int j1=j;
				button.add(btn_Number[i][j]);
				btn_Number[i][j].setVisible(false);
				//btn_Number[i1][j1].setVisible(false);
				btn_Number[i][j].addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
						if(btn_Number[i1][j1].getLabel().equalsIgnoreCase(" "))
						{
							if(check==true)
							{
								s="X";				
								check=false;										
							}
							else
							{
								s="O";
								check=true;
							}
							btn_Number[i1][j1].setLabel(s);
							if(ngang(i1, s)==true|| doc(j1, s)==true|| cheochinh(i1, j1, s)==true|| cheophu(i1, j1, s)==true)
							{
								JOptionPane.showMessageDialog(null, s+" won");
								int kq= JOptionPane.showConfirmDialog(null, "are you want begin game?", "Config", JOptionPane.YES_NO_OPTION);
								if(kq==0)
									menu_new();
								else
									System.exit(0);
							}
							
						}
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						// TODO Auto-generated method stub						
					}
				});
				btn_Number[i1][j1].setBackground(Color.LIGHT_GRAY);
			}				
		}  	
	}	
	
	//==========================================cai dat mÃ u==============================
	public void set_color()
	{
		Color color = JColorChooser.showDialog(this, "bang mau", Color.cyan);
		if(color != null)
		{
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<n; j++)
				{
					final int i1=i;
					final int j1=j;
					btn_Number[i1][j1].setBackground(color);
				}
			}
		}
	}
	

	
	//===============================tÃ­nh ngÆ°á»�i chiáº¿n tháº¯ng==================================
					//ngang
	public boolean ngang(int ii, String p)
	{
		int dem=0;
		for(int j=0; j<n; j++)
		{
			if(btn_Number[ii][j].getLabel().equals(p))
			{
				dem++;
				if(dem==5)
				{
					//set color for your won
					while(j!=0)
					{
						btn_Number[ii][j--].setBackground(mau);
						dem--;
						if(dem==0)
							return true;
					}
				}
			}
			else
				dem=0;
			
		}
		return false;
	}
				//doc
	public boolean doc(int j1, String p)
	{
		int dem=0;
		for(int i=0; i<n; i++)
		{		
			if(btn_Number[i][j1].getLabel().equals(p))
			{		
				
				dem++;
				if(dem==5)
				{
					
					while(i!=0)
					{
						btn_Number[i--][j1].setBackground(mau);
						dem--;
						if(dem==0)
							return true;
					}
				}
			}
			
			else
				dem=0;	
		}
		return false;
	}
	
					//cheo chinh
	public boolean cheochinh(int i1, int j1, String p)
	{
		int dem=0;
		while(i1!=0 && j1!=0)
		{
			--i1;
			--j1;
		}
		while(i1<n && j1<n)
		{
			if(btn_Number[i1++][j1++].getLabel().equals(p))
			{
				++dem;		
				if(dem==5)
				{
					while (i1 != 0 &&j1 != 0)
	            	{
	            		btn_Number[--i1][--j1].setBackground(mau);
	            		dem--;
	            		if(dem==0)
	            			 return true;
	            	}
				}
			}
			else 
				dem=0;	
			
		}
		return false;
	}
	
	//cheo phu
	public boolean cheophu(int i1, int j1, String p)
	{
		int dem=0;
		while(j1!=n-1 && i1!=0)
		{			
			--i1;
			++j1;
		}
		while(i1< n && j1!= -1)
		{
			if(btn_Number[i1++][j1--].getLabel().equals(p))
			{
				++dem;	
				if(dem==5)
				{
					while (i1 !=0 &&j1 >n-1)
	            	{
	            		btn_Number[--i1][++j1].setBackground(mau);
	            		dem--;
	            		if(dem==0)
	            			return true;
	            	}
				}
			}
			else 
				dem=0;	
			
		}
		return false;
	}	
	
	//=============================new==================================================
	public void menu_new()
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)		
			{
				btn_Number[i][j].setLabel(" ");
				btn_Number[i][j].setBackground(Color.LIGHT_GRAY);
				btn_Number[i][j].setVisible(true);
				check= false;
			}
		}
	}
	
	public void color_win()
	{
		mau = new JColorChooser().showDialog(this, "bang mau", null);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new menu();
	}

}
