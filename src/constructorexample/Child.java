package constructorexample;

public class Child extends Parent{

	int i = 50;

	public Child(String text) {
	//	super("ti");//can pass any text  here or else text variable as below
		super(text);
		//System.out.println("Child class no-arg constructor");
		//System.out.println("hi from child");
		System.out.println(text);
	}

	public static void main(String[] args) {
		Child c = new Child("hi");

		// Parent p= new Parent();
		// c.add();

	}

	public void add() {
		System.out.println("add() of Child class");
		// add() of parent class here

		super.add();
		// print value of child class variable i here
		System.out.println(this.i);
		// print the value f variable i of the parent class
		System.out.println(super.i);

	}

}
