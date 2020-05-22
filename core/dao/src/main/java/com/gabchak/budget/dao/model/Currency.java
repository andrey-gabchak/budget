package com.gabchak.budget.dao.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "CURRENCY")
public class Currency extends BaseEntity {
  @Column(name = "IS_MAIN_CURRENCY")
  private boolean isMain;
  @Column(name = "EXCHANGE_RATE")
  private Double exchangeRate;
}
