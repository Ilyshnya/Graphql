package com.example.integration.repository;




import com.example.integration.entity.MyStore;


import org.springframework.data.jpa.repository.JpaRepository;


public interface MyStoreRepo extends JpaRepository<MyStore,Long> {
}
