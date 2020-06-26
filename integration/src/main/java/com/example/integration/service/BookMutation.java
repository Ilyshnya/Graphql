package com.example.integration.service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.integration.entity.Book;
import com.example.integration.repository.AuthorRepo;
import com.example.integration.repository.BookRepo;
import com.example.integration.repository.MyStoreRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
@Slf4j
@Component
@RequiredArgsConstructor
public class BookMutation implements GraphQLMutationResolver {

    private final AuthorRepo authorRepo;
    private final MyStoreRepo storeRepo;
    private final BookRepo bookRepo;

    private final BookQueries bookQueries;

    public Book createBook(Book book,Long id,Long storeId){
        bookQueries.books().forEach(x->log.info(x.getId().toString()));
        book.setAuthor(authorRepo.findById(id).orElseThrow(IllegalArgumentException::new));
        book.setStores(List.of(storeRepo.findById(storeId).orElseThrow(IllegalAccessError::new)));
        return bookRepo.save(book);
    }

    public Book createBookV2(Book b){

        return bookRepo.save(b);
    }
}
