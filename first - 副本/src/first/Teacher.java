package first;

public class Teacher {
	
	private Stu[] s=new Stu[20];
	
	public Teacher(){
		
		addstu();
	}
	public void clalist(int g){
		int i=0;
		while(i<20)
		{
			if(s[i].cla==g)
				s[i].show();
			i++;
		}
	}
	public void addstu(){
		int ss;
		int c;
		int g;
		int i=0;
		
		while(i<20)
		{
			ss=i+1;
			c=(int)Math.round(Math.random()*5+1);
			g=(int)Math.round(Math.random()*100);
			s[i]=new Stu(ss,c,g,idnum());
			i++;
		}
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
