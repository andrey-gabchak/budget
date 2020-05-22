package com.gabchak.budget.dao.repository;

import com.gabchak.budget.dao.model.categories.ReceiptsCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiptsCategoryRepository
    extends JpaRepository<ReceiptsCategory, Integer> {
}
