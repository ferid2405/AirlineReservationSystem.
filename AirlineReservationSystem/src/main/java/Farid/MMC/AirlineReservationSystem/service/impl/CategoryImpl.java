package Farid.MMC.AirlineReservationSystem.service.impl;

import Farid.MMC.AirlineReservationSystem.entity.Category;
import Farid.MMC.AirlineReservationSystem.repository.CategoryRepository;
import Farid.MMC.AirlineReservationSystem.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class CategoryImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
