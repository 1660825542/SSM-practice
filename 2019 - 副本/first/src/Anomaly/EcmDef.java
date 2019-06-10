package Anomaly;
import java.util.*;
import java.util.Scanner;

public class EcmDef {
	
	public int  run(int x,int y) throws EcDef,MyArrayIndexOutOfBoundsException,MyArithmeticException
	{
		if(y==0)
		{
			throw new MyArithmeticException("错误:除数为0");
		}
		else if(x<0||y<0)
		{
			throw new EcDef("错误:除数小于0");
		}
		return x/y;
	}
	
    public static void main(String[] args) {
 
    	Scanner sc =new Scanner(System.in);
    	try{
    		
    		int x,y;
    		x=Integer.parseInt(args[0]);
    		
    		y=Integer.parseInt(args[1]);
    		EcmDef e=new EcmDef();
    		System.out.println(e.run(x,y));
    		
    	}catch(ArrayIndexOutOfBoundsException e){
    		System.out.println("没有参数");
    	}catch(MyArithmeticException e){
    		
    	}catch(EcDef e){
    		e.run();
    	}
    	
    	
	}
}
