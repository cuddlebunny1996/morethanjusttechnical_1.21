package net.cuddlebunny.morethanjusttechnical;

import net.cuddlebunny.morethanjusttechnical.item.Moditems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreThanJustTechnical implements ModInitializer {
	public static final  String MOD_ID = "more_than_just_technical";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Moditems.registerModItems();
	}
}