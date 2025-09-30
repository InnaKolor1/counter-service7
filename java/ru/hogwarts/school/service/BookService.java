package java.ru.hogwarts.school.service;

import org.springframework.stereotype.Service;

import java.ru.hogwarts.school.model.Book;
import java.util.HashMap;

@Service
public class BookService {
    private final HashMap<Long, Book> books = new HashMap<>();

    private long lastId = 1;


    public Book createBook(Book book) {
        book.setId(++lastId);
        books.put(lastId, book);
        return book;
    }
public Book findBook(long id){
        return books.get(id);
}
public Book editBook (Book book){
        books.put(book.getId(),book);
        return book;
}
public Book deleteBook(long id){
        return books.remove(id);
}
}
