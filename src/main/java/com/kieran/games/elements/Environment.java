package com.kieran.games.elements;

import io.vavr.collection.List;
import io.vavr.control.Option;

public interface Environment {
    List<Environment> getAdjacentRooms();

    Option<Item> getItem();

    Option<Environment> getAdjacentRoom(Room room);

    boolean visited();

    void markAsVisited();
}
