package com.mmcoe.lib;

public class Book {
	private String title;
	private Member mbr;
	
	public Book(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [Title=" + title + "]";
	}

	public void status() {
		if(mbr == null)
			System.out.println(title + "not issued to any member");
		else
			System.out.println(title + " is issued to " + mbr);
	}
	
	public void issueBook(Member m) {
		this.mbr = m;
		m.setBk(this);
	}
	
	public void returnBook(Member m) {
		m.setBk(null);
		this.mbr = null;
	}
}
