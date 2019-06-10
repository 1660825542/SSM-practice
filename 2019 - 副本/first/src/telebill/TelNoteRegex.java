package telebill;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TelNoteRegex {

	private Scanner sc=new Scanner(System.in);
	public int menuRegex (int min, int max ) //对菜单输入选项的验证
	{
		while(true)
		{
			System.out.println("请输入序号，最小： "+min+"  最大值： "+max);
			try{
				int x=sc.nextInt();
				if(min<=x&&x<=max)
					return x;
				else
					System.out.println("输入错误");
			}catch(Exception e)
			{
				System.out.println("输入错误");
			}
		}
	}
	public String nameRegex() //对用户输入姓名的验证
	{
		
		String s;
		while(true)
		{
			System.out.println("请输入姓名，1-10个字母");
			s=sc.next();
			if(Pattern.matches("[a-zA-Z]{1,10}+", s))
			{

				return s;
			}
				
			else
				System.out.println("姓名格式输出异常，请重新输入");
		}
		
	}
	public String   ageRegex ( ) //对用户输入年龄的验证
	{
		String s;
		while(true)
		{
		
			System.out.println("请输入年龄，1-100+");
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
					System.out.println("年龄格式输入异常，请重新输入");
			}catch(Exception e)
			{
				System.out.println("年龄格式输入异常，请重新输入");
			}
			
		}
	}
	public String sexRegex ( ) //对用户输入性别的验证
	{
		String s;
		while(true)
		{
			System.out.println("请输入性别，（男  M 或  m，女  F 或  f）");
			s=sc.next();
			if(Pattern.matches("[mMfF]", s))
			{
				
				if(Pattern.matches("[mM]", s))
					return "男";
				else
					return "女";
			}
			
				else
				System.out.println("性别格式输出异常，请重新输入");
		}
	}
	public String telNumRegex ( ) //对用户输入电话号码的验证
	{
		String s;
		while(true)
		{
			System.out.println("请输入电话号码，1-10个数字");
			s=sc.next();
			if(Pattern.matches("[0-9]{1,10}+", s))
			{
				System.out.println("电话号码");

				return s;
			}
				
			else
				System.out.println("电话号码格式输出异常，请重新输入");
		}
	}
	public String addressRegex ( ) //对用户输入地址的验证
	{
		String s;
		while(true)
		{
			System.out.println("请输入住址，1-50位长度");
			s=sc.next();
			if(Pattern.matches("[0-9a-zA-Z]{1,50}+", s))
			{
				return s;
			}
				
			else
				System.out.println("住址格式输出异常，请重新输入");
		}
	}
}
