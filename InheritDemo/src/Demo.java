class Calculator
{
	public int add(int i,int j)
	{
		return i+j;
	}
}
class advcal extends Calculator
{
	public int sub(int i, int j)
	{
		return i-j;
	}
}
class veryadvcal extends advcal
{
	public int mul(int i,int j)
	{
		return i*j;
	}
}
public class Demo {

	public static void main(String[] args) 
	{
		veryadvcal ob = new veryadvcal();
		int result=ob.add(5, 4);
		int res=ob.sub(5, 4);
		int r=ob.mul(2, 4);
		System.out.println(result);
		System.out.println(res);
		System.out.println(r);
	}

}
