package second;

public class Test {
	private static Test t=new Test();
	private Test(){
		System.out.println("�ӣ�");
	}

	public  void comp(){
		 Computer.setnumber(11, 10);
		 System.out.println("�ӣ�"+Computer.addition());
		 System.out.println("����"+ Computer.subtration());
		 System.out.println("�ˣ�"+ Computer.multiplication());
		 System.out.print("����"+ Computer.division());}
	public static Test fun(){
		return t;		
	}	  
	
}