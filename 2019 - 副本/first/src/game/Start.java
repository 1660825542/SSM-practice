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
            System.out.print("������:");
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
				System.out.print("��������Ϣ:");
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
				
				System.out.println("��ǰ�������:"+p.getplays());
			}
			else
			{
				System.out.println("�������");
			}
			
            }catch(Exception e)
            {
            	System.out.println("�������");
            	break;
            	
            }
			
			  
		}
	}
	
	private void intface()
	{
		System.out.println("***************************");
		System.out.println("�鿴״̬ : 1\t���븱�� : 2");
		System.out.println("���з��� : 3\t��ʷ�Ի� : 4");
		System.out.println("������ : 5\t������� : 6");
		System.out.println("***************************");
	}

}
