package first;

import java.util.Arrays;

public class Arithmetic {
	
	public int [] prime(int a,int b){
	
		double max=a>b?a:b;
		int min=a<b?a:b;
		min=min<3?3:min;
		int s[]=new int[0];
		for(int i=min;i<=max;i++)
		{
			int j;
			for( j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
					break;
				
			}
			if(j>Math.sqrt(i))
			{
				s=Arrays.copyOf(s, s.length+1);
				s[s.length-1]=i;			
			}
					
		}
		
		return s;
	}
	public int primesum(int []a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=i;
		return sum;
	}
	public int sum(int a,int b){
		int max=a>b?a:b;
		int min=a<b?a:b;
		int sum=0;
		for(int i=min;i<=max;++i)
		{
			sum+=i;
		}
		return sum;
	}
	public int sum(int b){
		int sum=0;
		for(int i=0;i<=b;i++)
		{
			sum+=i;
		}
		return sum;
	}
	
	public int factorial(int a)
	{
		int result=1;
		for(int i=a;i>1;i--)
		{
			result*=i;
		}
		return result;
	}
	
	public void multab(int a,int b)
	{
		int max=a>b?a:b;
		int min=a<b?a:b;
		
		for(int i=min;i<=max;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}

}
