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
			System.out.print("ѧ��:"+num+"\t");
			System.out.print("�༶:"+cla+"\t");
			System.out.print("�ɼ�:"+grade+"\t");
			System.out.println("���֤����:"+id+"\t");
		}
}
