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
		System.out.print("����������:");
		String ss=sc.nextLine();
		System.out.print("����:");
		int aa=sc.nextInt();
		System.out.print("���֤����:");
		long l=sc.nextLong();
		this.s=ss;
		age=aa;
		id=l;
	}
	public void show(){
		System.out.println("������"+this.s);
		System.out.println("���䣺"+age);
		System.out.println("���֤���룺"+id);
	}

}
