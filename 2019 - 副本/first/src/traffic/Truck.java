package traffic;

public class Truck extends Vehicles{
	private int load;
	
	
	public void showInfo()
	{
		super.showInfo();
		System.out.println("дижиЃК"+load);
	}
	public Truck()
	{
		super();
		System.out.print("дижиЃК");
		load=sc.nextInt();
	}
	public Truck(String b,String t,String c,double r,double l,int s)
	{
		brand=b;
		color=c;
		type=t;
		ran=r;
		liang=l;
		load=s;
	}
	public double journey()
	{
		return liang/ran/load*100;
	}
	
	protected int getseats()
	{
		return load;
	}
	
	protected void setseats(int s)
	{
		load= s ;
	}

}
