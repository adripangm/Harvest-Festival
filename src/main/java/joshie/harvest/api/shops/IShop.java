package joshie.harvest.api.shops;

import joshie.harvest.api.calendar.Weekday;
import joshie.harvest.api.core.ISpecialRules;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public interface IShop {
    /** Hours, auto adjusts based on difficulty instead of manually adding
     *  @param day the day of the week
     *  @param opening the opening time (0-24000)
     *  @param closing the closing time (0-24000)**/
    default IShop addOpening(Weekday day, int opening, int closing) { return addConditionalOpening(null, day, opening, closing); }

    /** Same as a above but with an attached condition for open
     *  @param conditions the conditions
     *  @param day the day of the week
     *  @param opening the opening time (0-24000)
     *  @param closing the closing time (0-24000)**/
    IShop addConditionalOpening(@Nullable ISpecialRules conditions, Weekday day, int opening, int closing);

    /** Adds a new purchaseable item to the shop
     * @param purchasable  the purchaseable **/
    IPurchasable addPurchasable(IPurchasable purchasable);

    /** Convenience method for basic items
     *  @param      cost how much this costs in gold
     *  @param      stack the item you get for this purchase**/
    IPurchasable addPurchasable(long cost, ItemStack stack);

    /** Set special rules for being able to buy from this shop
     *  By default all shops are accessible at all times
     *  @param rules the rules you want to set **/
    IShop setSpecialPurchaseRules(ISpecialRules rules);

    /** Set special rules for being able to sell to this shop
     *  By default all shops are accessible at all times
     *  @param rules the rules you want to set **/
    IShop setSpecialSellingRules(ISpecialRules rules);

    @Deprecated //TODO: Remove in 0.7+
    IShop addItem(IPurchasable item);

    @Deprecated //TODO: Remove in 0.7+
    IShop addItem(long cost, ItemStack... stack);


}