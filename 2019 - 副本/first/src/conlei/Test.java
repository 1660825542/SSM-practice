package conlei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		List<Person> u=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.print("ÇëÊäÈëÃû×Ö");
			String s=sc.next();
			if(s.equals("break"))
				break;
			u.add(new Person(s));
		}
		System.out.println(u.set(0, new Person("????")));
		Object []t=u.toArray();
		for(Object t1:t)
		{
			System.out.println(t1);
		}
	}
}
