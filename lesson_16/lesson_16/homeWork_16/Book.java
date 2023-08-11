package homeWork_16;

public class Book {
    String title;
    String author;
    int yearPublished;
    String genre;

    public Book() {
    }

    public Book(String title1, String author1) {
        this.title = title1;
        this.author = author1;
    }

    public Book(String title, String author, String genre, int year) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearPublished = year;
    }

    void openBook(int page){
        System.out.println("Open book on page" + page);
    }
    void closeBook(){
        System.out.println("Book is closed");
    }
}
