
public class DoubleList {
	DoubleNode head;
	public static void main(String[] args) {
		DoubleList list = new DoubleList();
		list.head = new DoubleNode(1);
		DoubleNode second = new DoubleNode(2);
		DoubleNode third = new DoubleNode(3);
		DoubleNode four = new DoubleNode(4);
		list.head.next=second;
		list.head.previous=null;
		second.next=third;
		second.previous=list.head;
		third.next=four;
		third.previous=second;
		four.next=null;
		four.previous=third;
		list.addfront();
		list.random();
		list.deleterandom();
		list.printlist();
	}
	void printlist()
	{
		DoubleNode n = head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	void addfront()
	{
		DoubleNode n = new DoubleNode(0);
		n.next=head;
		n.previous=null;
		head.previous=n;
		head =n;
	}
	void random()
	{
		int position =3;
		DoubleNode n = new DoubleNode(99);
		DoubleNode prev=head;
		int temp=0;
		while(temp<position-1)
		{
			prev=prev.next;
			temp++;
		}
		n.next=prev.next;
		n.previous=prev;
		(prev.next).previous=n;
		prev.next=n;
	}
	void deleterandom()
	{
		int position = 3;
		int temp=0;
		DoubleNode prev=head;
		while(temp<position-1)
		{
			prev=prev.next;
			temp++;
		}
		prev.next = (prev.next).next;
		(prev.next).previous = prev;
	}
}
