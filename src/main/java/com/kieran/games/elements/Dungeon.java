package com.kieran.games.elements;

import io.vavr.collection.List;
import io.vavr.control.Option;

public class Dungeon implements Environment {

    public Dungeon(final String name,
                   final Item item,
                   final List<Environment> adjacentRooms) {

    }

    public List<Environment> getAdjacentRooms() {
        return null;
    }

    public Option<Item> getItem() {
        return null;
    }

    public Option<Environment> getAdjacentRoom(Room room) {
        return null;
    }

    public boolean visited() {
        return false;
    }

    public void markAsVisited() {

    }
}
