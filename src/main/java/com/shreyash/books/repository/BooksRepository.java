package com.shreyash.books.repository;

import com.shreyash.books.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.annotation.Native;

public interface BooksRepository extends JpaRepository<Books,Long> {
}
