package game;

import java.util.Arrays;
import java.util.Scanner;

public class player {
	
	private 
		String name;
		int level;
		double energy;
		static int players=0;
	
		public player()
		{
			System.out.print("����������:");
			Scanner sc =new Scanner(System.in);
			name=sc.nextLine();
			level=1;
			energy=100;	
			System.out.println("����"+name+"�ɹ�");
			players+=1;
		}
		String s[]=new String[0]; 
		
		public player(String n,int l,int e)
		{
			name=n;
			level=l;
			energy=e;
			players+=1;
		}
		public static int getplays()
		{
			return players;
		}
		public void status()
		{
			System.out.println("**********************************");
			System.out.println("\t"+"�������:"+name);
			System.out.println("\t       "+"�ȼ�:"+level);
			System.out.println("\t       "+"����:"+energy);
		}
		
		public void comment(String talk){
			s=Arrays.copyOf(s, s.length+1);
			s[s.length-1]=talk;
			
			System.out.println("���"+name+"˵:"+s[s.length-1]);
		}
		public void setenergy(double b)
		{
			if(energy-b<0)
				System.out.println("ӯ������:"+(b-energy));
			else
				System.out.println("��������:"+(energy-b));
			energy=b;
		}
		public double getenergy(){
			return energy;
		}
		public void history()
		{
			System.out.println("������ʷ:");
			for(int i=0;i<s.length;i++)
			{
					System.out.println((i+1)+"."+s[i]);
				
			}
		}
		

}
