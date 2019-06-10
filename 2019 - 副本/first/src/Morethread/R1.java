package Morethread;

public class R1 implements Runnable{

	public void run()
	{
		for(int i=0;i<5;++i)
			System.out.println("r1="+i);
	}

}
