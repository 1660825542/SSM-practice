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
			System.out.print("���");
			id=sc.nextLine();
			System.out.print("����");
			name=sc.nextLine();
			System.out.print("����");
			rap=sc.nextLine();
			System.out.print("����");
			s=sc.nextLine();
			try{
				money=Double.parseDouble(s);
			}catch(Exception k)
			{
				System.out.println("�����������");
			}
			
			e.add(new employee(id, name, rap, money));
		}catch(Exception e){
			System.out.println("�����������");
		}
		
	}
	public void print(){
		
		Object []t=this.e.toArray();
		System.out.println("���"+"\t����"+"\t����"+"\t����");
		for(Object x:t)
		{
			System.out.println(x);
		}
	}
	public <E> void  find(String s)
	{
		System.out.println("���Ϊ"+s+"����Ϣ");
		System.out.println("���"+"\t����"+"\t����"+"\t����");
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
		System.out.println("ɾ�����Ϊ"+s+"����Ϣ");
		System.out.println("���"+"\t����"+"\t����"+"\t����");
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
		System.out.println("���±��Ϊ"+s+"����Ϣ");
		System.out.println("���"+"\t����"+"\t����"+"\t����");
		employee x;
		for(int i=0;i<e.size();++i)
		{
			
			if(e.get(i).getId().equals(s))
			{
				String s1;
				try{
					String id,name,rap;
					double money = 0;
					System.out.print("���");
					id=sc.next();
					System.out.print("����");
					name=sc.next();
					System.out.print("����");
					rap=sc.next();
					System.out.print("����");
					s1=sc.next();
				
					try{
						money=Double.parseDouble(s1);
					}catch(Exception k)
					{
						System.out.println("�����������,����ʧ��");
						break;
					}
					
					e.get(i).setId(id);
					e.get(i).setName(name);
					e.get(i).setRap(rap);
					e.get(i).setMoney(money);
				}catch(Exception e){
					System.out.println("�������");
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
