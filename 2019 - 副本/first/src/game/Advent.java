package game;

import java.util.Scanner;

public class Advent {

	
	public double Inter(double b)
	{
		System.out.print("������Ͷ�ʱ���0~1֮��:");
		Scanner sc=new Scanner(System.in);
		double s=sc.nextDouble();
		double x;
		while(true)
		{
			x=Math.random();			
			if(x<=s)
				break;
		}
		return Math.round(b*(1-s)+(2*Math.random())*b*s);
		
	}
}
