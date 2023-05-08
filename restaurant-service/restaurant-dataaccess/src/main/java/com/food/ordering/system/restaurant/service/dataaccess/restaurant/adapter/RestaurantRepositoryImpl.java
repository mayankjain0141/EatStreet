package com.food.ordering.system.restaurant.service.dataaccess.restaurant.adapter;

import com.food.ordering.system.restaurant.service.domain.entity.Restaurant;
import com.food.ordering.system.restaurant.service.domain.ports.output.repository.RestaurantRepository;

import java.util.Optional;

public class RestaurantRepositoryImpl implements RestaurantRepository {
    @Override
    public Optional<Restaurant> findRestaurantInformation(Restaurant restaurant) {
        return Optional.empty();
    }
}
