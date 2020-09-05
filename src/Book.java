public class Book {
    private String author;
    private String name;

    public Book(String a, String n) {
        author = a;
        name = n;
    }
    public String toString(){
        return "Author: " + this.author + ", name of the book: " + this.name;
    }
}
