package name.zenn.tutorial;

import name.zenn.tutorial.entity.ModEntities;
import name.zenn.tutorial.entity.custom.ManedWolfEntity;
import name.zenn.tutorial.item.ModItemGroups;
import name.zenn.tutorial.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod"; // the mod ID can't have uppercase or spaces
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registeredItems();
		LOGGER.info("Hello Fabric world!");

		FabricDefaultAttributeRegistry.register(ModEntities.MANEDWOLF, ManedWolfEntity.setAttributes());
	}


}