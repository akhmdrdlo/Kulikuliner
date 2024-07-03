package com.kulikuliner.data.repository;

import com.kulikuliner.data.entity.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MakananRepository extends JpaRepository<Makanan, Long> {
    
    // List<Makanan> findMakananByNamaMakanan(String keyword);

}
