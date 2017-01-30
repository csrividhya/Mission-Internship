//code to remove kth element from the last in a SLL

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

	static Node last_node(Node head)
	{
		Node temp = head.next;

		while(temp.next!=null)
		{
			temp = temp.next;
		}

		return temp;
	}

	static Node search_x(Node head, int x)
	{
		Node temp = head.next;

		while(temp!=null && temp.data!=x)
		{
			temp=temp.next;
		}
		return temp;
	}

	static void partition(Node head, int x)
	{
		Node target = new Node();
		Node last  = new Node();
		int buffer;
		target=search_x(head,x);
		last = last_node(head);
		//swap
		Node temp = new Node();
		int yolo = target.data;

		target.data = last.data;
		last.data = yolo;

		printList(head);

		//do stuff
		temp = head.next;
		Node small = head;
		while(temp.next!=null)
		{
			if(temp.data >= x)
				temp = temp.next;
			else if(temp.data <x)
			{
				small = small.next;
				buffer = small.data;
				small.data = temp.data;
				temp.data= buffer;

			}
		}

		buffer = temp.data;
		temp.data = small.next.data;
		small.next.data = buffer;

		printList(head);
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
		int num = n;

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


		int x;
		System.out.println("Enter value x: ");
		x = s.nextInt();	
		partition(head,x);
	}
}