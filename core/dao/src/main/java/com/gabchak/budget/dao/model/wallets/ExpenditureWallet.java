package com.gabchak.budget.dao.model.wallets;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "EXPENDITURE_WALLET")
public class ExpenditureWallet extends Wallet {
}
