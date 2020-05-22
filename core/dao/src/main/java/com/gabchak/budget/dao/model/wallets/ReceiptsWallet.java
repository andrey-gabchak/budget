package com.gabchak.budget.dao.model.wallets;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "RECEIPTS_WALLET")
public class ReceiptsWallet extends Wallet {
}
