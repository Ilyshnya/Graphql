package com.example.integration.entity;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal price;

    private String name;

    @ManyToOne
    private Author author;

    @ManyToMany(mappedBy = "books",fetch = FetchType.EAGER)
    private List<MyStore> stores;


}
