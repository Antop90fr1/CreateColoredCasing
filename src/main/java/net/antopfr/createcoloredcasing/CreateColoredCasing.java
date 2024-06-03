package net.antopfr.createcoloredcasing;

import com.simibubi.create.foundation.data.CreateRegistrate;
import net.antopfr.createcoloredcasing.registry.CCBlockEntityTypes;
import net.antopfr.createcoloredcasing.registry.CCBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CreateColoredCasing.MOD_ID)
public class CreateColoredCasing
{
    public static final String MOD_ID = "createcoloredcasing";
    public static final String NAME = "Create: Colored Casing";
    private static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreateColoredCasing.MOD_ID);

    public CreateColoredCasing()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;

        MinecraftForge.EVENT_BUS.register(this);

        CreateColoredCasing.REGISTRATE.registerEventListeners(modEventBus);

        CCCreativeTab.register(modEventBus);
        CCBlocks.register();
        CCBlockEntityTypes.register();

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> CreateColoredCasingClient.onCtorClient(modEventBus, forgeEventBus));
    }
    
    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static CreateRegistrate registrate() {
        return REGISTRATE;
    }
}
