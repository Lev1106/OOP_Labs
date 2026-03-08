package lab2.problem1;

public abstract class LibraryItem {
    private String title;
    private String author;
    private int publicationYear;
    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.publicationYear = year;
    }
    // Constructor, Getters, and Setters
    // toString() and other methods

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublicationYear(int year) {
        this.publicationYear = year;
    }
    @Override
    public String toString() {
        return "Library item " + title + " by " + author + ", published in " + publicationYear;
    }
}