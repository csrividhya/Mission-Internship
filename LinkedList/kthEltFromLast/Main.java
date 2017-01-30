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

	static void k_remove(Node head,int num, int k)
	{
		Node temp = head.next;
		Node prev= new Node();;

		if(temp == null) //empty
			System.out.println("Empty list. Cannot delete any kth element");
		else if(temp.next==null)//1 element
		{
			if(k==0)
				System.out.println("On deleting kth element, we get an empty list");
			else
				System.out.println("OUT OF BOUNDS");
		}
		else//more than 1 elt in the SLL
		{
			int count = 1, target = num - k;
			if(target<0)
				System.out.println("OUT OF BOUNDS");
			while(temp!=null)
			{
				if(count==target && temp.next!=null)
				{
					temp.data = temp.next.data;
					temp.next = temp.next.next;
				}
				else if(count == target && temp.next==null)
				{
					//last elt
					prev.next = null;
				}
				count++;
				prev = temp;
				temp=temp.next;


			}
			printList(head);
		}
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

		System.out.println("Enter k(0-num) s.t kth element from last will be deleted: ");
		int k = s.nextInt();
		k_remove(head,num,k);
		


	}
}