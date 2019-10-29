package com.kieran.games.elements;

import io.vavr.collection.List;
import org.apache.commons.lang3.Validate;

import java.util.ArrayList;

import static java.util.Objects.requireNonNull;

public final class Player {
    private final String name;
    private final java.util.List<Item> inventory;

    public Player(final String name) {
        this.name = Validate.notBlank(name, "Player name must be a valid string");
        inventory = new ArrayList<>();
    }

    public void addToInventory(final Item item) {
        inventory.add(requireNonNull(item, "item cannot be null"));
    }

    public List<Item> getInventory() {
        return List.ofAll(inventory);
    }

    public String getName() {
        return name;
    }
}
