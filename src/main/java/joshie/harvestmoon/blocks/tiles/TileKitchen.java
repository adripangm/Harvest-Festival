package joshie.harvestmoon.blocks.tiles;

import joshie.harvestmoon.cooking.Utensil;

public class TileKitchen extends TileCooking {
    @Override
    public Utensil getUtensil() {
        return Utensil.KITCHEN;
    }
}
