package org.example.books;

public class Book {
    private String title;
    private int pages;
    private int publicationYear;


    //Constructor
    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;

    }
    //getters
    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Pages: " + getPages() + ", Year: " + getPublicationYear();
    }
}
