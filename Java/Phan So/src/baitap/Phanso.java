/**
 * 
 */
package baitap;
import java.util.*;
import java.util.StringTokenizer;
/**
 * @author IT
 *
 */

public class Phanso {
	Scanner scan=new Scanner(System.in);
	/**
	 * @param args
	 */
	private int tuso;
	private int mauso;
	public Phanso()
	{		
		this.tuso=0;
		this.mauso=1;
	}
	public void settuso(int tu)
	{
		this.tuso=tu;
	}
	public void setmauso(int mau)
	{
		this.mauso= mau;
	}
	public int gettuso()
	{
		return tuso;
	}
	public int getmauso()
	{
		return mauso;
	}
	public void nhap(String t)
	{
		System.out.print("\nnhap tu so va mau so co dang tu:mau: ");
		String str;
		str=scan.nextLine();
		
	}
	public void xuatPS()
	{
		System.out.println("phan so: "+tuso+":"+mauso);		
	}
	public int rutgon(int a, int b)
	{
		if(a==0 && b!=0)
		{
			return a+b;
		}
		else
		{
			while(a!=b)
			{
				if(a>b)
					a=a-b;
				else
					b=b-a;
			}
			return a;
		}
	}
	public void pheptinh(Phanso a, Phanso b)
	{
		Phanso c= new Phanso();
		System.out.println("\nchon phep tinh: 1.+, 2.-, 3.*, 4./:");
		int chon;
		chon=scan.nextInt();
		if(chon==1)
		{
			c.tuso=a.tuso*b.mauso+a.mauso*b.tuso;
			c.mauso=a.mauso*b.mauso;
			System.out.print("\nket qua: "+c.tuso/rutgon(c.tuso, c.mauso)+":"+c.mauso/rutgon(c.tuso, c.mauso));
		}
		else
		{
			if(chon==2)
			{
				c.tuso=a.tuso*b.mauso-a.mauso*b.tuso;
				c.mauso=a.mauso*b.mauso;
				System.out.print("\nket qua: "+c.tuso/rutgon(c.tuso, c.mauso)+":"+c.mauso/rutgon(c.tuso, c.mauso));
			}
			else
			{
				if(chon==3)
				{
					c.tuso=a.tuso*b.tuso;
					c.mauso=a.mauso*b.mauso;
					System.out.print("\nket qua: "+c.tuso/rutgon(c.tuso, c.mauso)+":"+c.mauso/rutgon(c.tuso, c.mauso));
				}
				else
				{
					if(chon==4)
					{
						c.tuso=a.tuso*b.mauso;
						c.mauso=a.mauso*b.tuso;
						System.out.print("\nket qua: "+c.tuso/rutgon(c.tuso, c.mauso)+":"+c.mauso/rutgon(c.tuso, c.mauso));
					}
					else
					{
						System.out.print("khong thuc hien duoc phep tinh!");		
					}
				}
			}
		}
		/*switch(chon)
		{
			case 1:
			{
				c.tuso=a.tuso*b.mauso+a.mauso*b.tuso;
				c.mauso=a.mauso*b.mauso;
				System.out.print("\nket qua: "+c.tuso+":"+c.mauso);
			}
			case 2:
			{
				c.tuso=a.tuso*b.mauso-a.mauso*b.tuso;
				c.mauso=a.mauso*b.mauso;
				System.out.print("\nket qua: "+c.tuso+":"+c.mauso);
			}
			case 3:
			{
				c.tuso=a.tuso*b.tuso;
				c.mauso=a.mauso*b.mauso;
				System.out.print("\nket qua: "+c.tuso+":"+c.mauso);
			}
			case 4:
			{
				c.tuso=a.tuso*b.mauso;
				c.mauso=a.mauso*b.tuso;
				System.out.print("\nket qua: "+c.tuso+":"+c.mauso);
			}
			default:
			{
				System.out.print("khong thuc hien duoc phep tinh!");			
			}
		}*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phanso a= new Phanso();	
		Phanso b= new Phanso();
		a.nhap();
		a.xuatPS();
		b.nhap();
		b.xuatPS();
		a.pheptinh(a, b);
		
	}

}
