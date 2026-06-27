package com.day2;
public class Library implements LibraryAdmin {

    boolean available = true;

    @Override
    public void checkBook() {
        if (available)
            System.out.println("Book is Available.");
        else
            System.out.println("Book is Not Available.");
    }

    @Override
    public void issueBook() {
        if (available) {
            System.out.println("Book Issued Successfully.");
            available = false;
        } else {
            System.out.println("Sorry! Book is Not Available.");
        }
    }

    @Override
    public void addBook() {
        available = true;
        System.out.println("New Book Added.");
    }
}