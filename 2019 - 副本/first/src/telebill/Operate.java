package telebill;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;


public class Operate {
	private Scanner sc=new Scanner(System.in);
	private int x;
	private TelNoteRegex re=new TelNoteRegex();
	private List<Person> v=new ArrayList<Person>();
	{
	 addOperation();
	}
	public void addLogic() //�û������Ϣҵ���߼�����
	{
		v.add(new Person(re.nameRegex(),re.ageRegex(),re.sexRegex(),re.telNumRegex(),re.addressRegex()));
	}
	public void searchLogic() //�û���ѯ��Ϣҵ���߼�����
	{
		
	}
	public void modifyLogic() //�޸���Ϣҵ���߼�����
	{
		
	}
	public void deleteLogic() //ɾ����Ϣҵ���߼�����
	{
		
	}
	public void orderLogic() //������Ϣҵ���߼�����
	{
		
	}
	public void addOperation() //������û���Ϣ
	{
		v.add(new Person("aa","22","��","1111","5555"));
		v.add(new Person("aA","22","��","1111","5555"));
		v.add(new Person("Aa","21112","Ů","1111","5555"));
		v.add(new Person("bb","22","��","22","55"));
		v.add(new Person("bb","22","��","22","55"));
		v.add(new Person("123","225","Ů","333","555"));
		for(int i=0;i<v.size();i++)
			v.get(i).setID(i+1);
		
	}
	public void showAll()//��ѯȫ���û���Ϣ
	{
		if(v.size()==0)
			System.out.println("����Ϣ");
		
		for(int i=0;i<v.size();i++)
			v.get(i).setID(i+1);
		for(int i=0;i<v.size();i++)
			System.out.println(v.get(i));
	}
	public void searchByName()//��������ѯ�û���Ϣ
	{
		String s=re.nameRegex();
		int i;
		boolean l=true;
		for(i=0;i<v.size();i++)
		{
			
			if(s.equals(v.get(i).getName()))
			{
				System.out.println(v.get(i));
				l=false;
			}
		}
		if(l)
			System.out.println("��ƥ����");
	}
	public void searchByAge()//�������ѯ�û���Ϣ
	{
		String s=re.ageRegex();
		int i;
		boolean l=true;
		for(i=0;i<v.size();i++)
		{
			
			if(s.equals(v.get(i).getAge()))
			{
				System.out.println(v.get(i));
				l=false;
			}
		}
		if(l)
			System.out.println("��ƥ����");
	}
	public void searchBySex()// ���Ա��ѯ�û���Ϣ
	{
		String s=re.sexRegex();
		int i;
		boolean l=true;
		for(i=0;i<v.size();i++)
		{
			
			if(s.equals(v.get(i).getSex()))
			{
				System.out.println(v.get(i));
				l=false;
			}
		}
		if(l)
			System.out.println("��ƥ����");
	}
	public void searchByTelNum()//���绰�����ѯ�û���Ϣ
	{
		String s=re.telNumRegex();
		int i;
		boolean l=true;
		for(i=0;i<v.size();i++)
		{
			
			if(s.equals(v.get(i).getTelNum()))
			{
				System.out.println(v.get(i));
				l=false;
			}
		}
		if(l)
			System.out.println("��ƥ����");
	}
	public void searchByAdd()//����ַ��ѯ�û���Ϣ
	{
		String s=re.addressRegex();
		int i;
		boolean l=true;
		for(i=0;i<v.size();i++)
		{
			
			if(s.equals(v.get(i).getAddress()))
			{
				System.out.println(v.get(i));
				l=false;
			}
		}
		if(l)
			System.out.println("��ƥ����");
	}
	public void modify()//�޸�ָ����¼��Ϣ
	{
		  x=re.menuRegex(1, v.size());
		x=x-1;
		
	}
	public void modify(int i)//�޸�ָ����¼��Ϣ
	{
		if(i==1)
		{
			String s=re.nameRegex();
			v.get(x).setName(s);
			System.out.println("�޸ĳɹ�");
		}
		else if(i==2)
		{
			String s=re.ageRegex();
			v.get(x).setAge(s);
			System.out.println("�޸ĳɹ�");
		}
		else if(i==3)
		{
			String s=re.sexRegex();
			v.get(x).setSex(s);
			System.out.println("�޸ĳɹ�");
		}
		else if(i==4)
		{
			String s=re.telNumRegex();
			v.get(x).setTelNum(s);
			System.out.println("�޸ĳɹ�");
		}
		else if(i==5)
		{
			String s=re.addressRegex();
			v.get(x).setAddress(s);
			System.out.println("�޸ĳɹ�");
		}
		
	}
	public void delete()//ɾ��ָ���û���Ϣ
	{
		int a=re.menuRegex(1,  v.size());
		v.remove(a-1);
		System.out.println("ɾ���ɹ�");
		for(int i=a;i<v.size();i++)
			v.get(i).setID(i);
		
	}
	public void deleteAll()//ɾ��ȫ���û���Ϣ
	{
		v.removeAll(v);
		System.out.println("ɾ���ɹ�");
	}
	public void orderName()//���û�����������Ϣ
	{
		TreeSet<Person> all=new TreeSet<>(new OrderByName<Person>());
		all.addAll(v);
		Iterator<Person> t=all.iterator();
		int i=1;
		while(t.hasNext())
		{
			
			t.next().show(i);
			i++;
		}
	}
	public void orderAge()//���û�����������Ϣ
	{
		TreeSet<Person> all=new TreeSet<>(new OrderByAge<Person>());
		all.addAll(v);
		Iterator<Person> t=all.iterator();
		int i=1;
		while(t.hasNext())
		{
			
			t.next().show(i);
			i++;
		}
	}
	public void orderSex()//���û��Ա�������Ϣ
	{
		TreeSet<Person> all=new TreeSet<>(new OrderBySex<Person>());
		all.addAll(v);
		Iterator<Person> t=all.iterator();
		int i=1;
		while(t.hasNext())
		{
			
			t.next().show(i);
			i++;
		}
	}
}
