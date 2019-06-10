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
			System.out.print("请输入姓名:");
			Scanner sc =new Scanner(System.in);
			name=sc.nextLine();
			level=1;
			energy=100;	
			System.out.println("创建"+name+"成功");
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
			System.out.println("\t"+"玩家名称:"+name);
			System.out.println("\t       "+"等级:"+level);
			System.out.println("\t       "+"能量:"+energy);
		}
		
		public void comment(String talk){
			s=Arrays.copyOf(s, s.length+1);
			s[s.length-1]=talk;
			
			System.out.println("玩家"+name+"说:"+s[s.length-1]);
		}
		public void setenergy(double b)
		{
			if(energy-b<0)
				System.out.println("盈利能量:"+(b-energy));
			else
				System.out.println("亏损能量:"+(energy-b));
			energy=b;
		}
		public double getenergy(){
			return energy;
		}
		public void history()
		{
			System.out.println("留言历史:");
			for(int i=0;i<s.length;i++)
			{
					System.out.println((i+1)+"."+s[i]);
				
			}
		}
		

}
