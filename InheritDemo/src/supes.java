class A
{
	public A()
	{
		System.out.println("In A");
	}
	public A(int i)
	{
		System.out.println("In parameterised A");
	}
}
class B extends A
{
	public B()
	{
		System.out.println("In B");
	}
	public B(int i)
	{
		super(4);
		System.out.println("In parameterised B");
	}
}
public class supes {

	public static void main(String[] args) {
		B ob = new B(4);
	}

}
