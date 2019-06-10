package telebill;

public class Person {

	private int id; //用户ID 属性
	private String name; //用户姓名属性
	private String age; //用户年龄属性
	private String sex; //用户性别属性
	private String telNum; //用户电话号码属性
	private String address; //用户地址属性
	
	public  Person() //无参数构造方法
	{
		
	}
	public  Person(String name, String age, String sex, String telNum, String address) //有参数构造方法
	{
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.telNum=telNum;	
		this.address=address;
	}
	public String getName() //读取用户名
	{
		return name;
	}
	public void setName(String name) //设置用户名
	{
		this.name=name;
	}
	public String getAge() //读取用户年龄
	{
		return age;
	}
	public void setAge(String age) //设置用户年龄
	{
		this.age=age;
	}
	public String getSex() //读取用户性别
	{
		return sex;
	}
	public void setSex(String sex) //设置用户性别
	{
		this.sex=sex;
	}
	public String getTelNum() //读取用户电话号码
	{
		return telNum;
	}
	public void setTelNum (String telNum) //设置用户电话号码
	{
		this.telNum=telNum;
	}
	public String getAddress() //读取用户地址
	{
		return address;
	}
	public void setAddress(String address) //设置用户地址
	{
		this.address=address;
	}
	public int getID () //读取用户ID号
	{
		return id;
	}
	public void setID (int ID) //设置用户ID号
	{
		this.id=ID;
	}
	public void show(int id)
	{
		StringBuffer s =new StringBuffer();
		s.setLength(10);
		s.replace(0, 4, "序号");
		s.replace(8,9, "#");
		s.replace(4, 8, ""+id);
		s.setLength(21);
		s.replace(16, 20, "姓名");
		s.append(name);
		
		s.setLength(36);
		s.replace(31, 35, "年龄");
		s.append(age);
		
		s.setLength(51);
		s.replace(46, 50, "性别");
		s.append(sex);
		
		s.setLength(66);
		s.replace(61, 65, "电话");
		s.append(telNum);
		
		s.setLength(86);
		s.replace(81, 85, "住址");
		s.append(address);
		
		String ss=s.substring(0);
		System.out.println(ss);
	}
	public String toString() //连接字符串方法
	{
		StringBuffer s =new StringBuffer();
		s.setLength(10);
		s.replace(0, 4, "序号");
		s.replace(8,9, "#");
		s.replace(4, 8, ""+id);
		s.setLength(21);
		s.replace(16, 20, "姓名");
		s.append(name);
		
		s.setLength(36);
		s.replace(31, 35, "年龄");
		s.append(age);
		
		s.setLength(51);
		s.replace(46, 50, "性别");
		s.append(sex);
		
		s.setLength(66);
		s.replace(61, 65, "电话");
		s.append(telNum);
		
		s.setLength(86);
		s.replace(81, 85, "住址");
		s.append(address);
		
		String ss=s.substring(0);
		return ss;
	}
}
