package com.revature.controllers;

import com.revature.models.Item;
import com.revature.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
@CrossOrigin
public class ItemController {

    ItemService itemService;

    @Autowired //Constructor Injection
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public Item getItem (@PathVariable int id){
        return itemService.getItem(id);
    }

    @PostMapping(consumes = "application/json",produces ="application/json")
    public ResponseEntity<Item> addItem(@RequestBody Item item){
        item = itemService.addItem(item);
        return new ResponseEntity<>(item, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Item> updateItem(@PathVariable int id, @RequestBody Item item){
        item.setId(id); //Make sure that the ID used was the one in the Path Parameter

        //Check if that ID matches an existing Actor.
        Item item2 = itemService.getItem(id);
        if(item2.getId() == id){
            item = itemService.updateItem(item);
            return new ResponseEntity<>(item,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}