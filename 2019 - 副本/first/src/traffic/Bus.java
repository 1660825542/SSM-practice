package traffic;

public class Bus extends Car{
private int seats;
public int a=20;
	public Bus()
	{
		super();
		System.out.print("ÔØ¿ÍÁ¿£º");
		seats=sc.nextInt();
	}
	public Bus(String b,String t,String c,double r,double l,int s)
	{
		super(b,t,c,r,l);
		this.a=s;
	}
	
	public void showInfo()
	{
		super.showInfo();
		System.out.println("×ùÎ»£º"+seats);
	}
	
	public double journey()
	{
		return liang/ran/seats*100;
	}
	protected int getseats()
	{
		return seats;
	}
	
	protected void setseats(int s)
	{
		seats= s ;
	}

}
