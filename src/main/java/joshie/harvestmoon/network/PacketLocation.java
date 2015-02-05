package joshie.harvestmoon.network;

import io.netty.buffer.ByteBuf;
import joshie.lib.helpers.ClientHelper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.simpleimpl.IMessage;

public abstract class PacketLocation implements IMessage {
    protected int dim;
    public int x;
    public int y;
    public int z;

    public PacketLocation() {}

    public PacketLocation(int dim, int x, int y, int z) {
        this.dim = dim;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(dim);
        buf.writeInt(x);
        buf.writeInt(y);
        buf.writeInt(z);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        dim = buf.readInt();
        x = buf.readInt();
        y = buf.readInt();
        z = buf.readInt();
    }
}