
public class Goodques {
	int limit=10;
	void fun2(int n)
	{
		if(n<=0)
			return;
		if(n>limit)
			return;
		System.out.print(n+" ");
		fun2(2*n);
		System.out.print(n+" ");
	}
	public static void main(String[] args) {
		Goodques ob = new Goodques();
		ob.fun2(4);
	}

}
