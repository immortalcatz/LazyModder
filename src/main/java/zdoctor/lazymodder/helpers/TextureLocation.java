package zdoctor.lazymodder.helpers;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;

public class TextureLocation extends ResourceLocation {
	public static final String TEX_EXT = ".png";
	public static final String ITEM_TEX = "textures/items";
	public static final String BLOCK_TEX = "textures/blocks";
	public static final String GUI_TEX = "textures/gui";
	
	public TextureLocation(String resourcePathIn) {
		super(Loader.instance().activeModContainer().getModId(), resourcePathIn);
	}
	
	public TextureLocation(String resourceDomainIn, String resourcePathIn) {
		super(resourceDomainIn, resourcePathIn);
	}

	public static class BlockTextureLocation extends TextureLocation {
		public BlockTextureLocation(String resourcePathIn) {
			super(updateBlockPath(resourcePathIn));
		}

		public BlockTextureLocation(String resourceDomainIn, String resourcePathIn) {
			super(resourceDomainIn, updateBlockPath(resourcePathIn));
		}
	}
	
	public static class ItemTextureLocation extends TextureLocation {
		public ItemTextureLocation(String resourcePathIn) {
			super(updateItemPath(resourcePathIn));
		}

		public ItemTextureLocation(String resourceDomainIn, String resourcePathIn) {
			super(resourceDomainIn, updateItemPath(resourcePathIn));
		}
	}
	
	public static class GUITextureLocation extends TextureLocation {
		public GUITextureLocation(String resourcePathIn) {
			super(updateItemPath(resourcePathIn));
		}

		public GUITextureLocation(String resourceDomainIn, String resourcePathIn) {
			super(resourceDomainIn, updateGUIPath(resourcePathIn));
		}
	}
	
	public static String updateBlockPath(String resourcePathIn) {
		StringBuilder resPath = new StringBuilder();
		resPath.append(BLOCK_TEX).append("/").append(resourcePathIn).append(TEX_EXT);
		return resPath.toString();
	}
	
	public static String updateItemPath(String resourcePathIn) {
		StringBuilder resPath = new StringBuilder();
		resPath.append(ITEM_TEX).append("/").append(resourcePathIn).append(TEX_EXT);
		return resPath.toString();
	}
	
	public static String updateGUIPath(String resourcePathIn) {
		StringBuilder resPath = new StringBuilder();
		resPath.append(GUI_TEX).append("/").append(resourcePathIn).append(TEX_EXT);
		return resPath.toString();
	}
}
