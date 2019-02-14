package com.github.atomicblom.elusivepickle;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = ElusivePickleMod.MODID,
        name = ElusivePickleMod.NAME,
        acceptedMinecraftVersions = "[1.12.2]",
        version = ElusivePickleMod.VERSION
)
public class ElusivePickleMod
{
    public static final String MODID = "elusivepickle";
    public static final String NAME = "That Elusive Pickle";
    public static final String VERSION = "@VERSION@";

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
}
