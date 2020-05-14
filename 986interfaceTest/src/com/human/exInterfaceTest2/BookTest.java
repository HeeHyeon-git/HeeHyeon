package com.human.exInterfaceTest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class BookTest {

	public static void main(String[] args) {
		Book [] books = {new Book(15000), new Book(50000), new Book(20000)};
		
		Arrays.sort(books);
	
		for(Book b : books) {
			System.out.println(b.toString());
		
		}
		
	}
}
