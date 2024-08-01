package com.revature.services;

import com.revature.models.Item;

import java.util.List;

public interface ItemService {

    //Trivial Services
    public Item getItem(int id);
    public List<Item> getAllItems();
    public Item addItem(Item item);
    public Item updateItem(Item item);
    public Item deleteItem(int id);
}
