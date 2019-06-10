package salarytable;

public class employee {
	private String id,name,rap;
	private double money;
	public employee(String i,String n,String r,double m)
	{
		id=i;
		name=n;
		rap=r;
		money=m;
	}
	public String toString()
	{
		return id+"\t"+name+"\t"+rap+"\t"+money;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRap() {
		return rap;
	}
	public void setRap(String rap) {
		this.rap = rap;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
	
}
/*模拟工资表

员工的编号	员工的姓名	工资	工种	
  s1001		  李大国	司机	 1500.00
  s2001		  赵四		主持人	 3000.00
  s4501		  香秀		护士	 7500.00

1 创建员工类，并用ArrayList模拟工资表是由员工构成的

2 添加新员工
员工的编号	员工的姓名	工种	工资	
  s4502		  谢大脚	主任医师	 9500.00

3 查询某一个员工的信息,根据员工的编号查

4 更新某一个员工的信息,先要查找到该员工，后更新

5 员工离职，
*/