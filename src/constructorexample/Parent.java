package constructorexample;

public class Parent {

	public Parent()//no-arg
	{
		System.out.println("Parent class no-arg cons");
	}
	
	public Parent(String text)
	{
		//System.out.println("Parent class one-arg constructor");
		//System.out.println("hi from the parent");//can pass any message here or else like this
		System.out.println(text);
	}
	
	
	int i=100;
	
	public void add()
	{
		System.out.println("add() of Parent class");
	}

}



