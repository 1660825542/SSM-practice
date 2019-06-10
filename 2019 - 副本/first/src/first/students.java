package first;

import java.util.Scanner;

public class students {
	public 
		String s;
		int age;
	private 
		long id;
	public students(){
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入姓名:");
		String ss=sc.nextLine();
		System.out.print("年龄:");
		int aa=sc.nextInt();
		System.out.print("身份证号码:");
		long l=sc.nextLong();
		this.s=ss;
		age=aa;
		id=l;
	}
	public void show(){
		System.out.println("姓名："+this.s);
		System.out.println("年龄："+age);
		System.out.println("身份证号码："+id);
	}

}
