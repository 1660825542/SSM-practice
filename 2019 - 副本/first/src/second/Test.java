package second;

public class Test {
	private static Test t=new Test();
	private Test(){
		System.out.println("¼Ó£º");
	}

	public  void comp(){
		 Computer.setnumber(11, 10);
		 System.out.println("¼Ó£º"+Computer.addition());
		 System.out.println("¼õ£º"+ Computer.subtration());
		 System.out.println("³Ë£º"+ Computer.multiplication());
		 System.out.print("³ý£º"+ Computer.division());}
	public static Test fun(){
		return t;		
	}	  
	
}