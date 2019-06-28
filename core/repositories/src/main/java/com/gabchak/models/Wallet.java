package com.gabchak.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "wallet")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "balance")
    private Double balance;
    @Column(name = "is_income")
    private Boolean isIncome;
    @Column(name = "is_count_in_general_balance")
    private Boolean isCountInGeneralBalance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_currency_id")
    private Currency currency;

    @OneToMany(mappedBy = "wallet", fetch = FetchType.LAZY)
    private Set<Record> records;
}
