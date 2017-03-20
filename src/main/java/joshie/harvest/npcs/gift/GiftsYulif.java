package joshie.harvest.npcs.gift;

import joshie.harvest.api.core.Ore;
import net.minecraft.init.Items;

import static joshie.harvest.api.npc.gift.GiftCategory.*;

@SuppressWarnings("unused")
public class GiftsYulif extends Gifts {
    public GiftsYulif() {
        stackRegistry.register(Ore.of("cropWatermelon"), Quality.AWESOME);
        stackRegistry.register(Ore.of("gemQuartz"), Quality.GOOD);
        stackRegistry.register(Ore.of("cropCorn"), Quality.GOOD);
        stackRegistry.register(Ore.of("cropPineapple"), Quality.GOOD);
        stackRegistry.register(Items.CAKE, Quality.GOOD);
        categoryRegistry.put(BUILDING, Quality.GOOD);
        categoryRegistry.put(MONSTER, Quality.DISLIKE);
        categoryRegistry.put(ANIMAL, Quality.DISLIKE);
        categoryRegistry.put(FLOWER, Quality.DISLIKE);
        categoryRegistry.put(VEGETABLE, Quality.BAD);
        categoryRegistry.put(PLANT, Quality.BAD);
        stackRegistry.register(Ore.of("cropCarrot"), Quality.TERRIBLE);
        stackRegistry.register(Ore.of("cropPotato"), Quality.TERRIBLE);
        stackRegistry.register(Ore.of("cropWheat"), Quality.TERRIBLE);
    }
}