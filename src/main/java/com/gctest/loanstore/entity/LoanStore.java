package com.gctest.loanstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class LoanStore {
    @Id
    private String loanId;
    private String customerId;

    private String lenderId;
    private double amount;
    private double remainingAmount;
    private Date paymentDate;
    private int interestPerDay;
    private Date dueDate;
    private double penaltyPerDay;
    private String canceled;

    public LoanStore() {
    }

    public LoanStore(String loanId, String customerId, String lenderId, double amount, double remainingAmount, Date paymentDate, int interestPerDay, Date dueDate, double penaltyPerDay, String canceled) {
        this.loanId = loanId;
        this.customerId = customerId;
        this.lenderId = lenderId;
        this.amount = amount;
        this.remainingAmount = remainingAmount;
        this.paymentDate = paymentDate;
        this.interestPerDay = interestPerDay;
        this.dueDate = dueDate;
        this.penaltyPerDay = penaltyPerDay;
        this.canceled = canceled;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getLenderId() {
        return lenderId;
    }

    public void setLenderId(String lenderId) {
        this.lenderId = lenderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getInterestPerDay() {
        return interestPerDay;
    }

    public void setInterestPerDay(int interestPerDay) {
        this.interestPerDay = interestPerDay;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double getPenaltyPerDay() {
        return penaltyPerDay;
    }

    public void setPenaltyPerDay(double penaltyPerDay) {
        this.penaltyPerDay = penaltyPerDay;
    }

    public String isCanceled() {
        return canceled;
    }

    public void setCanceled(String canceled) {
        this.canceled = canceled;
    }

    @Override
    public String toString() {
        return "LoanStore{" +
                "loanId='" + loanId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", lenderId='" + lenderId + '\'' +
                ", amount=" + amount +
                ", remainingAmount=" + remainingAmount +
                ", paymentDate=" + paymentDate +
                ", interestPerDay=" + interestPerDay +
                ", dueDate=" + dueDate +
                ", penaltyPerDay=" + penaltyPerDay +
                ", canceled=" + canceled +
                '}';
    }
}
