package com.SprintXXL.primitiveworldgen.handler;

import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.SprintXXL.primitiveworldgen.config.WorldGenConfig.DISABLE_UNDERGROUND_WATER_LAKES;

@Mod.EventBusSubscriber
public class PopulateEventHandler {

    @SubscribeEvent
    public void PopulateEvent(PopulateChunkEvent.Populate event) {

        if (event.getType() == PopulateChunkEvent.Populate.EventType.LAKE && DISABLE_UNDERGROUND_WATER_LAKES) {
            event.setResult(Event.Result.DENY);
        }
    }
}
