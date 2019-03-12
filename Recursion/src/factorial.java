
public class factorial {
	int fact(int n)
	{
		if(n==1)
			return 1;
		else
			return(n*fact(n-1));
	}
	public static void main(String[] args) {
		int num=5;
		factorial ob = new factorial();
		int res=ob.fact(num);
		System.out.println(res);
	}

}
