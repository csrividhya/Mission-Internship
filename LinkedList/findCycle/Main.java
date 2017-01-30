//code to create a linked list with a cycle in it.. 1-2-3-4-5-6-7-8-4 (num of elts=8).. 
//need to find start of the cycle 

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
	static Node insert(Node x, Node head)
	{
		Node temp = head;

		if(x!=null)
		{
			if(head.next==null)
				head.next=x;
			else
			{
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=x;
			}	
		}

		return head;
	}

	static int findCycle(Node head)
	{
		Node slow = head;
		Node fast = head;

		while(slow.next!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast)
				break;
		}

		//slow and fast have collided and are pointing at same spot. 
		//the cycleHead is equidistant from SLL head & collision point spot is  before/after looop head
	slow = head;

	while(slow!=fast)
	{
		slow = slow.next;
		fast = fast.next;
	}

	return slow.data;
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
		Node temp;
	
		System.out.println("Enter num of elements you wanna insert into the SLL : ");
		int n = s.nextInt();
		int num = n;
System.out.println("Enter elements you wanna insert into the SLL : ");
		while(num>=5)
		{
			 temp = new Node(s.nextInt());
			head = insert(temp, head);
			num--;
		}
		Node yolo = head;
		while(yolo.next!=null)
				{
					yolo=yolo.next;
				}
				//temp contains last elt 
			 temp = new Node(s.nextInt());
			yolo.next = temp;
			num--;

			while(num>0)
			{
				 temp = new Node(s.nextInt());
				head = insert(temp, head);
				num--;
			}
			temp.next = yolo;

			//printList(head);
			int cycleStart = findCycle(head);
			System.out.println("Cycle starts at : " + cycleStart);
	}
}

