package dev.tr7zw.entityculling.access;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public interface EntityRendererInter<T extends Entity> {

	boolean shadowHasLabel(T entity);

	void shadowRenderLabelIfPresent(T entity, String text, MatrixStack matrices, VertexConsumerProvider vertexConsumers,
			int light);

}