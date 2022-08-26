package com.project.onlinebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.onlinebanking.domain.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {



}
