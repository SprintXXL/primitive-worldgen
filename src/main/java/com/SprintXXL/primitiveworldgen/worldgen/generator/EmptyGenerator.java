package com.SprintXXL.primitiveworldgen.worldgen.generator;

import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.MapGenBase;

public class EmptyGenerator extends MapGenBase {

    @Override
    public void generate (
            World world,
            int chunkX,
            int chunkZ,
            ChunkPrimer primer
    ) {

        // Do Nothing

    }
}