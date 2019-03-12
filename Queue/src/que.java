import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class que {
	int q[];	
	int front,rear,size;
	que(int s)
	{
		size=s;
		q=new int[size];
		front=0;
		rear=0;
	}
	void push(int data)
	{
		if(rear==size)
		{
			System.out.println("Overflow");
		}
		else
		{
			q[rear]=data;
			rear=rear+1;
		}
	}
	void pop()
	{
		if(front==0 && rear==0)
		{
			System.out.println("underflow");
		}
		else
		{
			front=front+1;
		}
	}
	void display()
	{
		for(int i=front;i<=rear;i++)
		{
			System.out.println(q[i]);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size ");
		int s = Integer.parseInt(in.readLine());
		que ob = new que(s);
		ob.push(1);
		ob.push(2);
		ob.push(3);
		ob.display();
	}
}
