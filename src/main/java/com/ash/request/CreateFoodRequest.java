package com.ash.request;

import com.ash.model.Category;
import com.ash.model.IngredientsItem;
import lombok.Data;

import java.util.List;

@Data
public class CreateFoodRequest {
    private String name;

    private String description;

    private Long price;

    private Category category;

    private List<String> images;

    private Long restaurantId;

    public boolean isSeasonal;

    private boolean vegetarian;

    private List<IngredientsItem> ingredients;
}
