package net.antopfr.createcoloredcasing.registry;

import com.simibubi.create.content.kinetics.base.KineticBlockEntity;
import com.simibubi.create.content.kinetics.base.ShaftInstance;
import com.simibubi.create.content.kinetics.base.ShaftRenderer;
import com.simibubi.create.content.kinetics.simpleRelays.SimpleKineticBlockEntity;
import com.simibubi.create.content.kinetics.simpleRelays.encased.EncasedCogInstance;
import com.simibubi.create.content.kinetics.simpleRelays.encased.EncasedCogRenderer;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntityEntry;
import net.antopfr.createcoloredcasing.CreateColoredCasing;

public class CCBlockEntityTypes {
    private static final CreateRegistrate REGISTRATE = CreateColoredCasing.registrate();
    // - https://github.com/Creators-of-Create/Create/blob/mc1.18/dev/src/main/java/com/simibubi/create/AllTileEntities.java

    //Red
    public static final BlockEntityEntry<KineticBlockEntity> RED_ENCASED_SHAFT = REGISTRATE
            .blockEntity("red_encased_shaft", KineticBlockEntity::new)
            .instance(() -> ShaftInstance::new, false)
            .validBlocks(CCBlocks.RED_ENCASED_SHAFT)
            .renderer(() -> ShaftRenderer::new)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> RED_ENCASED_COGWHEEL = REGISTRATE
            .blockEntity("red_encased_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::small, false)
            .validBlocks(CCBlocks.RED_ENCASED_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::small)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> RED_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .blockEntity("red_encased_large_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::large, false)
        .validBlocks(CCBlocks.RED_ENCASED_LARGE_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::large)
            .register();


    //White
    public static final BlockEntityEntry<KineticBlockEntity> WHITE_ENCASED_SHAFT = REGISTRATE
            .blockEntity("white_encased_shaft", KineticBlockEntity::new)
            .instance(() -> ShaftInstance::new, false)
            .validBlocks(CCBlocks.WHITE_ENCASED_SHAFT)
            .renderer(() -> ShaftRenderer::new)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> WHITE_ENCASED_COGWHEEL = REGISTRATE
            .blockEntity("white_encased_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::small, false)
            .validBlocks(CCBlocks.WHITE_ENCASED_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::small)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> WHITE_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .blockEntity("white_encased_large_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::large, false)
            .validBlocks(CCBlocks.WHITE_ENCASED_LARGE_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::large)
            .register();



    //Black
    public static final BlockEntityEntry<KineticBlockEntity> BLACK_ENCASED_SHAFT = REGISTRATE
            .blockEntity("black_encased_shaft", KineticBlockEntity::new)
            .instance(() -> ShaftInstance::new, false)
            .validBlocks(CCBlocks.BLACK_ENCASED_SHAFT)
            .renderer(() -> ShaftRenderer::new)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> BLACK_ENCASED_COGWHEEL = REGISTRATE
            .blockEntity("black_encased_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::small, false)
            .validBlocks(CCBlocks.BLACK_ENCASED_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::small)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> BLACK_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .blockEntity("black_encased_large_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::large, false)
            .validBlocks(CCBlocks.BLACK_ENCASED_LARGE_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::large)
            .register();



    //Gray
    public static final BlockEntityEntry<KineticBlockEntity> GRAY_ENCASED_SHAFT = REGISTRATE
            .blockEntity("gray_encased_shaft", KineticBlockEntity::new)
            .instance(() -> ShaftInstance::new, false)
            .validBlocks(CCBlocks.GRAY_ENCASED_SHAFT)
            .renderer(() -> ShaftRenderer::new)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> GRAY_ENCASED_COGWHEEL = REGISTRATE
            .blockEntity("gray_encased_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::small, false)
            .validBlocks(CCBlocks.GRAY_ENCASED_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::small)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> GRAY_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .blockEntity("gray_encased_large_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::large, false)
            .validBlocks(CCBlocks.GRAY_ENCASED_LARGE_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::large)
            .register();



    //LightGray
    public static final BlockEntityEntry<KineticBlockEntity> LIGHT_GRAY_ENCASED_SHAFT = REGISTRATE
            .blockEntity("light_gray_encased_shaft", KineticBlockEntity::new)
            .instance(() -> ShaftInstance::new, false)
            .validBlocks(CCBlocks.LIGHT_GRAY_ENCASED_SHAFT)
            .renderer(() -> ShaftRenderer::new)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> LIGHT_GRAY_ENCASED_COGWHEEL = REGISTRATE
            .blockEntity("light_gray_encased_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::small, false)
            .validBlocks(CCBlocks.LIGHT_GRAY_ENCASED_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::small)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> LIGHT_GRAY_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .blockEntity("light_gray_encased_large_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::large, false)
            .validBlocks(CCBlocks.LIGHT_GRAY_ENCASED_LARGE_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::large)
            .register();



    //Blue
    public static final BlockEntityEntry<KineticBlockEntity> BLUE_ENCASED_SHAFT = REGISTRATE
            .blockEntity("blue_encased_shaft", KineticBlockEntity::new)
            .instance(() -> ShaftInstance::new, false)
            .validBlocks(CCBlocks.BLUE_ENCASED_SHAFT)
            .renderer(() -> ShaftRenderer::new)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> BLUE_ENCASED_COGWHEEL = REGISTRATE
            .blockEntity("blue_encased_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::small, false)
            .validBlocks(CCBlocks.BLUE_ENCASED_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::small)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> BLUE_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .blockEntity("blue_encased_large_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::large, false)
            .validBlocks(CCBlocks.BLUE_ENCASED_LARGE_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::large)
            .register();



    //LightBlue
    public static final BlockEntityEntry<KineticBlockEntity> LIGHT_BLUE_ENCASED_SHAFT = REGISTRATE
            .blockEntity("light_blue_encased_shaft", KineticBlockEntity::new)
            .instance(() -> ShaftInstance::new, false)
            .validBlocks(CCBlocks.LIGHT_BLUE_ENCASED_SHAFT)
            .renderer(() -> ShaftRenderer::new)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> LIGHT_BLUE_ENCASED_COGWHEEL = REGISTRATE
            .blockEntity("light_blue_encased_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::small, false)
            .validBlocks(CCBlocks.LIGHT_BLUE_ENCASED_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::small)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> LIGHT_BLUE_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .blockEntity("light_blue_encased_large_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::large, false)
            .validBlocks(CCBlocks.LIGHT_BLUE_ENCASED_LARGE_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::large)
            .register();



    //Green
    public static final BlockEntityEntry<KineticBlockEntity> GREEN_ENCASED_SHAFT = REGISTRATE
            .blockEntity("green_encased_shaft", KineticBlockEntity::new)
            .instance(() -> ShaftInstance::new, false)
            .validBlocks(CCBlocks.GREEN_ENCASED_SHAFT)
            .renderer(() -> ShaftRenderer::new)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> GREEN_ENCASED_COGWHEEL = REGISTRATE
            .blockEntity("green_encased_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::small, false)
            .validBlocks(CCBlocks.GREEN_ENCASED_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::small)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> GREEN_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .blockEntity("green_encased_large_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::large, false)
            .validBlocks(CCBlocks.GREEN_ENCASED_LARGE_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::large)
            .register();



    //Lime
    public static final BlockEntityEntry<KineticBlockEntity> LIME_ENCASED_SHAFT = REGISTRATE
            .blockEntity("lime_encased_shaft", KineticBlockEntity::new)
            .instance(() -> ShaftInstance::new, false)
            .validBlocks(CCBlocks.LIME_ENCASED_SHAFT)
            .renderer(() -> ShaftRenderer::new)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> LIME_ENCASED_COGWHEEL = REGISTRATE
            .blockEntity("lime_encased_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::small, false)
            .validBlocks(CCBlocks.LIME_ENCASED_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::small)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> LIME_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .blockEntity("lime_encased_large_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::large, false)
            .validBlocks(CCBlocks.LIME_ENCASED_LARGE_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::large)
            .register();



    //Cyan
    public static final BlockEntityEntry<KineticBlockEntity> CYAN_ENCASED_SHAFT = REGISTRATE
            .blockEntity("cyan_encased_shaft", KineticBlockEntity::new)
            .instance(() -> ShaftInstance::new, false)
            .validBlocks(CCBlocks.CYAN_ENCASED_SHAFT)
            .renderer(() -> ShaftRenderer::new)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> CYAN_ENCASED_COGWHEEL = REGISTRATE
            .blockEntity("cyan_encased_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::small, false)
            .validBlocks(CCBlocks.CYAN_ENCASED_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::small)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> CYAN_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .blockEntity("cyan_encased_large_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::large, false)
            .validBlocks(CCBlocks.CYAN_ENCASED_LARGE_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::large)
            .register();



    //Brown
    public static final BlockEntityEntry<KineticBlockEntity> BROWN_ENCASED_SHAFT = REGISTRATE
            .blockEntity("brown_encased_shaft", KineticBlockEntity::new)
            .instance(() -> ShaftInstance::new, false)
            .validBlocks(CCBlocks.BROWN_ENCASED_SHAFT)
            .renderer(() -> ShaftRenderer::new)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> BROWN_ENCASED_COGWHEEL = REGISTRATE
            .blockEntity("brown_encased_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::small, false)
            .validBlocks(CCBlocks.BROWN_ENCASED_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::small)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> BROWN_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .blockEntity("brown_encased_large_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::large, false)
            .validBlocks(CCBlocks.BROWN_ENCASED_LARGE_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::large)
            .register();




    //Orange
    public static final BlockEntityEntry<KineticBlockEntity> ORANGE_ENCASED_SHAFT = REGISTRATE
            .blockEntity("orange_encased_shaft", KineticBlockEntity::new)
            .instance(() -> ShaftInstance::new, false)
            .validBlocks(CCBlocks.ORANGE_ENCASED_SHAFT)
            .renderer(() -> ShaftRenderer::new)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> ORANGE_ENCASED_COGWHEEL = REGISTRATE
            .blockEntity("orange_encased_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::small, false)
            .validBlocks(CCBlocks.ORANGE_ENCASED_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::small)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> ORANGE_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .blockEntity("orange_encased_large_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::large, false)
            .validBlocks(CCBlocks.ORANGE_ENCASED_LARGE_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::large)
            .register();



    //Yellow
    public static final BlockEntityEntry<KineticBlockEntity> YELLOW_ENCASED_SHAFT = REGISTRATE
            .blockEntity("yellow_encased_shaft", KineticBlockEntity::new)
            .instance(() -> ShaftInstance::new, false)
            .validBlocks(CCBlocks.YELLOW_ENCASED_SHAFT)
            .renderer(() -> ShaftRenderer::new)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> YELLOW_ENCASED_COGWHEEL = REGISTRATE
            .blockEntity("yellow_encased_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::small, false)
            .validBlocks(CCBlocks.YELLOW_ENCASED_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::small)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> YELLOW_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .blockEntity("yellow_encased_large_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::large, false)
            .validBlocks(CCBlocks.YELLOW_ENCASED_LARGE_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::large)
            .register();



    //Pink
    public static final BlockEntityEntry<KineticBlockEntity> PINK_ENCASED_SHAFT = REGISTRATE
            .blockEntity("pink_encased_shaft", KineticBlockEntity::new)
            .instance(() -> ShaftInstance::new, false)
            .validBlocks(CCBlocks.PINK_ENCASED_SHAFT)
            .renderer(() -> ShaftRenderer::new)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> PINK_ENCASED_COGWHEEL = REGISTRATE
            .blockEntity("pink_encased_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::small, false)
            .validBlocks(CCBlocks.PINK_ENCASED_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::small)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> PINK_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .blockEntity("pink_encased_large_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::large, false)
            .validBlocks(CCBlocks.PINK_ENCASED_LARGE_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::large)
            .register();



    //Purple
    public static final BlockEntityEntry<KineticBlockEntity> PURPLE_ENCASED_SHAFT = REGISTRATE
            .blockEntity("purple_encased_shaft", KineticBlockEntity::new)
            .instance(() -> ShaftInstance::new, false)
            .validBlocks(CCBlocks.PURPLE_ENCASED_SHAFT)
            .renderer(() -> ShaftRenderer::new)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> PURPLE_ENCASED_COGWHEEL = REGISTRATE
            .blockEntity("purple_encased_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::small, false)
            .validBlocks(CCBlocks.PURPLE_ENCASED_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::small)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> PURPLE_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .blockEntity("purple_encased_large_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::large, false)
            .validBlocks(CCBlocks.PURPLE_ENCASED_LARGE_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::large)
            .register();



    //Magenta
    public static final BlockEntityEntry<KineticBlockEntity> MAGENTA_ENCASED_SHAFT = REGISTRATE
            .blockEntity("magenta_encased_shaft", KineticBlockEntity::new)
            .instance(() -> ShaftInstance::new, false)
            .validBlocks(CCBlocks.MAGENTA_ENCASED_SHAFT)
            .renderer(() -> ShaftRenderer::new)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> MAGENTA_ENCASED_COGWHEEL = REGISTRATE
            .blockEntity("magenta_encased_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::small, false)
            .validBlocks(CCBlocks.MAGENTA_ENCASED_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::small)
            .register();

    public static final BlockEntityEntry<SimpleKineticBlockEntity> MAGENTA_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .blockEntity("magenta_encased_large_cogwheel", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::large, false)
            .validBlocks(CCBlocks.MAGENTA_ENCASED_LARGE_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::large)
            .register();


    public static void register() {}
}
