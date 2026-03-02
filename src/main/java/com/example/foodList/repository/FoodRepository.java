package com.example.foodList.repository;

import com.example.foodList.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

    public interface FoodRepository extends JpaRepository<Food, Long> {}
