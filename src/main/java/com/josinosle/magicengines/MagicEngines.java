package com.josinosle.magicengines;


import com.josinosle.magicengines.init.BlockInit;
import com.josinosle.magicengines.init.ItemInit;
import com.josinosle.magicengines.init.ParticleInit;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MagicEngines.MOD_ID)
public class MagicEngines
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "magicengines";

    public MagicEngines() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        ParticleInit.PARTICLE_TYPES.register(modEventBus);
        SpellInit.


        MinecraftForge.EVENT_BUS.register(this);
    }
}
