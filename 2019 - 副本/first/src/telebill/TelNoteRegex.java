package telebill;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TelNoteRegex {

	private Scanner sc=new Scanner(System.in);
	public int menuRegex (int min, int max ) //�Բ˵�����ѡ�����֤
	{
		while(true)
		{
			System.out.println("��������ţ���С�� "+min+"  ���ֵ�� "+max);
			try{
				int x=sc.nextInt();
				if(min<=x&&x<=max)
					return x;
				else
					System.out.println("�������");
			}catch(Exception e)
			{
				System.out.println("�������");
			}
		}
	}
	public String nameRegex() //���û�������������֤
	{
		
		String s;
		while(true)
		{
			System.out.println("������������1-10����ĸ");
			s=sc.next();
			if(Pattern.matches("[a-zA-Z]{1,10}+", s))
			{

				return s;
			}
				
			else
				System.out.println("������ʽ����쳣������������");
		}
		
	}
	public String   ageRegex ( ) //���û������������֤
	{
		String s;
		while(true)
		{
		
			System.out.println("���������䣬1-100+");
			s=sc.next();
			int age=0;
			try
			{
				age=Integer.parseInt(s);
				
				if(age>=1&&age<=200)
				{
					String ss=""+age;
					return ss;
				}
				else
					System.out.println("�����ʽ�����쳣������������");
			}catch(Exception e)
			{
				System.out.println("�����ʽ�����쳣������������");
			}
			
		}
	}
	public String sexRegex ( ) //���û������Ա����֤
	{
		String s;
		while(true)
		{
			System.out.println("�������Ա𣬣���  M ��  m��Ů  F ��  f��");
			s=sc.next();
			if(Pattern.matches("[mMfF]", s))
			{
				
				if(Pattern.matches("[mM]", s))
					return "��";
				else
					return "Ů";
			}
			
				else
				System.out.println("�Ա��ʽ����쳣������������");
		}
	}
	public String telNumRegex ( ) //���û�����绰�������֤
	{
		String s;
		while(true)
		{
			System.out.println("������绰���룬1-10������");
			s=sc.next();
			if(Pattern.matches("[0-9]{1,10}+", s))
			{
				System.out.println("�绰����");

				return s;
			}
				
			else
				System.out.println("�绰�����ʽ����쳣������������");
		}
	}
	public String addressRegex ( ) //���û������ַ����֤
	{
		String s;
		while(true)
		{
			System.out.println("������סַ��1-50λ����");
			s=sc.next();
			if(Pattern.matches("[0-9a-zA-Z]{1,50}+", s))
			{
				return s;
			}
				
			else
				System.out.println("סַ��ʽ����쳣������������");
		}
	}
}
