package test.java;

public class Member {
    private String name;
    private Book book;

    public Member(String name) {
        this.name = name;
    }

    public void issueBook(Book b) {
        if (book != null) {
            System.out.println(name + " already has a book.");
            return;
        }

        if (b.issueTo(this)) {
            book = b;
            System.out.println(name + " successfully issued " + b);
        }
    }

    @Override
    public String toString() {
        return "Member [name=" + name + "]";
    }

    public void status() {
        if (book == null)
            System.out.println(name + " has no book.");
        else
            System.out.println(name + " has " + book);
    }
}