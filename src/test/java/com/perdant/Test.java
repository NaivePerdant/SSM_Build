package com.perdant;

import com.perdant.pojo.Books;
import com.perdant.service.BooksService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksService booksServiceImpl = (BooksService) context.getBean("BooksServiceImpl");
        List<Books> list = booksServiceImpl.queryAllBook();
        for (Books books : list) {
            System.out.println(books);
        }
    }
}
