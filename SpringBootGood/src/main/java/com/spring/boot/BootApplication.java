package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootApplication {
    public static void main(String[] args)  {
        ConfigurableApplicationContext ctx = SpringApplication.run(BootApplication.class, args);
        BookDao dao = ctx.getBean(BookDao.class);
        Book book = new Book("1234567890468", "Spring is so cool by Kuba", "Javastart");
        dao.save(book);
    }
}