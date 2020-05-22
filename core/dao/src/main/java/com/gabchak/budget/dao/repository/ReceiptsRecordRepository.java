package com.gabchak.budget.dao.repository;

import com.gabchak.budget.dao.model.records.ReceiptsRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiptsRecordRepository
    extends JpaRepository<ReceiptsRecord, Integer> {
}
