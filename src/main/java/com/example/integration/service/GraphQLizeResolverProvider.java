package com.example.integration.service;

import graphql.servlet.internal.GraphQLRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

//@Component
//public class GraphQLizeResolverProvider {
//    private final DataSource dataSource;
//    private final GraphQLizeResolver graphQLizeResolver;
//
//    public GraphQLizeResolverProvider(DataSource dataSource) {
//        this.dataSource = dataSource;
//        graphQLizeResolver = new GraphQLizeResolver(dataSource);
//    }
//
//
//    @Bean
//    public GraphQLizeResolver graphQLizeResolver() {
//        return this.graphQLizeResolver;
//    }
//}