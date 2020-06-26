package com.example.integration.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.integration.entity.Book;
import com.example.integration.repository.BookRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.script.ScriptTemplateViewResolver;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
@RequiredArgsConstructor
public class BookQueries implements GraphQLQueryResolver {




    private final BookRepo bookRepo;

    public List<Book> books(){
        log.info("getBooks method was called");
        return bookRepo.findAll();
    }

    public List<Book> booksByAuthor(String name) {


        return  bookRepo.findAll().stream().filter(x -> x.getAuthor().getName().equals(name)).collect(Collectors.toList());

    }

    public Book getBook(Long id){
        return bookRepo.findById(id).orElseGet(null);
    }
}
