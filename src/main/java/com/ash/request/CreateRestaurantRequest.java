package com.ash.request;

import com.ash.model.Address;
import com.ash.model.ContactInformation;
import lombok.Data;

import java.util.List;

@Data
public class CreateRestaurantRequest {

    private Long id;

    private String name;

    private String description;

    private Address address;

    private String cuisineType;

    private ContactInformation contactInformation;

    private String openingHours;

    private List<String> images;
}
