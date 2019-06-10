package second;

public class Person {
	int a=10;
	public class B
	{
		int a=20;
		public B()
		{
			System.out.println(a);
			System.out.print(Person.this.a);
		}
	}
	 public static void main(String argv[]) {
			
		Person p=new Person();
		Person.B b=p.new B();
		
		 	    }    
}
