package telebill;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

	private Scanner sc=new Scanner(System.in);
	private Operate op=new Operate();
	
	public void mainMenu() //���˵�
	{
		System.out.println("**************************");
		System.out.println("**       1 ��Ӽ�¼                 **");
		System.out.println("**       2 ���Ҽ�¼                 **");
		System.out.println("**       3 �޸ļ�¼                 **");
		System.out.println("**       4 ɾ����¼                 **");
		System.out.println("**       5 �����¼                 **");
		System.out.println("**       6 �˳�ϵͳ                 **");
		System.out.println("**************************");
		
		System.out.println("��������ȷ�����֣���Χ1-6");
		System.out.print("�������������");
		
		int x = 0;
		String s=sc.next();
		try{
			x=Integer.parseInt(s);
			if(x<1||x>6)
			{
				System.out.println("�������");
				this.mainMenu();
			
			}
			
		}catch(Exception e)
		{
			System.out.println("�������");
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
	public void addMenu() //����û��˵�
	{
		System.out.println("**************************");
		System.out.println("**       1 ����¼�¼              **");
		System.out.println("**       2 �鿴ȫ��¼              **");
		System.out.println("**       3 ������һ��              **");
		System.out.println("**************************");
		
		System.out.println("��������ȷ�����֣���Χ1-3");
		System.out.print("�������������");
		
		int x = 0;
		String s=sc.next();
		try{
			x=Integer.parseInt(s);
			if(x<1||x>3)
			{
				System.out.println("�������");
				this.addMenu();
			}
		}catch(Exception e)
		{
			System.out.println("�������");
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
	public void searchMenu() //�����û��˵�
	{
		System.out.println("**************************");
		System.out.println("**       1 ����������              **");
		System.out.println("**       2 ���������              **");
		System.out.println("**       3 ���Ա����              **");
		System.out.println("**       4 ���������              **");
		System.out.println("**       5 ��סַ����              **");
		System.out.println("**       6 �鿴ȫ��¼              **");
		System.out.println("**       7 ������һ��              **");
		System.out.println("**************************");
		
		System.out.println("��������ȷ�����֣���Χ1-7");
		System.out.print("�������������");
		
		int x = 0;
		String s=sc.next();
		try{
			x=Integer.parseInt(s);
			if(x<1||x>7)
			{
				System.out.println("�������");
				this.searchMenu();
			
			}
			
		}catch(Exception e)
		{
			System.out.println("�������");
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
	public void modifyMenu() //�޸��û���Ϣ���˵�
	{
		System.out.println("**************************");
		System.out.println("**       1 �޸�ָ����¼          **");
		System.out.println("**       2 �鿴ȫ��¼              **");
		System.out.println("**       3 ������һ��              **");
		System.out.println("**************************");
		
		System.out.println("��������ȷ�����֣���Χ1-3");
		System.out.print("�������������");
		
		int x = 0;
		String s=sc.next();
		try{
			x=Integer.parseInt(s);
			if(x<1||x>3)
			{
				System.out.println("�������");
				this.modifyMenu();
			}
		}catch(Exception e)
		{
			System.out.println("�������");
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
	public void subModifyMenu () //�޸��û���Ϣ�Ӳ˵�
	{
		
		System.out.println("**************************");
		System.out.println("**       1 �޸�����                 **");
		System.out.println("**       2 �޸�����                 **");
		System.out.println("**       3 �޸��Ա�                 **");
		System.out.println("**       4 �޸ĵ绰                 **");
		System.out.println("**       5 �޸�סַ                 **");
		System.out.println("**       6 ������һ��             **");
		System.out.println("**************************");
		
		System.out.println("��������ȷ�����֣���Χ1-6");
		System.out.print("�������������");
		
		int x = 0;
		String s=sc.next();
		try{
			x=Integer.parseInt(s);
			if(x<1||x>6)
			{
				System.out.println("�������");
				this.mainMenu();
			
			}
			
		}catch(Exception e)
		{
			System.out.println("�������");
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
	public void deleteMenu () //ɾ���û���Ϣ�˵�
	{
		System.out.println("**************************");
		System.out.println("**       1 �鿴ȫ��¼              **");
		System.out.println("**       2 ɾ��ָ����¼          **");
		System.out.println("**       3 ɾ��ȫ����¼          **");
		System.out.println("**       4 ������һ��              **");
		System.out.println("**************************");
		
		System.out.println("��������ȷ�����֣���Χ1-3");
		System.out.print("�������������");
		
		int x = 0;
		String s=sc.next();
		try{
			x=Integer.parseInt(s);
			if(x<1||x>4)
			{
				System.out.println("�������");
				this.deleteMenu();
			
			}
			
		}catch(Exception e)
		{
			System.out.println("�������");
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
	public void orderMenu () //�����û���Ϣ�˵�
	{
		System.out.println("**************************");
		System.out.println("**       1 ����������              **");
		System.out.println("**       2 ����������              **");
		System.out.println("**       3 ���Ա�����              **");
		System.out.println("**       4 �鿴ȫ����              **");
		System.out.println("**       5 ������һ��              **");
		System.out.println("**************************");
		
		System.out.println("��������ȷ�����֣���Χ1-5");
		System.out.print("�������������");
		
		int x = 0;
		String s=sc.next();
		try{
			x=Integer.parseInt(s);
			if(x<1||x>5)
			{
				System.out.println("�������");
				this.orderMenu();
			
			}
			
		}catch(Exception e)
		{
			System.out.println("�������");
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
