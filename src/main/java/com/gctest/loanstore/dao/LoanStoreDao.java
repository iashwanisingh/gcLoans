package com.gctest.loanstore.dao;

import com.gctest.loanstore.entity.LoanStore;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LoanStoreDao extends JpaRepository<LoanStore, String> {
    LoanStore findByLoanId(String loanId);

}
