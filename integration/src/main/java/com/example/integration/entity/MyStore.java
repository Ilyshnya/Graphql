package com.example.integration.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@Entity
@Table(name = "store")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MyStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "books_store",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "store_id")
    )
    private List<Book> books;

    private String name;

    private String adress;

}
