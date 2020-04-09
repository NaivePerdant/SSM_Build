package com.perdant.service;

import com.perdant.dao.BooksMapper;
import com.perdant.pojo.Books;

import java.util.List;

public class BooksServiceImpl implements BooksService {

    BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    public int addBook(Books books) {
       return booksMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return booksMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return booksMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return booksMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return booksMapper.queryAllBook();
    }
}
