package com.SprintXXL.primitiveworldgen.handler;

import com.SprintXXL.primitiveworldgen.worldgen.generator.EmptyGenerator;
import com.SprintXXL.primitiveworldgen.worldgen.generator.EmptyMineshaftGenerator;
import net.minecraftforge.event.terraingen.InitMapGenEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.SprintXXL.primitiveworldgen.config.WorldGenConfig.*;

@Mod.EventBusSubscriber
public class MapGenEventHandler {

    @SubscribeEvent
    public void onInitMapGen(InitMapGenEvent event) {

        if (event.getType() == InitMapGenEvent.EventType.CAVE && DISABLE_CAVES) {
            event.setNewGen(new EmptyGenerator());
        }

        if (event.getType() == InitMapGenEvent.EventType.RAVINE && DISABLE_RAVINES) {
            event.setNewGen(new EmptyGenerator());
        }

        if (event.getType() == InitMapGenEvent.EventType.MINESHAFT && DISABLE_MINESHAFTS) {
            event.setNewGen(new EmptyMineshaftGenerator());
        }
    }
}