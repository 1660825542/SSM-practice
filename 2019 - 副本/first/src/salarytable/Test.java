package salarytable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static Scanner sc=new Scanner(System.in);
	public static List<employee> e=new ArrayList<employee>();
	public void creat()
	{
		
		try{
			String id,name,rap,s;
			double money = 0;
			System.out.print("编号");
			id=sc.nextLine();
			System.out.print("姓名");
			name=sc.nextLine();
			System.out.print("工种");
			rap=sc.nextLine();
			System.out.print("工资");
			s=sc.nextLine();
			try{
				money=Double.parseDouble(s);
			}catch(Exception k)
			{
				System.out.println("工资输入错误");
			}
			
			e.add(new employee(id, name, rap, money));
		}catch(Exception e){
			System.out.println("存在输入出错");
		}
		
	}
	public void print(){
		
		Object []t=this.e.toArray();
		System.out.println("编号"+"\t工资"+"\t工种"+"\t工资");
		for(Object x:t)
		{
			System.out.println(x);
		}
	}
	public <E> void  find(String s)
	{
		System.out.println("编号为"+s+"的信息");
		System.out.println("编号"+"\t工资"+"\t工种"+"\t工资");
		employee x;
		for(int i=0;i<e.size();++i)
		{
			x=e.get(i);
			if(x.getId().equals(s))
			{
				Object t=e.get(e.indexOf(x));
				System.out.println(t);
				break;
			}
		}
		
	}
	
	
	public <E> void  move(String s)
	{
		System.out.println("删除编号为"+s+"的信息");
		System.out.println("编号"+"\t工资"+"\t工种"+"\t工资");
		employee x;
		for(int i=0;i<e.size();++i)
		{
			
			if(e.get(i).getId().equals(s))
			{
				System.out.println(e.get(i));
				e.remove(i);
				break;
			}
		}
		
	}
	public <E> void  update(String s)
	{
		System.out.println("更新编号为"+s+"的信息");
		System.out.println("编号"+"\t工资"+"\t工种"+"\t工资");
		employee x;
		for(int i=0;i<e.size();++i)
		{
			
			if(e.get(i).getId().equals(s))
			{
				String s1;
				try{
					String id,name,rap;
					double money = 0;
					System.out.print("编号");
					id=sc.next();
					System.out.print("姓名");
					name=sc.next();
					System.out.print("工种");
					rap=sc.next();
					System.out.print("工资");
					s1=sc.next();
				
					try{
						money=Double.parseDouble(s1);
					}catch(Exception k)
					{
						System.out.println("工资输入错误,更新失败");
						break;
					}
					
					e.get(i).setId(id);
					e.get(i).setName(name);
					e.get(i).setRap(rap);
					e.get(i).setMoney(money);
				}catch(Exception e){
					System.out.println("输入出错");
				}
				break;
			}
		}
		
	}
	
public static void main(String[] args) {
	Test t=new Test();
	t.creat();
	t.print();
	t.find("1");
	t.update("1");
	t.print();
	t.move("1");
}
}
