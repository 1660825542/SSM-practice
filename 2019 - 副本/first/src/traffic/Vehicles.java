package traffic;

import java.util.Scanner;

public class Vehicles {
	protected
		String brand="��",color="��",type="��";
		double ran,liang;Scanner sc=new Scanner(System.in);
	
	protected Vehicles()
	{
		System.out.print("�������̱꣺");
		brand=sc.nextLine();
		System.out.print("���������ͣ�");
		type=sc.nextLine();
		System.out.print("��������ɫ��");
		color=sc.nextLine();
		System.out.print("������ȼ������");
		ran=sc.nextDouble();
		System.out.print("����������������");
		liang=sc.nextDouble();
	}
	protected Vehicles(String b,String t,String c,double r,double l)
	{
		brand=b;
		color=c;
		type=t;
		ran=r;
		liang=l;
	}
	protected void run()
	{
		System.out.println(color+"��"+brand+"�Ѿ�������");
	}
	protected void showInfo()
	{
		System.out.println("�̱꣺"+brand);
		System.out.println("���ͣ�"+type);
		System.out.println("��ɫ��"+color);
		System.out.println("ȼ������"+ran);
		System.out.println("����������"+liang);
	}
	protected double journey()
	{
		return liang/ran*100;
	}
	
	protected String getbrand()
	{
		return brand;
	}
	protected String getcolor()
	{
		return color;
	}
	protected String gettype()
	{
		return type;
	}
	protected double getran()
	{
		return ran;
	}
	protected double getliang()
	{
		return liang;
	}
	
	protected void setbrand(String s)
	{
		brand= s ;
	}
	protected void setcolor(String s)
	{
		color= s ;
	}
	protected void settype(String s)
	{
		type= s ;
	}
	protected void setran(double s)
	{
		ran= s ;
	}
	protected void setliang(double s)
	{
		liang= s ;
	}

}
