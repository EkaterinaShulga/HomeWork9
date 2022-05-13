package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Пауло", "Коэльо");
        Book book1 = new Book("\"Алхимик\"", author1, 1987);
        System.out.println(book1);
        System.out.println(author1);
        System.out.println();
        book1.setYearPublication(1988);
        System.out.println("В указании года издания книги "+ book1.getTitleBook() + " была допущена ошибка, верная дата: " + book1.getYearPublication() + ".");
        System.out.println();
        Author author2 = new Author("Сергей", "Лукьяненко");
         Book book2 = new Book("\"Черновик\"", author2, 2005);
        System.out.println(book2);
        System.out.println(author2);

    }
}
