package com.kieran.games.elements;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PlayerTest {
    @Test
    void constructorThrowsForInvalidName() {
        assertThat(assertThrows(NullPointerException.class, () -> new Player(null)))
                .hasMessage("Player name must be a valid string");

        assertThat(assertThrows(IllegalArgumentException.class, () -> new Player("")))
                .hasMessage("Player name must be a valid string");

        assertThat(assertThrows(IllegalArgumentException.class, () -> new Player("  ")))
                .hasMessage("Player name must be a valid string");
    }

    @Test
    void inventoryIsConstructedEmpty() {
        final Player player = new Player("Kieran");
        assertThat(player.getInventory()).isNotNull().isEmpty();
    }

    @Test
    void canAddToInventory() {
        final Player player = new Player("Kieran");
        final Item item = new Item();
        player.addToInventory(item);
        assertThat(player.getInventory()).isNotNull().isNotEmpty().containsOnly(item);
    }
}