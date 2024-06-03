package net.antopfr.createcoloredcasing;

import net.antopfr.createcoloredcasing.registry.CCBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CCCreativeTab {
    public static final DeferredRegister<CreativeModeTab>  TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateColoredCasing.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CC_TAB = TABS.register("createcoloredcasing_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(CCBlocks.RED_CASING.get()))
                    .title(Component.translatable("creativetab.coloredcasing_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(CCBlocks.BLACK_CASING.get());
                        pOutput.accept(CCBlocks.BLUE_CASING.get());
                        pOutput.accept(CCBlocks.BROWN_CASING.get());
                        pOutput.accept(CCBlocks.CYAN_CASING.get());
                        pOutput.accept(CCBlocks.GRAY_CASING.get());
                        pOutput.accept(CCBlocks.GREEN_CASING.get());
                        pOutput.accept(CCBlocks.LIGHT_BLUE_CASING.get());
                        pOutput.accept(CCBlocks.LIGHT_GRAY_CASING.get());
                        pOutput.accept(CCBlocks.LIME_CASING.get());
                        pOutput.accept(CCBlocks.MAGENTA_CASING.get());
                        pOutput.accept(CCBlocks.ORANGE_CASING.get());
                        pOutput.accept(CCBlocks.PINK_CASING.get());
                        pOutput.accept(CCBlocks.PURPLE_CASING.get());
                        pOutput.accept(CCBlocks.RED_CASING.get());
                        pOutput.accept(CCBlocks.WHITE_CASING.get());
                        pOutput.accept(CCBlocks.YELLOW_CASING.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}