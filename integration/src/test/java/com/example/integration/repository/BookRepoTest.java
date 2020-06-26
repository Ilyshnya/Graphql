package com.example.integration.repository;


import com.example.integration.entity.Book;
import com.example.integration.initializer.IntegrationTestBase;
import com.example.integration.service.BookQueries;
import com.oembedler.moon.graphql.boot.GraphQLWebAutoConfiguration;
import lombok.RequiredArgsConstructor;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@EnableAutoConfiguration(exclude= GraphQLWebAutoConfiguration.class)
class BookRepoTest extends IntegrationTestBase  {


    //@MockBean
    //BookQueries bookQueries;

    @Autowired
    private BookRepo bookRepo;

    @Test
    public void testRepo(){
        //bookRepo.findAll()
        assertEquals(1,bookRepo.findAll().size());
        assertEquals("Book1",bookRepo.findAll().get(0).getName());
        assertEquals(1,1);
    }
}