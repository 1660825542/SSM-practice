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
/*ģ�⹤�ʱ�

Ա���ı��	Ա��������	����	����	
  s1001		  ����	˾��	 1500.00
  s2001		  ����		������	 3000.00
  s4501		  ����		��ʿ	 7500.00

1 ����Ա���࣬����ArrayListģ�⹤�ʱ�����Ա�����ɵ�

2 �����Ա��
Ա���ı��	Ա��������	����	����	
  s4502		  л���	����ҽʦ	 9500.00

3 ��ѯĳһ��Ա������Ϣ,����Ա���ı�Ų�

4 ����ĳһ��Ա������Ϣ,��Ҫ���ҵ���Ա���������

5 Ա����ְ��
*/