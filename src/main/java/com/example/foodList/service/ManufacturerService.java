package com.example.foodList.service;

import com.example.foodList.model.Manufacturer;
import com.example.foodList.repository.ManufacturerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ManufacturerService {
    private final ManufacturerRepository manufacturerRepository;
    public List<Manufacturer> getAllManufacturers() { return manufacturerRepository.findAll(); }
}