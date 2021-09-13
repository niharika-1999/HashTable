package com.bridgelabs.Hash;
/**
 * 
 * @author Niharika Rao
 * HashTable program to find frequency of words in the sentence
 * generics is used with data types T1,T2
 */

public class HashTable<T1,T2> {
	Node<T1,T2>head=null,temp,current;
	
	class Node<T1,T2> //Class node constructor to create node
	{
		T1 key;
		T2 data;
		Node<T1,T2> next;
	    Node(T1 k,T2 value)
	    {
    		key=k;
    		data=value;
    		next=null;
    	}
	}
	 public void insertNode(T1 keys,T2 data) //insertNode method with parameters keys and data 
     {
		 Node<T1,T2> new_node=new Node<T1,T2>(keys,data);
		 if(head==null)
		 {
			 head=new_node;
			 current=head;
		 }
		 else
		 {
			 temp=head;
			 while(temp!=null)
			 {
				 if(temp.key==keys)
				 {
					 temp.key=keys;
					 temp.data=data;
				 }
				 temp=temp.next;
			 }
			 head=new_node;
			 head.next=current;
			 current=head;
		 }
    	 
     }
	 
	 public void frequency(T2 data) //frequency method used to check the number of times data present in LinkedList
	 {
		 int count;
		 count=0;
		 temp=head;
		 while(temp!=null)
		 {
			 if(temp.data==data)
			 {
				 count++;
			 }
			 temp=temp.next;
		 }
		 System.out.println("Frequency:"+ count);
	 }
	 
	 public Boolean Empty() //Empty method used to check if head is null,returns true i.e list is empty 
	 {
		 temp=head;
		 if(temp==null)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
	 
	 public void display() //Display the content of linked list
	 {
		 Node<T1,T2> temp_node=head;
		 if(!Empty())
		 {
			 while(temp_node.next!=null)
			 {
				 System.out.print(temp_node.data+":\n");
				 frequency(temp_node.data);
				 temp_node=temp_node.next;
			 }
			 System.out.println(temp_node.data);
			 frequency(temp_node.data);
		 }
		 else
		 {
			 System.out.println("Nothing is present");
		 }
	 }
}
    
    

    
	    

	    
	    	

	    
	   
	
