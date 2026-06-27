package com.day2;

public class TestLibrary {

    public static void main(String[] args) {

        Library lib = new Library();

        lib.checkBook();   
        lib.issueBook();   
        lib.checkBook();   
        lib.addBook();     
        lib.checkBook();   
    }
}