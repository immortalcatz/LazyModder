package zdoctor.lazymodder.renderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazymodder.client.model.ModelMushromoid;
import zdoctor.lazymodder.easy.entity.EasyLivingEntity.CustomRenderLiving;

public class RenderMushromid extends CustomRenderLiving {

	public RenderMushromid(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelMushromoid(), 0.2f);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("lazymodder:textures/entity/mushroomoid/normal.png");
	}

}
