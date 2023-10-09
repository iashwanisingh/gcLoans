package com.gctest.loanstore.service;

import com.gctest.loanstore.entity.LoanStore;

import java.util.List;

public interface LoanStoreService {
    public List<LoanStore> getLoans();

    public LoanStore getLoanByLoanId(String loanId);

    public List<LoanStore> getLoansByLanderId(String lenderId);

    public List<LoanStore> getLoansByCustomerId(String customerId);

    public LoanStore addloan(LoanStore loan);

}
