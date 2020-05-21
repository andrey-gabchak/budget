package com.gabchak.budget.dao.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "RECORD")
public class Record {
  @Id
  private Integer id;
  @Column(name = "TYPE")
  private String type;
  @Column(name = "SUM")
  private Double sum;
}
