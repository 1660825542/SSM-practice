package first;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import conlei.list;

public class Book {
	private String name;
			int price;
	public Book(String n,int p)
	{
		name=n;
		price=p;
	}
	public String toString()
	{
		return "书名："+name+"\t"+"价格："+price;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Book> l=new ArrayList<Book>();
		int i=3;
		while(i>0)
		{
			System.out.print("书名：");
			String n=sc.next();
			System.out.print("价格：");
			int p=sc.nextInt();
			
			l.add(new Book(n, p));
			i--;
		}
		Object []b=l.toArray();
		for(Object j:b)
			System.out.println(j);
	}

}
