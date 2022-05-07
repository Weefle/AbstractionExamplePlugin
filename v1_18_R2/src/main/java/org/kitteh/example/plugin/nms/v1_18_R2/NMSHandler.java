package org.kitteh.example.plugin.nms.v1_18_R2;

import org.bukkit.craftbukkit.v1_18_R2.entity.CraftPlayer;
import org.bukkit.craftbukkit.v1_18_R2.util.CraftChatMessage;
import org.bukkit.entity.Player;
import org.kitteh.example.plugin.api.NMS;

import java.util.UUID;

public class NMSHandler implements NMS {


    public void sendMessage(Player player, String message) {
            ((CraftPlayer)player).getHandle().sendMessage(UUID.randomUUID(), CraftChatMessage.fromString(message));
    }

}
