package zdoctor.lazymodder.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import zdoctor.lazymodder.registery.RenderRegistry;

public class ClientProxy extends CommonProxy {
	@Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        //EasyTESR.registerEasyTESR();
//        RenderRegistry.registerEntityRenderingHandlers();
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}