import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stacck {
	int arr[];
	int size,top;
	stacck(int s)
	{
		size=s;
		top=-1;
		arr=new int[size];
	}
	void push(int n)
	{
		if(top==size)
		{
			System.out.println("Overflow");
		}
		else
		{
			top+=1;
			arr[top]=n;
		}
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Underflow");
		}
		else
			top=top-1;
	}
	void display()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the stack");
		int s=Integer.parseInt(in.readLine());
		stacck ob = new stacck(s);
		ob.push(1);
		ob.push(2);
		ob.push(3);
		ob.push(4);
		ob.display();
		ob.pop();
		ob.display();
	}

}
