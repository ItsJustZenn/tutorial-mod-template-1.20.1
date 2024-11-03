package name.zenn.tutorial.entity;

import name.zenn.tutorial.TutorialMod;
import name.zenn.tutorial.entity.custom.ManedWolfEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<ManedWolfEntity> MANEDWOLF = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(TutorialMod.MOD_ID, "maned_wolf"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ManedWolfEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.8f)).build());
}
