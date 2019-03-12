
public class CircularLlist {
		Node head;
	public static void main(String[] args) {
		CircularLlist list = new CircularLlist();
		list.head = new Node(1);
		Node first = new Node(2);
		Node second = new Node(3);
		Node third = new Node(4);
		Node fourth = new Node(5);
		list.head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=list.head;
		list.printlist();
	}
	void printlist()
	{
		Node temp=head;
		do
		{
			System.out.println(temp.data);
			temp=temp.next;
		}while(temp!=head);
	}

}
