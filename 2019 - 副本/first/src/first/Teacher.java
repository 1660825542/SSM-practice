package first;

import java.util.Scanner;

public class Teacher extends People{
	
	private 
	int count;
	Stu[] s=new Stu[100];
	private Scanner sc;
	        
	public Teacher(){
		
		sc = new Scanner(System.in);
		System.out.print("请输入学生数:");
		 count=sc.nextInt();
		addstu();
		Stu.school="SUT";
		this.age=999;
	}
	
	public void clalist(int g){  //班级成绩表
		int i=0;
		while(i<count)
		{
			if(s[i].cla==g)
				s[i].show();
			i++;
		}
	}
	public void addstu(){  //添加学生信息
		int ss;
		int c;
		int g;
		int i=0;
		
		while(i<this.count)
		{
			
			ss=i+1;
			c=(int)Math.round(Math.random()*5+1);
			g=(int)Math.round(Math.random()*100);
			s[i]=new Stu(ss,c,g,this);
			i++;
		}
	}
	
	public void Mystu(){
		System.out.println("My Students");
		int i=0;
		
		while(i<this.count)
		{
			
			
			s[i].show();
			i++;
		}
		
	}
	
}
