package LibrarySystem;

public class Periodical extends LibraryItem {
    public int issueNumber;

    public Periodical(String name, String refNumber, int year, int issueNumber) {
        super(name, refNumber, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {

        return "Periodical \n" +
                "Name = \"" + name +
                "\"\nReference Number = " + refNumber +
                "\nIssue Number = " + issueNumber + "\n";
    }
}