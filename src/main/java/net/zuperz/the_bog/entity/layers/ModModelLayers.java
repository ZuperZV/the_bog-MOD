package net.zuperz.the_bog.entity.layers;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.zuperz.the_bog.The_Bog;

public class ModModelLayers {
    public static final ModelLayerLocation DUCK_LAYER = new ModelLayerLocation(
            new ResourceLocation(The_Bog.MOD_ID, "duck_layer"), "duck_layer");

    public static final ModelLayerLocation SUMPGET_LAYER = new ModelLayerLocation(
            new ResourceLocation(The_Bog.MOD_ID, "sumpget_layer"), "sumpget_layer");

    public static final ModelLayerLocation WEEPING_WILLOW_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(The_Bog.MOD_ID, "boat/weeping_willow"), "main");

    public static final ModelLayerLocation WEEPING_CHEST_WILLOW_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(The_Bog.MOD_ID, "chest_boat/weeping_willow"), "main");
}
