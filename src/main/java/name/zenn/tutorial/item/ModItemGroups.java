package name.zenn.tutorial.item;

import name.zenn.tutorial.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup TUTORIAL_ORES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "new_ores"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.new_ores"))
                    .icon(() -> new ItemStack(ModItems.SAPPHIRE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.SAPPHIRE);

                    }).build());
    // Now to explain what all of that means. displayName is the displayable name when hovering over the item group
    // The .icon is the icon of the group, I've selected the sapphire as the icon
    // Inside the .entries curly bracket I add the items I want to be in this group
    // Vanilla items can also be added to custom groups

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering item groups for " + TutorialMod.MOD_ID);
    }


}
