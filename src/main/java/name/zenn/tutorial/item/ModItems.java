package name.zenn.tutorial.item;

import name.zenn.tutorial.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;

public class ModItems { // This is so the game knows what items I've added

    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    // This adds the item.

    private static void addItemsToCreativeTab(FabricItemGroupEntries entries) {
        entries.add(SAPPHIRE);
    } // This along with line 25 adds the item to the Ingredients tab of the Creative Menu

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    } // This registers items

    public static void registeredItems() {
        TutorialMod.LOGGER.info("Registering mod items for " + TutorialMod.MOD_ID); // This logs registered items

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToCreativeTab);
    }

}
