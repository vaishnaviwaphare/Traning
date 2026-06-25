package test.java;

public class TestLibrary {
    public static void main(String[] args) {

        Book b1 = new Book("The Alchemist");

        Member m1 = new Member("Rahul");
        Member m2 = new Member("Priya");

        m1.issueBook(b1); // Success

        m2.issueBook(b1); // Not available

        b1.status();

        m1.status();

        m2.status();
    }
}