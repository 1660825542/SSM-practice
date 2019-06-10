package first;

public class Stu {
	public 
		int num;
		int cla;
		int grade;
	private 
		long id;
		
		
		public Stu(int n,int c,int g,long i)
		{
			num=n;
			cla=c;
			grade=g;
			id=i;
		}
		public void show(){
			System.out.print("学号:"+num+"\t");
			System.out.print("班级:"+cla+"\t");
			System.out.print("成绩:"+grade+"\t");
			System.out.println("身份证号码:"+id+"\t");
		}
}
