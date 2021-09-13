package com.bridgelabs.Hash;
/**
 * 
 * @author Niharika Rao
 * HashTable program to find frequency of words in the sentence
 * generics is used with data types T1,T2
 */

public class HashTable<T1,T2> {
	Node<T1,T2>head=null,current,temp;
	
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
	 
	 public void remove(T2 data) //remove method used to delete a data from linked list
	 {
		 current=head;
		 temp=current.next;
		 if(current.data.equals(data))
		 {
			 head=current.next;
		 }
		 while(temp!=null)
		 {
			 if(temp.data.equals(data))
			 {
				 current.next=temp.next;
				 System.out.println("Removed the word '"+ temp.data +"' from the phrase");
			 }
			 temp=temp.next;
			 current=current.next;
		 }
		 display();
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
		 temp=head;
		 if(!Empty())
		 {
			 while(temp.next!=null)
			 {
				 System.out.print(temp.data + " ");
				 temp=temp.next;
			 }
			 System.out.println(temp.data + " ");
		 }
		 else
		 {
			 System.out.println("Nothing is present");
		 }
	 }
}
    
    

    
	    

	    
	    	

	    
	   
	
