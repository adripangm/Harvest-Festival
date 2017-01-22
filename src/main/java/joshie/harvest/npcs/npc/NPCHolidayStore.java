package joshie.harvest.npcs.npc;

import joshie.harvest.api.HFApi;
import joshie.harvest.api.calendar.CalendarDate;
import joshie.harvest.api.calendar.Holiday;
import joshie.harvest.api.npc.INPCHelper.Age;
import joshie.harvest.api.npc.INPCHelper.Gender;
import joshie.harvest.api.npc.NPC;
import joshie.harvest.api.shops.Shop;
import joshie.harvest.calendar.HolidayRegistry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class NPCHolidayStore extends NPC {
    private Shop shop;
    private Holiday festival;
    public NPCHolidayStore(ResourceLocation resource, Gender gender, Age age, CalendarDate birthday, int insideColor, int outsideColor) {
        super(resource, gender, age, birthday, insideColor, outsideColor);
    }

    @Override
    public Shop getShop(World world, BlockPos pos) {
        Holiday holiday = HolidayRegistry.INSTANCE.getHoliday(world, pos, HFApi.calendar.getDate(world));
        if (holiday.equals(festival)) return shop;
        else return super.getShop(world, pos);
    }

    public NPCHolidayStore setHolidayShop(Holiday festival, Shop shop) {
        this.festival = festival;
        this.shop = shop;
        return this;
    }
}
