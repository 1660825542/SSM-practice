package telebill;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

	private Scanner sc=new Scanner(System.in);
	private Operate op=new Operate();
	
	public void mainMenu() //主菜单
	{
		System.out.println("**************************");
		System.out.println("**       1 添加记录                 **");
		System.out.println("**       2 查找记录                 **");
		System.out.println("**       3 修改记录                 **");
		System.out.println("**       4 删除记录                 **");
		System.out.println("**       5 排序记录                 **");
		System.out.println("**       6 退出系统                 **");
		System.out.println("**************************");
		
		System.out.println("请输入正确的数字，范围1-6");
		System.out.print("请输入操作数：");
		
		int x = 0;
		String s=sc.next();
		try{
			x=Integer.parseInt(s);
			if(x<1||x>6)
			{
				System.out.println("输入错误");
				this.mainMenu();
			
			}
			
		}catch(Exception e)
		{
			System.out.println("输入错误");
			this.mainMenu();
		}
		
		if(x==1)
			addMenu();
		else if(x==2)
			searchMenu();
		else if(x==3)
			modifyMenu();
		else if(x==4)
			deleteMenu ();
		else if(x==5)
			orderMenu ();
		else 
			System.exit(0);
		
	}
	public void addMenu() //添加用户菜单
	{
		System.out.println("**************************");
		System.out.println("**       1 添加新记录              **");
		System.out.println("**       2 查看全记录              **");
		System.out.println("**       3 返回上一级              **");
		System.out.println("**************************");
		
		System.out.println("请输入正确的数字，范围1-3");
		System.out.print("请输入操作数：");
		
		int x = 0;
		String s=sc.next();
		try{
			x=Integer.parseInt(s);
			if(x<1||x>3)
			{
				System.out.println("输入错误");
				this.addMenu();
			}
		}catch(Exception e)
		{
			System.out.println("输入错误");
			this.addMenu();
		}
		
		
		if(x==1)
		{
			op.addLogic();
			addMenu();
		}
			
		else if(x==2)
		{
			op.showAll();
			addMenu();
		}
		else 
			mainMenu();
		
		
	}
	public void searchMenu() //查找用户菜单
	{
		System.out.println("**************************");
		System.out.println("**       1 按姓名查找              **");
		System.out.println("**       2 按年龄查找              **");
		System.out.println("**       3 按性别查找              **");
		System.out.println("**       4 按号码查找              **");
		System.out.println("**       5 按住址查找              **");
		System.out.println("**       6 查看全记录              **");
		System.out.println("**       7 返回上一级              **");
		System.out.println("**************************");
		
		System.out.println("请输入正确的数字，范围1-7");
		System.out.print("请输入操作数：");
		
		int x = 0;
		String s=sc.next();
		try{
			x=Integer.parseInt(s);
			if(x<1||x>7)
			{
				System.out.println("输入错误");
				this.searchMenu();
			
			}
			
		}catch(Exception e)
		{
			System.out.println("输入错误");
			this.searchMenu();
		}
		
		if(x==1)
		{
			op.searchByName();
			searchMenu();
		}
		else if(x==2)
		{
			op.searchByAge();
			searchMenu();
		}
		else if(x==3)
		{
			op.searchBySex();
			searchMenu();
		}
		else if(x==4)
		{
			op.searchByTelNum();
			searchMenu();
		}
		else if(x==5)
		{
			op.searchByAdd();
			searchMenu();
		}
		else if(x==6)
		{
			op.showAll();
			searchMenu();
		}
		else 
			mainMenu();
		
	}
	public void modifyMenu() //修改用户信息主菜单
	{
		System.out.println("**************************");
		System.out.println("**       1 修改指定记录          **");
		System.out.println("**       2 查看全记录              **");
		System.out.println("**       3 返回上一级              **");
		System.out.println("**************************");
		
		System.out.println("请输入正确的数字，范围1-3");
		System.out.print("请输入操作数：");
		
		int x = 0;
		String s=sc.next();
		try{
			x=Integer.parseInt(s);
			if(x<1||x>3)
			{
				System.out.println("输入错误");
				this.modifyMenu();
			}
		}catch(Exception e)
		{
			System.out.println("输入错误");
			this.modifyMenu();
		}
		
		
		if(x==1)
		{
			op.modify();
			subModifyMenu();
			
		}
			
		else if(x==2)
		{
			op.showAll();
			modifyMenu();
		}
		else 
			mainMenu();
		
		
	}
	public void subModifyMenu () //修改用户信息子菜单
	{
		
		System.out.println("**************************");
		System.out.println("**       1 修改姓名                 **");
		System.out.println("**       2 修改年龄                 **");
		System.out.println("**       3 修改性别                 **");
		System.out.println("**       4 修改电话                 **");
		System.out.println("**       5 修改住址                 **");
		System.out.println("**       6 返回上一级             **");
		System.out.println("**************************");
		
		System.out.println("请输入正确的数字，范围1-6");
		System.out.print("请输入操作数：");
		
		int x = 0;
		String s=sc.next();
		try{
			x=Integer.parseInt(s);
			if(x<1||x>6)
			{
				System.out.println("输入错误");
				this.mainMenu();
			
			}
			
		}catch(Exception e)
		{
			System.out.println("输入错误");
			this.mainMenu();
		}
		
		if(x!=6)
		{
			op.modify(x);
			subModifyMenu () ;
		}
		else 
			modifyMenu();
	}
	public void deleteMenu () //删除用户信息菜单
	{
		System.out.println("**************************");
		System.out.println("**       1 查看全记录              **");
		System.out.println("**       2 删除指定记录          **");
		System.out.println("**       3 删除全部记录          **");
		System.out.println("**       4 返回上一级              **");
		System.out.println("**************************");
		
		System.out.println("请输入正确的数字，范围1-3");
		System.out.print("请输入操作数：");
		
		int x = 0;
		String s=sc.next();
		try{
			x=Integer.parseInt(s);
			if(x<1||x>4)
			{
				System.out.println("输入错误");
				this.deleteMenu();
			
			}
			
		}catch(Exception e)
		{
			System.out.println("输入错误");
			this.deleteMenu();
		}
		
		if(x==1)
		{
			op.showAll();
			deleteMenu();
			
		}
			
		else if(x==2)
		{
			op.delete();
			deleteMenu();
		}
		else if(x==3)
		{
			op.deleteAll();
			deleteMenu();
		}
		else 
			mainMenu();
	}
	public void orderMenu () //排序用户信息菜单
	{
		System.out.println("**************************");
		System.out.println("**       1 按姓名排序              **");
		System.out.println("**       2 按年龄排序              **");
		System.out.println("**       3 按性别排序              **");
		System.out.println("**       4 查看全排序              **");
		System.out.println("**       5 返回上一级              **");
		System.out.println("**************************");
		
		System.out.println("请输入正确的数字，范围1-5");
		System.out.print("请输入操作数：");
		
		int x = 0;
		String s=sc.next();
		try{
			x=Integer.parseInt(s);
			if(x<1||x>5)
			{
				System.out.println("输入错误");
				this.orderMenu();
			
			}
			
		}catch(Exception e)
		{
			System.out.println("输入错误");
			this.orderMenu();
		}
		
		if(x==1)
		{
			op.orderName();
			orderMenu();
		}
		else if(x==2)
		{
			op.orderAge();
			orderMenu();
		}
		else if(x==3)
		{
			op.orderSex();
			orderMenu();
		}
		else if(x==4)
		{
			op.showAll();
			orderMenu();
		}
		else 
			mainMenu();
		
	}
}
