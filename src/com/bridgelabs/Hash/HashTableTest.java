package com.bridgelabs.Hash;

public class HashTableTest {
	public static void main(String[] args) // Main method
	{
		HashTable<Integer,String> hash = new HashTable<Integer,String>();
		String phrase ="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] words=phrase.toLowerCase().split(" ");
		int i=0;
		for(String phrase_word:words)
		{
			i++;
			hash.insertNode(i,phrase_word);
		}
		hash.display();
		hash.remove("avoidable");
	}

}
