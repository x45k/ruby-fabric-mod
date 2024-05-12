package net.x45k.thisisautoreplymod;

import net.fabricmc.api.ModInitializer;
import net.x45k.thisisautoreplymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Autoreply implements ModInitializer {
	public static final String MOD_ID = "thisisautoreplymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}