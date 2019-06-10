package game;

import java.util.Scanner;

public class Start {
	
	private Scanner sc;String s;Advent ad=new Advent();
	public Start(player p){
		
		while(true)
		{
			gamebegin(p);
		}
		
	}
	/**
	 * 
	 */
	private void  gamebegin(player p){
		sc = new Scanner(System.in);
		int operation;
		while(true)
		{
			intface();
            System.out.print("操作数:");
            try{
            	operation=sc.nextInt();
           
			
			
			if(operation==1)
				p.status();
			else if(operation == 2)
			{
				
				p.setenergy(ad.Inter(p.getenergy()));
			}
			else if(operation == 3)
			{
				System.out.print("请输入消息:");
				s=sc.nextLine();  
				System.out.print(s);
				s=sc.nextLine();                       
				
				System.out.println("**********************************");
				p.comment(s);
			}
			else if(operation == 4)
			{
				p.history();
			}
			else if(operation == 10)
			{
				p.setenergy(p.getenergy()+100);
			}
			else if(operation == 5)
			{
				
				new player();
			}
			else if(operation == 6)
			{
				
				System.out.println("当前玩家数量:"+p.getplays());
			}
			else
			{
				System.out.println("输入错误");
			}
			
            }catch(Exception e)
            {
            	System.out.println("输入错误");
            	break;
            	
            }
			
			  
		}
	}
	
	private void intface()
	{
		System.out.println("***************************");
		System.out.println("查看状态 : 1\t进入副本 : 2");
		System.out.println("进行发言 : 3\t历史对话 : 4");
		System.out.println("添加玩家 : 5\t玩家数量 : 6");
		System.out.println("***************************");
	}

}
