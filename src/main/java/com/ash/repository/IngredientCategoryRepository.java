package com.ash.repository;

import com.ash.model.IngredientCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IngredientCategoryRepository extends JpaRepository<IngredientCategory, Long> {

    public List<IngredientCategory> findByRestaurantId(Long Id);
}
