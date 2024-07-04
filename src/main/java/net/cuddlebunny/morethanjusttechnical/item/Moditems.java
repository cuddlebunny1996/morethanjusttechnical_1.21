package net.cuddlebunny.morethanjusttechnical.item;

import net.cuddlebunny.morethanjusttechnical.MoreThanJustTechnical;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class Moditems {
    public static final Item Red_Slime_Balls = registerItem("red_slime_balls", new Item(new Item.Settings()));
    public static final Item Blue_Slime_Balls = registerItem("blue_slime_balls", new Item(new Item.Settings()));

    private static  void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(Red_Slime_Balls);
        entries.add(Blue_Slime_Balls);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(MoreThanJustTechnical.MOD_ID, name), item);
    }

    public static void registerModItems(){
        MoreThanJustTechnical.LOGGER.info("Registering Mod Items for" + MoreThanJustTechnical.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Moditems::addItemsToIngredientItemGroup);
    }
}
