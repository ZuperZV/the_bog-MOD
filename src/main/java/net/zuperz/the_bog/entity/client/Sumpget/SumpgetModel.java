package net.zuperz.the_bog.entity.client.Sumpget;// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.zuperz.the_bog.entity.animations.ModAnimationDefinitions;
import net.zuperz.the_bog.entity.custom.DuckEntity;
import net.zuperz.the_bog.entity.custom.SumpgetEntity;

public class SumpgetModel<T extends SumpgetEntity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custommodel"), "main");
	private final ModelPart boggy_goat;
	private final ModelPart head;


	public SumpgetModel(ModelPart root) {
		this.boggy_goat = root.getChild("boggy_goat");
		this.head = boggy_goat.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition boggy_goat = partdefinition.addOrReplaceChild("boggy_goat", CubeListBuilder.create(), PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition Head = boggy_goat.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(2.0513F, -5.7618F, -2.4133F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 3).addBox(-5.9487F, -5.7618F, -2.4133F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -8.8F, -9.0F, -0.1043F, 0.0005F, 0.0091F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(36, 0).addBox(-3.0F, -4.0F, -8.0F, 5.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0513F, -2.7618F, -0.4133F, 0.6109F, 0.0F, 0.0F));

		PartDefinition left_back_leg = boggy_goat.addOrReplaceChild("left_back_leg", CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, 2.0F, -2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -2.0F, 7.0F));

		PartDefinition body = boggy_goat.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.0F, -7.0F, 9.0F, 11.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(0, 29).addBox(-5.0F, -8.0F, -10.0F, 11.0F, 13.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -9.0F, -5.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 9).addBox(-7.0F, -10.0F, -5.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(27, 0).addBox(-9.0F, -11.0F, -5.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.0F, -5.0F, 3.1416F, 0.0F, 2.0071F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(24, 29).addBox(-5.0F, -9.0F, -4.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(30, 29).addBox(-7.0F, -10.0F, -4.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(36, 29).addBox(-9.0F, -11.0F, -4.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, -5.0F, 0.0F, 0.0F, 1.1345F));

		PartDefinition left_front_leg = boggy_goat.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(44, 38).addBox(0.0F, 0.0F, -2.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -4.0F, -6.0F));

		PartDefinition right_front_leg = boggy_goat.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(41, 51).addBox(0.0F, 0.0F, -2.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -4.0F, -6.0F));

		PartDefinition right_back_leg = boggy_goat.addOrReplaceChild("right_back_leg", CubeListBuilder.create().texOffs(51, 26).addBox(-2.0F, 2.0F, -2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -2.0F, 7.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}
	@Override
	public void setupAnim(SumpgetEntity entity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(entity, pNetHeadYaw, pHeadPitch, pAgeInTicks);

		this.animateWalk(ModAnimationDefinitions.SUMPGET_WALK, pLimbSwing, pLimbSwingAmount, 2f, 2.5f);
		this.animate(entity.idleAnimationState, ModAnimationDefinitions.SUMPGET_IDLE, pAgeInTicks, 1f);
		this.animate(entity.sitAnimationState, ModAnimationDefinitions.SUMPGET_SIT, pAgeInTicks, 1f);
	}

	private void applyHeadRotation(SumpgetEntity entity, float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float) Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float) Math.PI / 180F);
	}
	@Override
	public ModelPart root() {
		return boggy_goat;
	}
}