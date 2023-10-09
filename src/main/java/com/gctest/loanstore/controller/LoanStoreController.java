package com.gctest.loanstore.controller;

import com.gctest.loanstore.dao.LoanStoreDao;
import com.gctest.loanstore.entity.LoanStore;
import com.gctest.loanstore.service.LoanStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LoanStoreController {

    @Autowired
    private LoanStoreService loanStoreService;

    @Autowired
    private LoanStoreDao loanStoreDao;

    public LoanStoreController(LoanStoreService loanStoreService) {
        this.loanStoreService = loanStoreService;
    }

    @GetMapping("/loans")
    public ResponseEntity<List<LoanStore>> getLoans() {
        List<LoanStore> loans = this.loanStoreService.getLoans();
        if (loans.isEmpty()) {
            return ResponseEntity.status(HttpStatusCode.valueOf(404)).build();
        }
        return ResponseEntity.of(Optional.of(loans));
    }


    //add loans
    @PostMapping("/loans/add")
    public ResponseEntity<LoanStore> addloan(@RequestBody LoanStore loan) {
        return ResponseEntity.of(Optional.of(this.loanStoreService.addloan(loan)));
    }

    //Get by loanId
    @GetMapping("/loans/{loanId}")
    public ResponseEntity<LoanStore> getLoanByLoanId(@PathVariable("loanId") String loanId) {
        try {
            return ResponseEntity.of(Optional.of(this.loanStoreService.getLoanByLoanId(loanId)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    //Get by customerId
    @GetMapping("/loans/customer/{customerId}")
    public ResponseEntity<List<LoanStore>> getLoansByCustomerId(@PathVariable("customerId") String customerId) {
        List<LoanStore> loans = this.loanStoreService.getLoansByCustomerId(customerId);
        if (loans.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(loans));


    }

    //Get by landerId
    @GetMapping("/loans/lender/{lenderId}")
    public ResponseEntity<List<LoanStore>> getLoansByLanderId(@PathVariable("lenderId") String lenderId) {
        List<LoanStore> loans = this.loanStoreService.getLoansByLanderId(lenderId);
        if (loans.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(loans));
    }


}
