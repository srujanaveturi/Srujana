package sujju;

public class variable {
			int a=10;//instance variable
			void print()
			{
				String msg="hello";//local variable
				System.out.println(msg);
			}
	
	static String message="hello students" ;//static variable
	
	public static void main(String[] args) {
		variable obj=new variable(); 
		System.out.println("the value of a is "+obj.a);
		obj.print();
		System.out.println(message);

	}

}