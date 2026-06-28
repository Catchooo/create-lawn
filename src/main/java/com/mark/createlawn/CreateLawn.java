package com.mark.createlawn;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CreateLawn.MOD_ID)
public class CreateLawn {
    public static final String MOD_ID = "createlawn";
    public static final Logger LOGGER = LogManager.getLogger();

    public CreateLawn() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        // Тут ми будемо реєструвати наші газони та шланги
        
        MinecraftForge.EVENT_BUS.register(this);
    }
}
