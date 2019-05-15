package com.spring.boot;

public interface BookDao {
    public void save(Book book);

    public Book get(Long id);


}
