package com.gabchak.budget.dao.model.wallets;

import com.gabchak.budget.dao.model.BaseEntity;
import com.gabchak.budget.dao.model.Currency;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
abstract class Wallet extends BaseEntity {
  @Column(name = "CURRENCY")
  private Currency currency;
  @Column(name = "DESCRIPTION")
  private String description;
}
