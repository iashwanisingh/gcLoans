package com.gctest.loanstore.service;

import com.gctest.loanstore.dao.LoanStoreDao;
import com.gctest.loanstore.entity.LoanStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanStoreServiceImpl implements LoanStoreService {

    @Autowired
    private LoanStoreDao loanStoreDao;

    public List<LoanStore> loans;

    @Override
    public List<LoanStore> getLoans() {
        return loanStoreDao.findAll();
    }

    @Override
    public LoanStore getLoanByLoanId(String loanId) {
        return loanStoreDao.findByLoanId(loanId);
    }

    @Override
    public List<LoanStore> getLoansByLanderId(String lenderId) {
        loans = this.loanStoreDao.findAll();
        List<LoanStore> getLoansByLanderId = new ArrayList<>();
        for (LoanStore loan : loans) {
            if (lenderId.equals(loan.getLenderId())) {
                getLoansByLanderId.add(loan);
            }
        }
        return getLoansByLanderId;
    }

    @Override
    public List<LoanStore> getLoansByCustomerId(String customerId) {
        loans = this.loanStoreDao.findAll();
        List<LoanStore> loansByCustomerId = new ArrayList<>();
        for (LoanStore loan : loans) {
            if (customerId.equals(loan.getCustomerId())) {
                loansByCustomerId.add(loan);
            }
        }
        return loansByCustomerId;
    }


    @Override
    public LoanStore addloan(LoanStore loan) {
        return loanStoreDao.save(loan);
    }

}
