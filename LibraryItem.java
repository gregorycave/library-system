package LibrarySystem;

public abstract class LibraryItem {
    public String name;
    public String refNumber;
    public int year;

    public LibraryItem(String name, String refNumber, int year) {
        this.name = name;
        this.refNumber = refNumber;
        this.year = year;
    }
}
