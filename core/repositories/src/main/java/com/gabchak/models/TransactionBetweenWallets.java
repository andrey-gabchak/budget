package com.gabchak.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "transaction_between_wallets")
public class TransactionBetweenWallets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "income_sum")
    private Double incomeSum;
    @Column(name = "expenditure_sum")
    private Double expendirureSum;
    @Column(name = "commission")
    private Double commision;
    @Column(name = "comment")
    private String comment;

    @Column(name = "fk_income_wallet")
    private Wallet incomeWallet;
    @Column(name = "fk_expenditure_wallet")
    private Wallet expenditureWallet;
}
