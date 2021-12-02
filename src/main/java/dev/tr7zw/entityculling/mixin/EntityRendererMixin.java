package dev.tr7zw.entityculling.mixin;

import dev.tr7zw.entityculling.access.EntityRendererInter;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(EntityRenderer.class)
public abstract class EntityRendererMixin<T extends Entity> implements EntityRendererInter<T> {

	@Override
	public boolean shadowHasLabel(T entity) {
		return hasLabel(entity);
	}
	
	@Override
	public void shadowRenderLabelIfPresent(T entity, String text, MatrixStack matrices,
										   VertexConsumerProvider vertexConsumers, int light) {
		renderLabelIfPresent(entity, text, matrices, vertexConsumers, light);
	}
	
	@Shadow
	public abstract boolean hasLabel(T entity);
	
	@Shadow
	public abstract void renderLabelIfPresent(T entity, String string, MatrixStack matrices, VertexConsumerProvider vertexConsumerProvider, int i);
}
