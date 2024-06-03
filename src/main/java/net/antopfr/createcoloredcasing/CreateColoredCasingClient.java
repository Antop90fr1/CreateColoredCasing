package net.antopfr.createcoloredcasing;

import net.antopfr.createcoloredcasing.ponder.CCPonderIndex;
import net.antopfr.createcoloredcasing.ponder.CCPonderTags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@SuppressWarnings({"unused"})
public class CreateColoredCasingClient {

    public static void onCtorClient(IEventBus eventBus, IEventBus forgeEventBus) {

        eventBus.addListener(CreateColoredCasingClient::clientInit);
    }

    public static void clientInit(final FMLClientSetupEvent event) {
        CCPonderTags.register();
        CCPonderIndex.register();
    }
}
