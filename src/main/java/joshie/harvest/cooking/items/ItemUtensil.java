package joshie.harvest.cooking.items;

import joshie.harvest.cooking.items.ItemUtensil.Utensil;
import joshie.harvest.core.util.base.ItemHFEnum;
import net.minecraft.util.IStringSerializable;

public class ItemUtensil extends ItemHFEnum<ItemUtensil, Utensil> {
    public enum Utensil implements IStringSerializable {
        BLADE;

        @Override
        public String getName() {
            return name().toLowerCase();
        }
    }

    public ItemUtensil() {
        super(Utensil.class);
    }
}