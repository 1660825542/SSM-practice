package first;

import java.util.Arrays;

public class AA {
	public static int fun(int a)
	{
		if(a<0)
			return 0;
		if(a%2==1)
		return a+fun(a-2);
		else
			return fun(a-1);
	}

	
	public static int [] fun()
	{
		int []a={1,5,8,2};
		int k;
		for(int i=0;i<a.length;i++)
		{
			int j;
			for(j=0;j<a.length-i-1;j++)
				if(a[j]>a[j+1])
					{
						k=a[j];
						a[j]=a[j+1];
						a[j+1]=k;
					}
			
		}
		System.out.println(Arrays.toString(a));
		return a;
	}
	
	public static void main(String[] args) {
//		for(int i=5;i>0;i--)
//		{
//			for(int j=i;j>0;j--)
//				{
//					System.out.print("*");
//					System.out.print("\0");
//				}
//			
//				System.out.println();
		
		fun();
//		}

	}

}
