package com.gabchak.budget.dao.repository;

import com.gabchak.budget.dao.model.categories.ExpenditureCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenditureCategoryRepository
    extends JpaRepository<ExpenditureCategory, Integer> {
}
