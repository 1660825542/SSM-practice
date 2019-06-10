package telebill;

public class Person {

	private int id; //�û�ID ����
	private String name; //�û���������
	private String age; //�û���������
	private String sex; //�û��Ա�����
	private String telNum; //�û��绰��������
	private String address; //�û���ַ����
	
	public  Person() //�޲������췽��
	{
		
	}
	public  Person(String name, String age, String sex, String telNum, String address) //�в������췽��
	{
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.telNum=telNum;	
		this.address=address;
	}
	public String getName() //��ȡ�û���
	{
		return name;
	}
	public void setName(String name) //�����û���
	{
		this.name=name;
	}
	public String getAge() //��ȡ�û�����
	{
		return age;
	}
	public void setAge(String age) //�����û�����
	{
		this.age=age;
	}
	public String getSex() //��ȡ�û��Ա�
	{
		return sex;
	}
	public void setSex(String sex) //�����û��Ա�
	{
		this.sex=sex;
	}
	public String getTelNum() //��ȡ�û��绰����
	{
		return telNum;
	}
	public void setTelNum (String telNum) //�����û��绰����
	{
		this.telNum=telNum;
	}
	public String getAddress() //��ȡ�û���ַ
	{
		return address;
	}
	public void setAddress(String address) //�����û���ַ
	{
		this.address=address;
	}
	public int getID () //��ȡ�û�ID��
	{
		return id;
	}
	public void setID (int ID) //�����û�ID��
	{
		this.id=ID;
	}
	public void show(int id)
	{
		StringBuffer s =new StringBuffer();
		s.setLength(10);
		s.replace(0, 4, "���");
		s.replace(8,9, "#");
		s.replace(4, 8, ""+id);
		s.setLength(21);
		s.replace(16, 20, "����");
		s.append(name);
		
		s.setLength(36);
		s.replace(31, 35, "����");
		s.append(age);
		
		s.setLength(51);
		s.replace(46, 50, "�Ա�");
		s.append(sex);
		
		s.setLength(66);
		s.replace(61, 65, "�绰");
		s.append(telNum);
		
		s.setLength(86);
		s.replace(81, 85, "סַ");
		s.append(address);
		
		String ss=s.substring(0);
		System.out.println(ss);
	}
	public String toString() //�����ַ�������
	{
		StringBuffer s =new StringBuffer();
		s.setLength(10);
		s.replace(0, 4, "���");
		s.replace(8,9, "#");
		s.replace(4, 8, ""+id);
		s.setLength(21);
		s.replace(16, 20, "����");
		s.append(name);
		
		s.setLength(36);
		s.replace(31, 35, "����");
		s.append(age);
		
		s.setLength(51);
		s.replace(46, 50, "�Ա�");
		s.append(sex);
		
		s.setLength(66);
		s.replace(61, 65, "�绰");
		s.append(telNum);
		
		s.setLength(86);
		s.replace(81, 85, "סַ");
		s.append(address);
		
		String ss=s.substring(0);
		return ss;
	}
}
