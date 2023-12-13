package com.shreyash.books.service;

import com.shreyash.books.entity.Books;

import java.util.List;

public interface BooksService {

    Books saveBooks(Books books);
    List<Books> fetchBookList();
    Books updateBooks(Books books, Long id);
    void deleteBookById(Long id);
}
