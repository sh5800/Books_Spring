package com.shreyash.books.controller;

import com.shreyash.books.entity.Books;
import com.shreyash.books.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins="http://localhost:3000")
public class BooksController {
    @Autowired
    BooksService booksService;

    @GetMapping("/")
    public List<Books> fetchBooksList(){
        return booksService.fetchBookList();
    }

    @PostMapping("/")
    public Books saveBook(@RequestBody Books book){
        return booksService.saveBooks(book);
    }

    @PutMapping("/{id}")
    public Books updateBook(@RequestBody Books book, @PathVariable("id") Long id ){
        return booksService.updateBooks(book,id);
    }

    @DeleteMapping("/{id}")
    public String deleteBookById(@PathVariable("id") Long id){
        booksService.deleteBookById(id);

        return "Book Deleted Successfully";
    }
}
