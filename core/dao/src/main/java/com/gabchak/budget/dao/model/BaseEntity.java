package com.gabchak.budget.dao.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "name")
  private String name;
}
