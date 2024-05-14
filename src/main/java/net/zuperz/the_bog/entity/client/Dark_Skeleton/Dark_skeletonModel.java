package net.zuperz.the_bog.entity.client.Dark_Skeleton;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import net.zuperz.the_bog.entity.animations.ModAnimationDefinitions;
import net.zuperz.the_bog.entity.custom.DarkskeletonEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class Dark_skeletonModel<T extends DarkskeletonEntity> extends HierarchicalModel<T> {

	private final ModelPart dark_skeleton;
	private final ModelPart Head2;

	public Dark_skeletonModel(ModelPart root) {
		this.dark_skeleton = root.getChild("dark_skeleton");
		this.Head2 = dark_skeleton.getChild("Head2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition dark_skeleton = partdefinition.addOrReplaceChild("dark_skeleton", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = dark_skeleton.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(32, 19).addBox(-1.0F, 0.0F, -1.1F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.1F, -0.0436F, 0.0F, 0.0873F));

		PartDefinition right_leg2 = right_leg.addOrReplaceChild("right_leg2", CubeListBuilder.create().texOffs(32, 29).addBox(-1.0F, 0.0F, -1.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.0436F, 0.0F, -0.0436F));

		PartDefinition left_leg = dark_skeleton.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, 0.0F, -1.1F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -12.0F, 0.1F, 0.0873F, 0.0F, -0.0436F));

		PartDefinition left_leg2 = left_leg.addOrReplaceChild("left_leg2", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, 0.0F, -1.1F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, -0.0872F, 0.0038F, 0.0435F));

		PartDefinition right_arm = dark_skeleton.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -22.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_arm2 = right_arm.addOrReplaceChild("right_arm2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.05F, -0.2F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, -0.1731F, -0.0227F, -0.1289F));

		PartDefinition dark_sword = right_arm2.addOrReplaceChild("dark_sword", CubeListBuilder.create().texOffs(0, 60).addBox(-7.8F, -8.1333F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 58).addBox(-4.8F, -7.1333F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 58).addBox(-3.8F, -6.1333F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 58).addBox(-2.8F, -5.1333F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 62).addBox(-6.8F, -5.1333F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 57).addBox(-1.8F, -4.1333F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 60).addBox(-5.8F, -4.1333F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 57).addBox(-0.8F, -3.1333F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 58).addBox(0.2F, -2.1333F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 57).addBox(2.2F, -1.1333F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 58).addBox(3.2F, 1.8667F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 58).addBox(5.2F, 2.8667F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 58).addBox(1.2F, 2.8667F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 55).addBox(7.2F, 3.8667F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 58).addBox(4.2F, 6.8667F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1966F, 4.9185F, -4.5515F, 1.5708F, -1.1345F, -1.5708F));

		PartDefinition left_arm = dark_skeleton.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(30, 35).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -22.5F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_arm2 = left_arm.addOrReplaceChild("left_arm2", CubeListBuilder.create().texOffs(24, 26).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, -0.0873F, 0.0F, 0.0436F));

		PartDefinition body = dark_skeleton.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 26).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Head2 = dark_skeleton.addOrReplaceChild("Head2", CubeListBuilder.create(), PartPose.offset(0.0F, -25.0F, -1.0F));

		PartDefinition head = Head2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head3 = head.addOrReplaceChild("Head3", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 2.0F));

		PartDefinition head_r1 = Head3.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 15).addBox(-4.0F, -1.5F, -4.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -2.0F, 0.1745F, -0.0038F, -0.0438F));

		PartDefinition crown = head.addOrReplaceChild("crown", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = crown.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, 1).addBox(-3.25F, -12.5F, -3.5F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0735F, -0.0421F, -0.1293F));

		PartDefinition headwear = Head2.addOrReplaceChild("headwear", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(DarkskeletonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(entity, netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.DARK_SKELETON_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(entity.idleAnimationState, ModAnimationDefinitions.DARK_SKELETON_IDLE, ageInTicks, 1f);

		this.animate(entity.attackAnimationState, ModAnimationDefinitions.DARK_SKELETON_ATTACK, ageInTicks, 1f);
	}

	private void applyHeadRotation(DarkskeletonEntity pEntity, float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.Head2.yRot = pNetHeadYaw * ((float) Math.PI / 180F);
		this.Head2.xRot = pHeadPitch * ((float) Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		dark_skeleton.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return dark_skeleton;
	}
}