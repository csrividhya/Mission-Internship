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
	static void add(Node head1, Node head2, int n1, int n2)
	{
		Node temp1 = head1.next;
		Node temp2 = head2.next;
		Node head3 = new Node();
		Node ans = head3.next;

		int min;

		if(n2<=n1)
			min = n2;
		else 
			min = n1;

		int carryover = 0,c=0;

		while(min>0 && temp1!=null && temp2!=null)
		{
			
			c = temp1.data + temp2.data + carryover;
			
			if(c>=10)
			{
				c=c-10;
				carryover = 1;
			}
			else
				carryover = 0;

			System.out.print(c+" ");
			min --;
			c = 0;
			temp1 = temp1.next;
			temp2 = temp2.next;
	}

	if(temp1!=null)
	{
		System.out.print(temp1.data+" ");
		temp1 = temp1.next;
	}


	else if(temp2!=null)
	{
		System.out.print(temp2.data+" ");
		temp2 = temp2.next;
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
		Node head1 = new Node();
		Node head2 = new Node();
		
		Node temp = new Node();


		System.out.println("Enter num of digits in number 1 : ");
		int n1 = s.nextInt();
		int num1 = n1;

		System.out.println("Enter number1 : ");
		while(n1>0)
		{
			if(head1.next==null)
				{
					Node new_node = new Node(s.nextInt());
					head1.next = new_node;
					temp = head1; //temp points to head.. can be used for traversing the linked list bro!!
					n1--;
				}
			else if(temp.next!=null)
			{
				Node new_node = new Node(s.nextInt());
				temp = temp.next;
				temp.next = new_node;
				n1--;
			}
			
		}

		System.out.println("Enter num of digits in number 2 : ");
		int n2 = s.nextInt();
		int num2 = n2;
		

		System.out.println("Enter number2 : ");
		while(n2>0)
		{
			if(head2.next==null)
				{
					Node new_node = new Node(s.nextInt());
					head2.next = new_node;
					temp = head2; //temp points to head.. can be used for traversing the linked list bro!!
					n2--;
				}
			else if(temp.next!=null)
			{
				Node new_node = new Node(s.nextInt());
				temp = temp.next;
				temp.next = new_node;
				n2--;
			}
			
		}

		//printList(head1);
		//printList(head2);
		add(head1,head2,num1,num2);
		
	}
}