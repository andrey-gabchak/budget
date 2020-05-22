package com.gabchak.budget.dao.repository;

import com.gabchak.budget.dao.model.records.ExpenditureRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenditureRecordRepository
    extends JpaRepository<ExpenditureRecord, Integer> {
}
