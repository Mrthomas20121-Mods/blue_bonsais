package mrthomas20121.blue_bonsais;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = BlueBonsais.MODID, name = BlueBonsais.NAME, version = BlueBonsais.VERSION,
        dependencies = "required-after:forge@[14.23.5.2847,);")
public class BlueBonsais {
    public static final String MODID = "blue_bonsais";
    public static final String NAME = "Blue Bonsais";
    public static final String VERSION = "1.0.0";

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(this);
        logger = event.getModLog();
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
