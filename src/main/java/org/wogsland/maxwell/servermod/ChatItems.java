package org.wogsland.maxwell.servermod;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatItems {

	@SubscribeEvent
	public void giveItems(ServerChatEvent event){
		if (event.message.contains("potato")) {
			event.player.inventory.addItemStackToInventory(new ItemStack(Items.potato, 1));
		}
	}
}
