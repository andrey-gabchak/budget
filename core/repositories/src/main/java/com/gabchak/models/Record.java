package com.gabchak.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "record")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "sum")
    private Double sum;
    @Column(name = "is_income")
    private Boolean isIncome;
    @Column(name = "date")
    private LocalDateTime dateTime;
    @Column(name = "comment")
    private String comment;
    @Column(name = "fk_wallet_id")
    private Wallet wallet;
    @Column(name = "fk_category_id")
    private Category category;
}
