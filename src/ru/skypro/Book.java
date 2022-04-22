package ru.skypro;

public class Book {
    private String titleBook;
    Author author;

    private int yearPublication;

    public Book(String titleBook, Author author, int yearPublication) {
        this.titleBook = titleBook;
        this.yearPublication = yearPublication;
        this.author = author;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
