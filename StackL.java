import java.util.*;
class Node
{
	int data;
	Node next;
	Node()
	{

	}
	Node(int data)
	{
	  this.data=data;
	}
}
class MyStack
{
	static Node top;
	static void push(int ele)
	{
	  Node cur=new Node(ele);
	  if(cur==null)
	  {
	    System.out.println("stack overflow");
	    return;
	   }
	   if(top==null)
	   {
	    top=cur;
	    return;
	   }
	   cur.next=top;
	   top=cur;
	   System.out.println(ele+" insert ");

	}
	static void pop()
	{
	 if(top==null)
	 {
	   System.out.println("no element");
	   return;
	 }
	 System.out.println("delete element= "+top.data);
	 top=top.next;

	}
	static void peek()
	{
	   if(top==null)
	   {
	    System.out.println("no element");
	    return;
	   }
	   System.out.println("top element= "+top.data);
	}
	static void disp()
	{
	  if(top==null)
	   {
	    System.out.println("no element");
	    return;
	   }
	    System.out.println("element are");
	    Node temp=top;
	    while(temp!=null)
	    {
	    System.out.println(temp.data);
	    temp=temp.next;
	    }
	 }
	    
   }
   class Test
   {
	   public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
            MyStack m=new MyStack();
            int ch;
            while(true)
             {
                System.out.println("enter your choice\n1.push\n2.pop\n3.peek\n4.disp\n5.exit");
                ch=sc.nextInt();
                 switch(ch)
                  {
                   case 1:
                   System.out.println("enter a element to push");
                   m.push(sc.nextInt());
                   break;
                   case 2:
                   m.pop();
                   break;
                   case 3:
                   m.peek();
                   break;
                   case 4:
                   m.disp();
                   break;
                   case 5:
                   System.exit(0);
                   default:System.out.println("invalid choice ");

         }
       
       }	
	}
}
	


