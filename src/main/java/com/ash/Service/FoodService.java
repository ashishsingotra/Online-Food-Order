package com.ash.Service;

import com.ash.model.Category;
import com.ash.model.Food;
import com.ash.model.Restaurant;
import com.ash.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {

    public Food createFood(CreateFoodRequest req , Category category , Restaurant restaurant);

    public void deleteFood(Long foodId) throws Exception;

    public List<Food> getRestaurantsFood(Long restaurantId,boolean isVegetarian ,boolean isNonveg , boolean isSeasonal,String foodCategory) throws Exception;

    public List<Food> searchFood(String keyword);

    public Food findFoodById(Long id)throws Exception;

    public Food updateAvailabilityStatus(Long foodId)throws Exception;
}
