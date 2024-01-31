package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.EbazaarReportsData;

public interface EbazaarReportsDataRepo extends JpaRepository<EbazaarReportsData,Integer> {
}
