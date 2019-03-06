package LibrarySystem;

public class Book extends LibraryItem {
    public String author;
    public String publisher;

    public Book(String name, String refNumber, int year, String author, String publisher) {
        super(name, refNumber, year);
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book \n" +
                "Name = \"" + name +
                "\"\nReference Number = " + refNumber +
                "\nYear = " + year +
                "\nAuthor = \"" + author + '\"' +
                "\nPublisher = \"" + publisher + "\" \n";
    }
}
