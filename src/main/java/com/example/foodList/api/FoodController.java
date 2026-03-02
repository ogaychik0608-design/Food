package com.example.foodList.api;

import com.example.foodList.model.Food;
import com.example.foodList.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class FoodController {

    private final FoodService foodService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("foods", foodService.getAllFoods());
        model.addAttribute("newFood", new Food());
        return "index";
    }

    @PostMapping("/add")
    public String addFood(@ModelAttribute Food food) {
        foodService.saveFood(food);
        return "redirect:/";
    }

    @PostMapping("/edit")
    public String editFood(@ModelAttribute Food food) {
        foodService.saveFood(food);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String deleteFood(@RequestParam Long id) {
        foodService.deleteFood(id);
        return "redirect:/";
    }
}