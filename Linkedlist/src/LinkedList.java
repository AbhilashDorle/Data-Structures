import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node{
	int data;
	Node next;
}

public class LinkedList {
	Node head;

		public static void main(String args[])throws IOException
		{
			int choice,data,location;
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			LinkedList list = new LinkedList();
			do
			{
				System.out.println("1. Add at front");
				System.out.println("2. Add random");
				System.out.println("3. Add at end");
				System.out.println("4. Delet");
				System.out.println("5. Print");
				System.out.println("6. Reverse the list");
				System.out.println("7. Finding kth element from the last");
				System.out.println("8. Exit");
				choice=Integer.parseInt(in.readLine());
				switch(choice)
				{
				case 1:
					System.out.println("Enter the data to be added");
					data=Integer.parseInt(in.readLine());
					list.addfront(data);
					break;
				case 2:
					System.out.println("Enter the data to be added");
					data=Integer.parseInt(in.readLine());
					System.out.println("Enter the location to be added");
					location=Integer.parseInt(in.readLine());
					list.addrandom(data,location);
					break;
				case 3:
					System.out.println("Enter the data to be added");
					data=Integer.parseInt(in.readLine());
					list.endback(data);
					break;
				case 4:
					System.out.println("Enter the location to be added");
					location=Integer.parseInt(in.readLine());
					list.delete(location);
					break;
				case 5:
					list.print();
					break;
				case 6:
					list.reverse();
					break;
				case 7:
					System.out.println("Enter the kth position");
					location=Integer.parseInt(in.readLine());
					list.kthelement(location);
					break;
				case 8:
					System.out.println("Thank you");
				}
			}while(choice!=8);
		}
		void addrandom(int data,int location)
		{
			Node n = new Node();
			n.data=data;
			Node prev=head;
			int temp=0;
			while(temp<location)
			{
				prev=prev.next;
				temp++;
			}
			n.next=prev.next;
			prev.next=n;
		}
		void delete(int position)
		{
			int i=0;
			Node n;
			Node prev=head;
			while(i<position-1)
			{
				prev=prev.next;
				i++;
			}
			n=prev.next;
			prev.next=n.next;
		}
		void endback(int data)
		{
			Node n = new Node();
			n.data=data;
			Node prev = head;
			while(prev.next!=null)
			{
				prev=prev.next;	
			}
			prev.next=n;
		}
		void addfront(int data)
		{
			Node n= new Node();
			n.data=data;
			n.next=head;
			head=n;
		}
		void print()
		{
			Node n=head;
			while(n!=null)
			{
				System.out.println(n.data);
				n = n.next;
			}
		}
		void reverse()
		{
			Node prev=null;
			Node current=head;
			Node next=null;
			while(current!=null)
			{
				next=current.next;
				current.next=prev;
				prev=current;
				current=next;
			}
			head=prev;
		}
		void kthelement(int position)
		{
			Node current=head;
			Node temp=head;
			int i=0;
			while(current.next!=null)
			{
				current=current.next;
				if(i>position)
				{
					temp=temp.next;
				}
				i++;
			}
			System.out.println("The element is "+temp.data);
		}
	}
