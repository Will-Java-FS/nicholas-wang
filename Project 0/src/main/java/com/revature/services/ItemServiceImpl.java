package com.revature.services;

import com.revature.models.Item;
import com.revature.repositories.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepo itemRepo;

    @Override
    public Item getItem(int id) {
        return itemRepo.findById(id).orElseGet(Item::new);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepo.findAll();
    }

    @Override
    public Item addItem(Item item){
        return itemRepo.save(item);
    }

    @Override
    public Item updateItem(Item change){
        return itemRepo.save(change);
    }

    @Override
    public Item deleteItem(int id) {
        Item item = getItem(id);
        itemRepo.deleteById(id);
        return item;
    }
}