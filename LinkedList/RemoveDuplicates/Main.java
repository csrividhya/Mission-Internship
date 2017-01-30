//code to remove duplicates from an unsorted SLL . not allowed to use a temp buffer
import java.io.*;
import java.util.*;

class Node
{
	Node next;
	int data;

	Node(int d)
	{
		data = d;
		next = null;
	}

	Node()
	{
		next=null;
	}
}

public class Main
{

	static Node remove_duplicates(Node head)
	{
		Node x = head.next;
		Node temp;

		while(x!=null)
		{
			temp=x;
			while(temp!=null && temp.next!=null)
			{
				if(temp.next.data!=x.data)
					temp=temp.next;
				else
				{
					temp.next=temp.next.next;
				}
			}
			x=x.next;
		}
	return head;
	}

	static void printList(Node head)
	{
		//head is a dummy first node
		Node temp = head.next;

		if(temp== null)
			System.out.println("Empty List");

		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		Node head = new Node();
		Node temp = new Node();


		System.out.println("Enter num of elements you wanna insert into the SLL : ");
		int n = s.nextInt();

		System.out.println("Enter elements of linked list: ");
		while(n>0)
		{
			if(head.next==null)
				{
					Node new_node = new Node(s.nextInt());
					head.next = new_node;
					temp = head; //temp points to head.. can be used for traversing the linked list bro!!
					n--;
				}
			else if(temp.next!=null)
			{
				Node new_node = new Node(s.nextInt());
				temp = temp.next;
				temp.next = new_node;
				n--;
			}
			
		}
		printList(head);
		head = remove_duplicates(head);
		System.out.print("\n After removing duplicates: ");
		printList(head);
	}

}