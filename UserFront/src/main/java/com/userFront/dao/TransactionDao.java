package com.userFront.dao;

import com.userFront.domain.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionDao extends CrudRepository<Transaction, Long> {
}
