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

	static Node reverse(Node head)
	{
		Node temp = head;
		ArrayList<Integer> a = new ArrayList<Integer>();

		while(temp!=null)
		{
			a.add(temp.data);
			temp = temp.next;
		}

		Collections.reverse(a);
		Node rhead= new Node();
		Node new_node;

		for(int x:a)
		{	
			new_node = new Node(x);
			rhead = insert(new_node,rhead);
		}

		return rhead;
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

	static int palindrome(Node head, Node rhead,int n)
	{
		Node temp = head.next;
		Node rtemp = rhead.next;
		int flag = 1;

		while(n!=n/2)
		{
			if(temp.data != rtemp.data)
			{
				flag=0;
				break;
			}
			temp = temp.next;
			rtemp = rtemp.next;
			n--;
			
		}
		return flag;

	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		Node head = new Node();
		Node rhead = new Node();
		
		Node temp;

		System.out.println("Enter num of elements you wanna insert into the SLL : ");
		int n = s.nextInt();
		int num = n;
		System.out.println("Enter elements you wanna insert into the SLL : ");
		
		while(num>0)
		{
			temp = new Node(s.nextInt());
			head=insert(temp,head);
			num--;
		}
		//printList(head);
		rhead=reverse(head);
		int result = palindrome(head,rhead,n);
		//printList(rhead);

		if(result==0)
			System.out.println("NOT A PALINDROME");
		else if(result ==1)
			System.out.println("PALINDROME");
	}
}

