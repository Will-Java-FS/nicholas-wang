package com.revature.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "items")
public class Item {
    @Id //makes this a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_id",updatable = false)
    private int id;

    @Column(nullable = false,unique = true)
    private String name;

    @Column(nullable = false)
    private int quantity;

    public Item(){

    }

    public Item(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    @Override
//    public boolean equals(Object o) {
////        if (this == o) return true;
////        if (o == null || getClass() != o.getClass()) return false;
////        Actor actor = (Actor) o;
////        return getId() == actor.getId() && getAge() == actor.getAge() && getWorth() == actor.getWorth() && Objects.equals(getName(), actor.getName());
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Item item = (Item) o;
        return getId() == item.getId() && getQuantity() == item.getQuantity() && Objects.equals(
            getName(), item.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getQuantity());
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
