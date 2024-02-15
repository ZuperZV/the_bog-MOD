package net.zuperz.the_bog.capability;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.capabilities.AutoRegisterCapability;

@AutoRegisterCapability
public interface PlayerPortal {
    Player getPlayer();
    void setInPortal(boolean inPortal);
    boolean isInsidePortal();

    void setPortalTimer(int timer);
    int getPortalTimer();

    float getPortalAnimTime();
    float getPrevPortalAnimTime();

    void handleUndergardenPortal();
}
