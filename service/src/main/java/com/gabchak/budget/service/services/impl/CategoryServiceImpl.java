package com.gabchak.budget.service.services.impl;

import com.gabchak.budget.dao.model.Category;
import com.gabchak.budget.dao.repository.CategoryRepository;
import com.gabchak.budget.service.dto.CategoryDto;
import com.gabchak.budget.service.mappers.CategoryMapper;
import com.gabchak.budget.service.services.CategoryService;
import lombok.RequiredArgsConstructor;

import java.util.Collection;
import java.util.Optional;

@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

  private final CategoryRepository repository;
  private final CategoryMapper mapper;

  @Override
  public CategoryDto save(CategoryDto categoryDto) {
    Category category = mapper.map(categoryDto, Category.class);
    return null;
  }

  @Override
  public Optional<CategoryDto> findById(Integer id) {
    return Optional.empty();
  }

  @Override
  public void deleteById(Integer id) {

  }

  @Override
  public Collection<CategoryDto> findAll() {
    return null;
  }
}
