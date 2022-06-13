package model;

import entity.Food;

import java.util.List;

public interface FoodModel {
    boolean save(Food food);
    boolean update(int id, Food updateFood);
    boolean delete(int id);
    List<Food> findAll();
    Food findById(int id);
}
