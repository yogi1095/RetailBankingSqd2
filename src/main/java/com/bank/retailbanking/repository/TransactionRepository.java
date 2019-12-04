package com.bank.retailbanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.retailbanking.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

}
