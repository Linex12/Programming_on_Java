package Practice1.Task3;

public class Book {
    private String name;
    private String author;
    private int pages;
    public Book(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }
    public Book() {
        this.name = "Notebook";
        this.author = "No author";
        this.pages = 32;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getPages() {
        return pages;
    }
    public void setType(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setSize(int pages) {
        this.pages = pages;
    }
    public String toString() {
        return "Name: "+this.name+"\nAuthor: "+this.author+"\nPages: "+this.pages;
    }
}
