package first;

public class Stu {
	public 
		int num;
		int cla;
		int grade;
		Teacher t;
	private 
		long id;
		public static String school;
		
		public Stu(int n,int c,int g,Teacher t)
		{
			num=n;
			cla=c;
			grade=g;
			id=this.idnum();
			this.t=t;
			
		}
		public void show(){
			System.out.print("ѧ��:"+num+"\t");
			System.out.print("�༶:"+cla+"\t");
			System.out.print("�ɼ�:"+grade+"\t");
			System.out.print("���֤����:"+id+"\t");
			System.out.print("ѧУ:"+school+"\t");
			System.out.println("������:"+t.name+"\t");
		}
		private long idnum(){ 
			double n;
			double b;
			while(true)
			{
				b=Math.random();
				if(b<0.23&b>0.2)
					break;
			}
			n=b*1000000;
			n=Math.round(n)*100000000*10000;
			double y,s;
			while(true)
			{
				y=Math.random();
				if(y<0.2&y>0.1994)
					break;
			}
			y=Math.round(y*10000)*10000+Math.round(Math.random()*11+1)*100+(Math.round(Math.random()*29+1));
			s=Math.round(Math.random()*10000);
			n=n+y*10000+s;
			return (long)n;
		}
}
