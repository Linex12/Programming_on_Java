package Practice4.Task3;

public class Book2 {
    private String author;
    private String name;
    private int year;
    private int pages;
    public Book2() {
        author = "James Bolt";
        name = "Flying above the sky";
        year = 2038;
        pages = 301;
    }
    public Book2(String author, String name, int year, int pages) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.pages = pages;
    }
    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Author: " + author + "\nName: " + name + "\nYear: " + year + "\nPages: " + pages;
    }
}
