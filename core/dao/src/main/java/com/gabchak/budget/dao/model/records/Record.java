package com.gabchak.budget.dao.model.records;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
abstract class Record {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "TYPE")
  private String type;
  @Column(name = "SUM")
  private Double sum;
  @Column(name = "DESCRIPTION")
  private String description;
  @Column(name = "CREATION_DATE")
  private LocalDateTime creationDate;
}
