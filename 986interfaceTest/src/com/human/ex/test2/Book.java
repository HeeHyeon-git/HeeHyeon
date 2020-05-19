package com.human.ex.test2;

public class Book implements Comparable<Book> {
	public int price = 0;
	
	public Book() {}
	public Book(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [price=" + price + "]";
	}
	
	@Override
	public int compareTo(Book compareBook) {
		return this.price - compareBook.price;
	}
	
	
}
