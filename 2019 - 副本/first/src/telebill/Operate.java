package telebill;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;


public class Operate {
	private Scanner sc=new Scanner(System.in);
	private int x;
	private TelNoteRegex re=new TelNoteRegex();
	private List<Person> v=new ArrayList<Person>();
	{
	 addOperation();
	}
	public void addLogic() //用户添加信息业务逻辑控制
	{
		v.add(new Person(re.nameRegex(),re.ageRegex(),re.sexRegex(),re.telNumRegex(),re.addressRegex()));
	}
	public void searchLogic() //用户查询信息业务逻辑控制
	{
		
	}
	public void modifyLogic() //修改信息业务逻辑控制
	{
		
	}
	public void deleteLogic() //删除信息业务逻辑控制
	{
		
	}
	public void orderLogic() //排序信息业务逻辑控制
	{
		
	}
	public void addOperation() //添加新用户信息
	{
		v.add(new Person("aa","22","男","1111","5555"));
		v.add(new Person("aA","22","男","1111","5555"));
		v.add(new Person("Aa","21112","女","1111","5555"));
		v.add(new Person("bb","22","男","22","55"));
		v.add(new Person("bb","22","男","22","55"));
		v.add(new Person("123","225","女","333","555"));
		for(int i=0;i<v.size();i++)
			v.get(i).setID(i+1);
		
	}
	public void showAll()//查询全部用户信息
	{
		if(v.size()==0)
			System.out.println("无信息");
		
		for(int i=0;i<v.size();i++)
			v.get(i).setID(i+1);
		for(int i=0;i<v.size();i++)
			System.out.println(v.get(i));
	}
	public void searchByName()//按姓名查询用户信息
	{
		String s=re.nameRegex();
		int i;
		boolean l=true;
		for(i=0;i<v.size();i++)
		{
			
			if(s.equals(v.get(i).getName()))
			{
				System.out.println(v.get(i));
				l=false;
			}
		}
		if(l)
			System.out.println("无匹配项");
	}
	public void searchByAge()//按年龄查询用户信息
	{
		String s=re.ageRegex();
		int i;
		boolean l=true;
		for(i=0;i<v.size();i++)
		{
			
			if(s.equals(v.get(i).getAge()))
			{
				System.out.println(v.get(i));
				l=false;
			}
		}
		if(l)
			System.out.println("无匹配项");
	}
	public void searchBySex()// 按性别查询用户信息
	{
		String s=re.sexRegex();
		int i;
		boolean l=true;
		for(i=0;i<v.size();i++)
		{
			
			if(s.equals(v.get(i).getSex()))
			{
				System.out.println(v.get(i));
				l=false;
			}
		}
		if(l)
			System.out.println("无匹配项");
	}
	public void searchByTelNum()//按电话号码查询用户信息
	{
		String s=re.telNumRegex();
		int i;
		boolean l=true;
		for(i=0;i<v.size();i++)
		{
			
			if(s.equals(v.get(i).getTelNum()))
			{
				System.out.println(v.get(i));
				l=false;
			}
		}
		if(l)
			System.out.println("无匹配项");
	}
	public void searchByAdd()//按地址查询用户信息
	{
		String s=re.addressRegex();
		int i;
		boolean l=true;
		for(i=0;i<v.size();i++)
		{
			
			if(s.equals(v.get(i).getAddress()))
			{
				System.out.println(v.get(i));
				l=false;
			}
		}
		if(l)
			System.out.println("无匹配项");
	}
	public void modify()//修改指定记录信息
	{
		  x=re.menuRegex(1, v.size());
		x=x-1;
		
	}
	public void modify(int i)//修改指定记录信息
	{
		if(i==1)
		{
			String s=re.nameRegex();
			v.get(x).setName(s);
			System.out.println("修改成功");
		}
		else if(i==2)
		{
			String s=re.ageRegex();
			v.get(x).setAge(s);
			System.out.println("修改成功");
		}
		else if(i==3)
		{
			String s=re.sexRegex();
			v.get(x).setSex(s);
			System.out.println("修改成功");
		}
		else if(i==4)
		{
			String s=re.telNumRegex();
			v.get(x).setTelNum(s);
			System.out.println("修改成功");
		}
		else if(i==5)
		{
			String s=re.addressRegex();
			v.get(x).setAddress(s);
			System.out.println("修改成功");
		}
		
	}
	public void delete()//删除指定用户信息
	{
		int a=re.menuRegex(1,  v.size());
		v.remove(a-1);
		System.out.println("删除成功");
		for(int i=a;i<v.size();i++)
			v.get(i).setID(i);
		
	}
	public void deleteAll()//删除全部用户信息
	{
		v.removeAll(v);
		System.out.println("删除成功");
	}
	public void orderName()//按用户姓名排序信息
	{
		TreeSet<Person> all=new TreeSet<>(new OrderByName<Person>());
		all.addAll(v);
		Iterator<Person> t=all.iterator();
		int i=1;
		while(t.hasNext())
		{
			
			t.next().show(i);
			i++;
		}
	}
	public void orderAge()//按用户年龄排序信息
	{
		TreeSet<Person> all=new TreeSet<>(new OrderByAge<Person>());
		all.addAll(v);
		Iterator<Person> t=all.iterator();
		int i=1;
		while(t.hasNext())
		{
			
			t.next().show(i);
			i++;
		}
	}
	public void orderSex()//按用户性别排序信息
	{
		TreeSet<Person> all=new TreeSet<>(new OrderBySex<Person>());
		all.addAll(v);
		Iterator<Person> t=all.iterator();
		int i=1;
		while(t.hasNext())
		{
			
			t.next().show(i);
			i++;
		}
	}
}
