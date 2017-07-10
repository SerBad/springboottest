package com.example.demo.mapper;

import com.example.demo.domain.Book;

import java.util.List;

/**
 * Created by zhou on 2017/7/7.
 */
public interface BookMapper {
    List<Book> getAll();

    Book getOne(Long id);

    void insert(Book user);

    void update(Book book);

    void delete(Long id);
}
