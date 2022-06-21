
 class Singleton1{
static Singleton1 s = new Singleton1();
	
	private Singleton1()
	{
		
	}
	
	public static Singleton1 getSingleton()
	{
		return s;
	}
}

public class Singleton {

	public static void main(String[] args) {
		
		
		Singleton res = Singleton.getSingleton1();
		Singleton res1 = Singleton.getSingleton1();
		System.out.println("object address of the class is "+res);
		System.out.println("object address of the class is "+res1);
		System.out.println("singleton class cannot be inherited because the constructor of the class is private");
	}

	private static Singleton getSingleton1() {
		// TODO Auto-generated method stub
		return null;
	}



}
