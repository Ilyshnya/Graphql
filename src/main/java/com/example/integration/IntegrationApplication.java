package com.example.integration;

import com.example.integration.entity.Author;
import com.example.integration.entity.Book;
import com.example.integration.entity.MyStore;

import com.example.integration.repository.AuthorRepo;
import com.example.integration.repository.BookRepo;

import com.example.integration.repository.MyStoreRepo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootApplication
public class IntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationApplication.class, args);
	}

	@Bean
	@Transactional
	public CommandLineRunner bean(AuthorRepo authorRepo, BookRepo bookRepo, MyStoreRepo storeRepo){
		return  args ->{
//			Book book1 = Book.builder().name("Book1").build();
//
//			var book2= Book.builder().name("Book2").build();
//
//			var aut1= Author.builder().name("Author1").build();
//			var aut2= Author.builder().name("Author2").build();
//
//			var store1= MyStore.builder().adress("Pushkina").books(List.of(book1,book2));
//			var store2= MyStore.builder().adress("Lermontova").books(List.of(book1,book2));
//
//			book1.setAuthor(aut1);
//			book2.setAuthor(aut2);
//			authorRepo.saveAll(List.of(aut1,aut2));
//
//			bookRepo.saveAll(List.of(book1,book2));
//
//			storeRepo.save(MyStore.builder().adress("Pushkina").books(List.of(book1,book2)).build());
//			storeRepo.save(MyStore.builder().adress("Lermontova").books(List.of(book1,book2)).build());
		};

	}

}
