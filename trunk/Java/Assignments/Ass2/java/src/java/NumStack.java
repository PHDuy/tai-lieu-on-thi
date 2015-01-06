package java;
import java.io.FileOutputStream;

import java.io.*;
import java.util.Stack;
import java.util.Scanner;
import java.util.StringTokenizer;
public class NumStack implements NumStackInterface {
		
	NumNode top= null;	
	String[] Numarg= new String[50];
	int gt=0;
	int[] nummath= new int[50];
	
	public NumStack()
	{
	}
	@Override
	public void push(double d) {
		// TODO Auto-generated method stub
		NumNode node= new NumNode(d);
		if(isEmpty())
		{
			System.out.print("stack day");
		}
		else
		{
			node.next=top;
			top=node;
		}
	}

	@Override
	public double pop() {
		// TODO Auto-generated method stub
		NumNode node= new NumNode();
		node=top;
		top=node.next;
		return node.num;		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(top==null)
			return true;
		else
			return false;
	}

	@Override
	public double peek() {
		// TODO Auto-generated method stub
		double d=0;
		d=top.num;
		return d;
	}

	
	public NumStack(String fileName)
	{
		if(fileName == null)
		{
			try
			{
				FileOutputStream fi= new FileOutputStream ("function.txt", true);
				PrintWriter print= new PrintWriter(fi);
				print.println("sin 1");
				print.println("toDegrees 1");
				print.println("min 2");
				print.println("max 2");
				print.println("abs 1");
				print.println("sqrt 1");
			}
			catch(IOException e)
			{
				
			}
		} 
		
		else
		{
			try
			{
				String s;
				
				BufferedReader console = new BufferedReader(new FileReader(fileName));
					
				while((s = console.readLine()) != null)
				{		
					StringTokenizer line = new StringTokenizer(s);
					String methodName = line.nextToken();
					int numOfArg = Integer.parseInt(line.nextToken());
					nummath[gt]=numOfArg;	
					Numarg[gt]=methodName;
					gt++;
					
				}
			}catch(Exception e)
			{
				System.out.println(" The file format does not match or file not found");
			}
			
		}

	}

	
	public double evaluatePostfix(String postfix)
	{
		double a, b, c, d;
		String str;
		StringTokenizer token= new StringTokenizer(postfix, " ");
		while(token.hasMoreTokens())
		{
			str= token.nextToken();
			if(str.equals("+"))
			{
				try
				{
					a=pop();
					b=pop();
				}
				catch(Exception e)
				{
					throw new IllegalArgumentException();
				}
				c=a+b;
				push(c);
			}
			else
			{
				if(str.equals("-"))
				{
					try
					{
						a=pop();
						b=pop();
					}
					catch(Exception e)
					{
						throw new IllegalArgumentException();
					}
					c=a-b;
					push(c);
				}
				else
				{
					if(str.equals("*"))
					{
						try
						{
							a=pop();
							b=pop();
						}
						catch(Exception e)
						{
							throw new IllegalArgumentException();
						}
						c=a*b;
						push(c);
					}
					else
					{
						if(str.equals("/"))
						{
							try
							{
								a=pop();
								b=pop();
							}
							catch(Exception e)
							{
								throw new IllegalArgumentException();
							}
							c=a/b;
							push(c);
						}
						else
						{
							if(str.equals("sin"))
							{
								MathMethod math= null;
								for(int i=0; i<gt; i++)
								{
									String p = Numarg[i];
									int p1= nummath[i];
									if(p.equals("sin"))
									{
										math= new MathMethod(Numarg[i], nummath[i]);
										double[] sin= new double[nummath[i]];
										try
										{
											sin[nummath[i]-1]=pop();
										}
										catch(Exception e)
										{
											throw new IllegalArgumentException();
										}
										c=math.call(sin);
										push(c);
									}
								}								
							}
							else
							{
								if(str.equals("toDegrees"))
								{
									MathMethod math= null;
									for(int i=0; i<gt; i++)
									{
										String p = Numarg[i];
										int p1= nummath[i];
										if(p.equals("toDegrees"))
										{
											math= new MathMethod(Numarg[i], nummath[i]);
											double[] toDegrees= new double[nummath[i]];
											try
											{
												toDegrees[nummath[i]-1]=pop();
											}
											catch(Exception e)
											{
												throw new IllegalArgumentException();
											}
											c=math.call(toDegrees);
											push(c);
										}
									}									
								}
								else
								{
									if(str.equals("min"))
									{
										MathMethod math= null;
										for(int i=0; i<gt; i++)
										{
											String p = Numarg[i];
											int p1= nummath[i];
											if(p.equals("min"))
											{
												math= new MathMethod(Numarg[i], nummath[i]);
												double[] min= new double[nummath[i]];
												try
												{
													min[nummath[i]-1]=pop();
												}
												catch(Exception e)
												{
													throw new IllegalArgumentException();
												}
												c=math.call(min);
												push(c);
											}
										}									
									}
									else
									{
										if(str.equals("max"))
										{
											MathMethod math= null;
											for(int i=0; i<gt; i++)
											{
												String p = Numarg[i];
												int p1= nummath[i];
												if(p.equals("min"))
												{
													math= new MathMethod(Numarg[i], nummath[i]);
													double[] max= new double[nummath[i]];
													try
													{
														max[nummath[i]-1]=pop();
													}
													catch(Exception e)
													{
														throw new IllegalArgumentException();
													}
													c=math.call(max);
													push(c);
												}
											}						
										}
										else
										{
											if(str.equals("abs"))
											{
												MathMethod math= null;
												for(int i=0; i<gt; i++)
												{
													String p = Numarg[i];
													int p1= nummath[i];
													if(p.equals("abs"))
													{
														math= new MathMethod(Numarg[i], nummath[i]);
														double[] abs= new double[nummath[i]];
														try
														{
															abs[nummath[i]-1]=pop();
														}
														catch(Exception e)
														{
															throw new IllegalArgumentException();
														}
														c=math.call(abs);
														push(c);
													}
												}						
											}
											else
											{
												if(str.equals("sqrt"))
												{
													MathMethod math= null;
													for(int i=0; i<gt; i++)
													{
														String p = Numarg[i];
														int p1= nummath[i];
														if(p.equals("sqrt"))
														{
															math= new MathMethod(Numarg[i], nummath[i]);
															double[] sqrt= new double[nummath[i]];
															try
															{
																sqrt[nummath[i]-1]=pop();
															}
															catch(Exception e)
															{
																throw new IllegalArgumentException();
															}
															c=math.call(sqrt);
															push(c);
														}
													}						
												}
												else{
													try
													{
													push(Double.parseDouble(str));
													}
													catch(Exception e)
													{
														throw new IllegalArgumentException();
													}

												
												}
											}
										}
									}
								}
							}						
						}
					}
				}
			
			}
		}
		d=pop();
	    return d;
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
