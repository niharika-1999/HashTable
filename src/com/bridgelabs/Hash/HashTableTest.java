package com.bridgelabs.Hash;

public class HashTableTest {
	public static void main(String[] args) // Main method
	{
		HashTable<Integer,String> hash = new HashTable<Integer,String>();
		hash.insertNode(1,"To");
		hash.insertNode(2,"be");
		hash.insertNode(3,"or");
		hash.insertNode(4,"not");
		hash.insertNode(5,"to");
		hash.insertNode(6,"be");
		hash.display();
		
	}

}
