package name.zenn.tutorial.entity.client;


import name.zenn.tutorial.TutorialMod;
import name.zenn.tutorial.entity.custom.ManedWolfEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ManedWolfRenderer extends GeoEntityRenderer<ManedWolfEntity> {

    public ManedWolfRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new ManedWolfModel());
    }

    @Override
    public Identifier getTextureLocation(ManedWolfEntity animatable) {
        return new Identifier(TutorialMod.MOD_ID, "textures/entity/manedwolf.png");
    }

    @Override
    public void render(ManedWolfEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}