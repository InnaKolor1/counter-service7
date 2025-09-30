package java.ru.hogwarts.school.controller;

import org.springframework.web.bind.annotation.*;

import java.ru.hogwarts.school.model.Book;
import java.ru.hogwarts.school.service.BookService;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;


@RestController
@RequestMapping("books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("{id}") //GET http//localhost:8080/books/6
    public Book getBookInfo(@PathVariable Long id){
        return bookService.findBook(id);
    }
    @PostMapping //POST http//localhost:8080/books
    public Book createBook(Book book){
        return bookService.createBook(book);
    }
}
