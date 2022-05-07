package org.kitteh.example.plugin.nms.v1_13_R2;

import net.minecraft.server.v1_13_R2.IChatBaseComponent;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftPlayer;
import org.bukkit.craftbukkit.v1_13_R2.util.CraftChatMessage;
import org.bukkit.entity.Player;
import org.kitteh.example.plugin.api.NMS;

public class NMSHandler implements NMS {


    public void sendMessage(Player player, String message) {
        for(IChatBaseComponent component : CraftChatMessage.fromString(message)) {
            ((CraftPlayer)player).getHandle().sendMessage(component);
        }
    }

}
