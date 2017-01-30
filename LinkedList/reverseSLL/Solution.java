import java.io.*;
import java.util.*;

class ListNode 
{
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
      ListNode(){}
 }

public class Solution
{
	public static void print(ListNode h)
	{
		ListNode temp=h;
		while(temp!=null)
		{
			if(temp.next==null)
				{
					System.out.print(temp.val);
					break;
				}
			else
				System.out.print(temp.val+"-->");
			temp=temp.next;
		}
	}

	 public static ListNode reverse(ListNode l)
    {
    	ListNode cur = l;
    	ListNode prev = new ListNode();
		ListNode nex = new ListNode();
		prev=nex=null;

    	while(cur.next!=null)
    	{
    		nex=cur.next;
    		cur.next=prev;
    		prev=cur;
    		cur=nex;
    	}
    	l=prev;
    	return prev;
    }

	public static void main(String args[])
	{
		ListNode head = new ListNode(0);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter elements of linkedlist:");
		int n = s.nextInt();
		head.val=n;
		ListNode temp=new ListNode(0);
		head.next=temp;
		while(true)
		{
			n=s.nextInt();
			if(n==999)
			{
				temp.next=null;
				break;
			}
			else
			{
			temp.val=n;
			temp.next= new ListNode();
			temp=temp.next;
			}
		}
		//print(head);

		ListNode newhead = reverse(head);
		print(newhead);
		
		

	}
}