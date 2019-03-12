import java.util.NoSuchElementException;

public class Linkedlist {
	Node head = null;
	void push(int data)
	{
		Node n= new Node();
		n.data=data;
		n.next=head;
		head=n;
	}
	void pop()
	{
		if(head==null)
		{
			throw new NoSuchElementException();
		}
		head=head.next;
	}
	void display()
	{
		Node temp = new Node();
		temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		Linkedlist stack = new Linkedlist();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.display();
	}

}
