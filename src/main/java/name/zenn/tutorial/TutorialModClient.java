package name.zenn.tutorial;

import name.zenn.tutorial.entity.ModEntities;
import name.zenn.tutorial.entity.client.ManedWolfRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;


public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.MANEDWOLF, ManedWolfRenderer::new);
    }
}
