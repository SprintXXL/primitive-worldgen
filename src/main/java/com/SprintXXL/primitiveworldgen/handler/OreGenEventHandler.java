package com.SprintXXL.primitiveworldgen.handler;

import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.SprintXXL.primitiveworldgen.config.WorldGenConfig.DISABLE_UNDERGROUND_DIRT;
import static com.SprintXXL.primitiveworldgen.config.WorldGenConfig.DISABLE_UNDERGROUND_GRAVEL;

@Mod.EventBusSubscriber
public class OreGenEventHandler {

    @SubscribeEvent
    public void OreGenEvent(OreGenEvent.GenerateMinable event) {

        if (event.getType() == OreGenEvent.GenerateMinable.EventType.DIRT && DISABLE_UNDERGROUND_DIRT) {
            event.setResult(Event.Result.DENY);
        }
        if (event.getType() == OreGenEvent.GenerateMinable.EventType.GRAVEL && DISABLE_UNDERGROUND_GRAVEL) {
            event.setResult(Event.Result.DENY);
        }
        if (event.getType() == OreGenEvent.GenerateMinable.EventType.EMERALD) {
            event.setResult(Event.Result.DENY);
        }
        if (event.getType() == OreGenEvent.GenerateMinable.EventType.IRON) {
            event.setResult(Event.Result.DENY);
        }
        if (event.getType() == OreGenEvent.GenerateMinable.EventType.GOLD) {
            event.setResult(Event.Result.DENY);
        }
        if (event.getType() == OreGenEvent.GenerateMinable.EventType.REDSTONE) {
            event.setResult(Event.Result.DENY);
        }
        if (event.getType() == OreGenEvent.GenerateMinable.EventType.DIAMOND) {
            event.setResult(Event.Result.DENY);
        }
        if (event.getType() == OreGenEvent.GenerateMinable.EventType.COAL) {
            event.setResult(Event.Result.DENY);
        }
        if (event.getType() == OreGenEvent.GenerateMinable.EventType.LAPIS) {
            event.setResult(Event.Result.DENY);
        }
    }
}