package Anomaly;

import java.util.Scanner;

public class Test {
	public static int  tran(String s)throws MyException
	{
		//double b;
		int x;
		try{
			x=Integer.parseInt(s);
		}catch( Exception e){
			throw new MyException("输入类型不正确");
			
		}
		return x;
	}
	
	public static void main(String[] args) throws MyException {
		int a[]=new int[5];
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			try{
				System.out.print("请输入...................第"+(i+1)+"个数");
			a[i]=tran(sc.next());}catch(MyException e){
				
			}
		}
		try{
		for(int i=0;i<6;i++)
		{
			System.out.println(a[i]);
		}}catch(Exception e)
		{
			System.out.println("越界了");
		}
	}
}
