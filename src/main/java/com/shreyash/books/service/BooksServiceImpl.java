package com.shreyash.books.service;

import com.shreyash.books.entity.Books;
import com.shreyash.books.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BooksServiceImpl implements BooksService {
    @Autowired
    BooksRepository booksRepository;
    @Override
    public Books saveBooks(Books books) {
        return booksRepository.save(books);
    }

    @Override
    public List<Books> fetchBookList() {
        return (List<Books>)booksRepository.findAll();
    }

    @Override
    public Books updateBooks(Books books, Long id) {
        Books b = booksRepository.findById(id).get();

        if(Objects.nonNull(books.getTitle()) && !"".equalsIgnoreCase(books.getTitle())){
            b.setTitle(books.getTitle());
        }

        return booksRepository.save(b);
    }

    @Override
    public void deleteBookById(Long id) {
        booksRepository.deleteById(id);
    }
}
