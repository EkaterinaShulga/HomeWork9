package ru.skypro;

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
}
