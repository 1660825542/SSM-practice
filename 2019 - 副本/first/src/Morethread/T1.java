package Morethread;

public class T1 extends Thread{

	

	public void run()
	{
		int i;
		for( i=1;i<100;++i)
		{
			if(i%3==0)
			{
				
				try{
					System.out.println("T1ÐÝÏ¢5s");
					sleep(5000);
				}catch (Exception e) {
					// TODO: handle exception
				}
			
			}
		System.out.println("t1="+i);
		}
	}
}
