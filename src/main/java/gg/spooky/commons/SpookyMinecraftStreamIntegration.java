package gg.spooky.commons;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SpookyMinecraftStreamIntegration.MODID, name = SpookyMinecraftStreamIntegration.NAME, version = SpookyMinecraftStreamIntegration.VERSION)
public class SpookyMinecraftStreamIntegration {
    public static final String MODID = "spookyminecraftstreamintegration";
    public static final String NAME = "Spooky's Minecraft Stream Integration";
    public static final String VERSION = "0.1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("Mod initlialised :" + NAME);
        MinecraftForge.EVENT_BUS.register(new BlockPlaceHandler());
    }
}