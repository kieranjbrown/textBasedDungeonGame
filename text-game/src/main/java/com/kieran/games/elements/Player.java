package com.kieran.games.elements;

import io.vavr.collection.List;
import org.apache.commons.lang3.Validate;

public final class Player {
    private final String name;
    private final List<Item> inventory;

    public Player(final String name) {
        this.name = Validate.notBlank(name, "Player name must be a valid string");
        inventory = List.of();
    }

    public void addToInventory(final Item item) {
        inventory.append(item);
    }

    public List<Item> getInventory() {
        return List.ofAll(inventory);
    }

    public String getName() {
        return name;
    }
}
