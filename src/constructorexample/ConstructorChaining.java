package constructorexample;

public class ConstructorChaining {
	
	
	public  ConstructorChaining()
	{
		//this(10);//constructor calling
		//here instead of this we will have to create object if not this keyword, 
		//so this saves memory
		 ConstructorChaining obj1= new  ConstructorChaining(10);//instead using this will point 
		 //to the current object instead of calling another one,
	}
	public ConstructorChaining(int i)
	{
		//this("Java");
		//similarly
		 ConstructorChaining obj2= new  ConstructorChaining("Java");
		System.out.println(i);
		
	}
	
	public ConstructorChaining(String s)
	{
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		ConstructorChaining obj = new ConstructorChaining(); 
	}

}
