package first;

import java.util.Scanner;

public abstract class drawangle extends students {
	public drawangle() {
		//super();
	}
	public void draw(){
		Scanner sc =  new Scanner(System.in);

		int n=5;
		System.out.print("������߶ȣ�");
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			int j;
			j=i;
			while(n+1-j>0){
				System.out.print(" ");
				j++;
	}
	     
			int k=2*i-1;
			do
	{
				System.out.print("*");
				k--;
	}while(k>0);

	   System.out.println(" ");
	}
	}

}
