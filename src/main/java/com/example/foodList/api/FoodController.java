package com.example.foodList.api;

import com.example.foodList.model.Food;
import com.example.foodList.service.FoodService;
import com.example.foodList.service.ManufacturerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class FoodController {

    private final FoodService foodService;
    private final ManufacturerService manufacturerService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("foods", foodService.getAllFoods());
        model.addAttribute("manufacturers", manufacturerService.getAllManufacturers());
        model.addAttribute("newFood", new Food());
        return "index";
    }

    @GetMapping("/getFood")
    @ResponseBody
    public Food getFood(@RequestParam Long id) {
        return foodService.getFoodById(id);
    }

    @PostMapping("/save")
    public String saveFood(@ModelAttribute Food food) {
        foodService.saveFood(food);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String deleteFood(@RequestParam Long id) {
        foodService.deleteFood(id);
        return "redirect:/";
    }
}