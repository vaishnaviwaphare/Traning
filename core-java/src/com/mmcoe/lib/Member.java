package com.mmcoe.lib;

public class Member {
	private String name;
	private Book bk;
	
	public Member(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [Name=" + name + "]";
	}

	public void status() {
		if(bk == null)
			System.out.println(name + " has not issued any book");
		else
			System.out.println(name + " has issued " + bk);
	}

	public Book getBk() {
		return bk;
	}
	public void setBk(Book bk) {
		this.bk = bk;
	}
}
