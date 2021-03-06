package joshie.harvest.api.shops;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public interface IRequirement {
    /** Return the stack this requirement is represented by **/
    @Nonnull
    ItemStack getIcon();

    /** Return how many items this requirement needs **/
    int getCost();

    /** Can we fulfill the requirement
     * @param world     the world
     * @param player    the player
     * @param amount    the amount
     * @return if the requirement is met */
    boolean isFulfilled(World world, EntityPlayer player, int amount);

    /** Called when purchased
     *  @param player   the player **/
    void onPurchased(EntityPlayer player);
}