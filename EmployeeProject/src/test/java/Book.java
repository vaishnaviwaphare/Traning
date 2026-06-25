package test.java;

public class Book {
    private String title;
    private Member member;

    public Book(String title) {
        this.title = title;
    }

    public boolean issueTo(Member m) {
        if (member != null) {
            System.out.println(title + " is not available.");
            return false;
        }

        member = m;
        return true;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + "]";
    }

    public void status() {
        if (member == null)
            System.out.println(title + " is available.");
        else
            System.out.println(title + " is issued to " + member);
    }
}