package com.SprintXXL.primitiveworldgen;

import com.SprintXXL.primitiveworldgen.handler.MapGenEventHandler;
import com.SprintXXL.primitiveworldgen.handler.OreGenEventHandler;
import com.SprintXXL.primitiveworldgen.handler.PopulateEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = PrimitiveWorldGen.MODID, name = PrimitiveWorldGen.NAME, version = PrimitiveWorldGen.VERSION)
public class PrimitiveWorldGen
{
    public static final String MODID = "primitiveworldgen";
    public static final String NAME = "Primitive WorldGen";
    public static final String VERSION = "0.3.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        MinecraftForge.TERRAIN_GEN_BUS.register(new MapGenEventHandler());
        MinecraftForge.ORE_GEN_BUS.register(new OreGenEventHandler());
        MinecraftForge.TERRAIN_GEN_BUS.register(new PopulateEventHandler());
    }
}