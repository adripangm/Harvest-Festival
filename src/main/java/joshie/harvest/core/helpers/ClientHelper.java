package joshie.harvest.core.helpers;

import joshie.harvest.animals.AnimalTrackerClient;
import joshie.harvest.calendar.CalendarClient;
import joshie.harvest.core.handlers.ClientHandler;
import joshie.harvest.crops.CropTrackerClient;
import joshie.harvest.player.PlayerTrackerClient;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ClientHelper {
    @SideOnly(Side.CLIENT)
    private static ClientHandler theClient;

    //Creates a new instance of client handler
    @SideOnly(Side.CLIENT)
    public static void resetClient() {
        theClient = new ClientHandler();
    }

    public static AnimalTrackerClient getAnimalTracker() {
        return theClient.getAnimalTracker();
    }

    public static CalendarClient getCalendar() {
        return theClient.getCalendar(); 
    }

    public static CropTrackerClient getCropTracker() {
        return theClient.getCropTracker();
    }

    public static PlayerTrackerClient getPlayerData() {
        return theClient.getPlayerData();
    }
}