package net.zuperz.the_bog.entity.layers;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.zuperz.the_bog.The_Bog;

public class ModModelLayers {
    public static final ModelLayerLocation DUCK_LAYER = new ModelLayerLocation(
            new ResourceLocation(The_Bog.MOD_ID, "duck_layer"), "duck_layer");

    public static final ModelLayerLocation BOGE_LAYER = new ModelLayerLocation(
            new ResourceLocation(The_Bog.MOD_ID, "boge_layer"), "boge_layer");

    public static final ModelLayerLocation SUMPGET_LAYER = new ModelLayerLocation(
            new ResourceLocation(The_Bog.MOD_ID, "sumpget_layer"), "sumpget_layer");

    public static final ModelLayerLocation WETSLIME_LAYER = new ModelLayerLocation(
            new ResourceLocation(The_Bog.MOD_ID, "wetslime_layer"), "wetslime_layer");

    public static final ModelLayerLocation WETSLIME_OUTER = new ModelLayerLocation(
            new ResourceLocation(The_Bog.MOD_ID, "wetslime"), "outer");

    public static final ModelLayerLocation MARSH_LURKER_LAYER = new ModelLayerLocation(
            new ResourceLocation(The_Bog.MOD_ID, "marsh_lurker_layer"), "marsh_lurker_layer");

    public static final ModelLayerLocation DARK_SKELETON_LAYER = new ModelLayerLocation(
            new ResourceLocation(The_Bog.MOD_ID, "dark_skeleton_layer"), "dark_skeleton_layer");

    public static final ModelLayerLocation DARK_SKELETON_INNER_ARMOR = new ModelLayerLocation(
            new ResourceLocation(The_Bog.MOD_ID, "dark_skeleton_layer"), "inner");

    public static final ModelLayerLocation DARK_SKELETON_OUTER_ARMOR = new ModelLayerLocation(
            new ResourceLocation(The_Bog.MOD_ID, "dark_skeleton_layer"), "outer");



    /* Boat */

    public static final ModelLayerLocation WEEPING_WILLOW_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(The_Bog.MOD_ID, "boat/weeping_willow"), "main");

    public static final ModelLayerLocation WEEPING_WILLOW_CHEST_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(The_Bog.MOD_ID, "chest_boat/weeping_willow"), "main");

    public static final ModelLayerLocation MIDNIGHT_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(The_Bog.MOD_ID, "boat/midnight"), "main");

    public static final ModelLayerLocation MIDNIGHT_CHEST_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(The_Bog.MOD_ID, "chest_boat/midnight"), "main");
}
