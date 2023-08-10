package model;
//

public class Book {
    private int categoryNumber;
    private String author;
    private String  title;
    private int year;
    private String publisher;
    private String bookCode;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String category;

    public Book(int categoryNumber, String author, String title, int year, String publisher, String bookCode) {
        this.categoryNumber = categoryNumber;
        this.author = author;
        this.title = title;
        this.year = year;
        this.publisher = publisher;
        this.bookCode = bookCode;
    }

    public Book(int... categoryNumber  ) {
    }

    public int getCategoryNumber() {
        return categoryNumber;
    }

    public void setCategoryNumber(int categoryNumber) {
        this.categoryNumber = categoryNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    @Override
    public String toString() {
        return "Book{" +
                "categoryNumber=" + categoryNumber +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", publisher='" + publisher + '\'' +
                ", bookCode='" + bookCode + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
