package name.zenn.tutorial.entity.client;

import name.zenn.tutorial.TutorialMod;
import name.zenn.tutorial.entity.custom.ManedWolfEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class ManedWolfModel extends GeoModel<ManedWolfEntity> {
    @Override
    public Identifier getModelResource(ManedWolfEntity manedWolfEntity) {
        return new Identifier(TutorialMod.MOD_ID, "geo/ManedWolf.geo.json");
    }

    @Override
    public Identifier getTextureResource(ManedWolfEntity manedWolfEntity) {
        return new Identifier(TutorialMod.MOD_ID, "textures/entity/manedwolf.png");
    }

    @Override
    public Identifier getAnimationResource(ManedWolfEntity manedWolfEntity) {
        return new Identifier(TutorialMod.MOD_ID, "animations/ManedWolf.animation.json");
    }

    @Override
    public void setCustomAnimations(ManedWolfEntity animatable, long instanceId, AnimationState<ManedWolfEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);

        }
    }
}

