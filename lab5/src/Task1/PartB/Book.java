package Task1.PartB;

public class Book extends LibraryItem {
    private int numberOfPages;

    public Book(String title, String author, int year, int pages) {
        super(title, author, year);
        this.numberOfPages = pages;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Author: " + getAuthor() + ", Year: " + getPublicationYear() + ", Pages: " + numberOfPages;
    }
}
