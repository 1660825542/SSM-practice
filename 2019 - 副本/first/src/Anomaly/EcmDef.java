package Anomaly;
import java.util.*;
import java.util.Scanner;

public class EcmDef {
	
	public int  run(int x,int y) throws EcDef,MyArrayIndexOutOfBoundsException,MyArithmeticException
	{
		if(y==0)
		{
			throw new MyArithmeticException("����:����Ϊ0");
		}
		else if(x<0||y<0)
		{
			throw new EcDef("����:����С��0");
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
    		System.out.println("û�в���");
    	}catch(MyArithmeticException e){
    		
    	}catch(EcDef e){
    		e.run();
    	}
    	
    	
	}
}
