package lab2.problem1;

public class Book extends LibraryItem {
    private int numberOfPages;
    private String summary;
    public Book(String title, String author, int year, int pages, String summary) {
        super(title, author, year);
        this.numberOfPages = pages;
        this.summary = summary;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int pages) {
        this.numberOfPages = pages;
    }
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    @Override
    public String toString() {
        return super.toString() + ".\nIt's book with following summary: " + summary;
    }
}