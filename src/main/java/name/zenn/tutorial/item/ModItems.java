package name.zenn.tutorial.item;

import name.zenn.tutorial.TutorialMod;
import name.zenn.tutorial.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;

public class ModItems { // This is so the game knows what items I've added

    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    // This adds the item.
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    // This adds another item

    public static final Item MANED_WOLF_SPAWN_EGG = registerItem("manedwolfspawn_egg",
            new SpawnEggItem(ModEntities.MANEDWOLF, 0xA87D4F, 0xFCFAF9, new FabricItemSettings()));

    private static void addItemsToIngredientsTab(FabricItemGroupEntries entries) {
        entries.add(SAPPHIRE);
        entries.add(RUBY);
    } // This along with line 38 adds the item to the Ingredients tab of the Creative Menu

    private static void addItemsToSpawnEggsTab(FabricItemGroupEntries entries) {
        entries.add(MANED_WOLF_SPAWN_EGG);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    } // This registers items

    public static void registeredItems() {
        TutorialMod.LOGGER.info("Registering mod items for " + TutorialMod.MOD_ID); // This logs registered items

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(ModItems::addItemsToSpawnEggsTab);
    } // ModItemGroups class makes registeredItems() and addItemsToCreativeTab kinda useless

}
