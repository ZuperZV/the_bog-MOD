package net.zuperz.the_bog.entity.client.Marsh_Lurker;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.util.Mth;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.zuperz.the_bog.entity.animations.ModAnimationDefinitions;
import net.zuperz.the_bog.entity.custom.MarshLurkerEntity;

public class Marsh_LurkerModel<T extends MarshLurkerEntity> extends HierarchicalModel<T> {
	private final ModelPart Marsh_Lurker;
	private final ModelPart head;

	public Marsh_LurkerModel(ModelPart root) {
		this.Marsh_Lurker = root.getChild("Marsh_Lurker");
		this.head = Marsh_Lurker.getChild("body").getChild("Head2").getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Marsh_Lurker = partdefinition.addOrReplaceChild("Marsh_Lurker", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = Marsh_Lurker.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -14.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(34, 14).addBox(-4.0F, -6.0F, 4.0F, 8.0F, 11.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 22).addBox(-5.0F, -6.0F, -3.0F, 10.0F, 13.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-6.0F, -7.0F, -12.0F, 12.0F, 13.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition L_Leg = body.addOrReplaceChild("L_Leg", CubeListBuilder.create().texOffs(30, 46).addBox(-0.3333F, -0.1667F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0833F, -0.8333F, 8.5F));

		PartDefinition L_Leg2 = L_Leg.addOrReplaceChild("L_Leg2", CubeListBuilder.create().texOffs(52, 33).addBox(-2.0F, 0.25F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(58, 8).addBox(-1.5F, 5.25F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.4167F, 5.5833F, 0.0F));

		PartDefinition L_Arm = body.addOrReplaceChild("L_Arm", CubeListBuilder.create().texOffs(16, 57).addBox(-1.0F, -0.25F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.5F, 2.5F, -8.5F));

		PartDefinition L_Arm2 = L_Arm.addOrReplaceChild("L_Arm2", CubeListBuilder.create().texOffs(32, 57).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 6.75F, 0.0F));

		PartDefinition R_Arm = body.addOrReplaceChild("R_Arm", CubeListBuilder.create().texOffs(0, 57).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.5F, 2.75F, -8.5F));

		PartDefinition R_Arm2 = R_Arm.addOrReplaceChild("R_Arm2", CubeListBuilder.create().texOffs(44, 57).addBox(-1.5F, 0.25F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.25F, 0.0F));

		PartDefinition R_Leg = body.addOrReplaceChild("R_Leg", CubeListBuilder.create().texOffs(42, 0).addBox(-3.75F, -1.0F, -2.0F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 0.0F, 8.0F));

		PartDefinition R_Leg2 = R_Leg.addOrReplaceChild("R_Leg2", CubeListBuilder.create().texOffs(48, 46).addBox(-2.0F, -2.25F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(56, 57).addBox(-1.5F, 4.75F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 5.25F, 0.5F));

		PartDefinition Head2 = body.addOrReplaceChild("Head2", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -12.0F));

		PartDefinition Head = Head2.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 42).addBox(-3.9757F, -3.2558F, -7.4372F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0243F, -0.7442F, 0.4372F));

		PartDefinition head_r1 = Head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(4, 4).mirror().addBox(-0.2F, -1.75F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 4).mirror().addBox(0.0F, -2.5F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 0).mirror().addBox(-0.1F, -2.75F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(4, 4).addBox(8.08F, -1.75F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 0).addBox(8.05F, -2.75F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 4).addBox(8.0F, -2.5F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.4757F, 1.7442F, -5.4372F, 0.3491F, 0.0F, 0.0F));

		PartDefinition mouth = Head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(26, 34).addBox(-4.5F, -1.0F, -8.0F, 9.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0243F, 4.9942F, 0.0628F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(MarshLurkerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(entity, netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.WALK_MARSH_LURKER, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(entity.idleAnimationState, ModAnimationDefinitions.IDLE_MARSH_LURKER, ageInTicks, 1f);
		this.animate(entity.attackAnimationState, ModAnimationDefinitions.ATTACK_MARSH_LURKER, ageInTicks, 1f);
	}

	private void applyHeadRotation(MarshLurkerEntity pEntity, float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float) Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float) Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Marsh_Lurker.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Marsh_Lurker;
	}
}