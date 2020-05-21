package com.gabchak.budget.dao.repository;

import com.gabchak.budget.dao.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Integer, Record> {
}
