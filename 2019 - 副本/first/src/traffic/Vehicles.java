package traffic;

import java.util.Scanner;

public class Vehicles {
	protected
		String brand="无",color="无",type="无";
		double ran,liang;Scanner sc=new Scanner(System.in);
	
	protected Vehicles()
	{
		System.out.print("请输入商标：");
		brand=sc.nextLine();
		System.out.print("请输入类型：");
		type=sc.nextLine();
		System.out.print("请输入颜色：");
		color=sc.nextLine();
		System.out.print("请输入燃油量：");
		ran=sc.nextDouble();
		System.out.print("请输入油箱容量：");
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
		System.out.println(color+"的"+brand+"已经开动了");
	}
	protected void showInfo()
	{
		System.out.println("商标："+brand);
		System.out.println("类型："+type);
		System.out.println("颜色："+color);
		System.out.println("燃油量："+ran);
		System.out.println("油箱容量："+liang);
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
