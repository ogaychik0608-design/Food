package com.example.foodList.service;

import com.example.foodList.model.Food;
import com.example.foodList.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService {
    private final FoodRepository foodRepository;
    public List<Food> getAllFoods() { return foodRepository.findAll(); }
    public Food getFoodById(Long id) { return foodRepository.findById(id).orElse(null); }
    public void saveFood(Food food) { foodRepository.save(food); }
    public void deleteFood(Long id) { foodRepository.deleteById(id); }
}