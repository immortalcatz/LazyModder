package zdoctor.lazymodder.builtin.helpers;

import net.minecraft.client.resources.I18n;

public class TextHelper {
	public static String translateToLocal(String text, Object... params) {
		return I18n.format(text, params);
	}
}
