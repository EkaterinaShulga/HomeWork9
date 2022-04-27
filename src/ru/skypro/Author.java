package ru.skypro;
import java.util.Objects;

public class Author {

    private String nameAuthor;
    private String lastNameAuthor;

    public Author(String nameAuthor, String lastNameAuthor) {
        this.nameAuthor = nameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getLastNameAuthor() {
        return lastNameAuthor;
    }

    @Override
    public String toString() {
        return "Автор книги " + " - " + getNameAuthor() + " " + getLastNameAuthor() + ".";
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author1 = (Author) other;
        return nameAuthor.equals(author1.nameAuthor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor);
    }
}
