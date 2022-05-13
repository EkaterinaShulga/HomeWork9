package ru.skypro;
import java.util.Objects;

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

    @Override
    public String toString() {
        return  "Книга: " + getTitleBook() + " была издана в " + getYearPublication() + " году.";
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book1 = (Book) other;
        return titleBook.equals(book1.titleBook);
    }
    @Override
    public int hashCode() {
        return Objects.hash(titleBook);
    }
}
