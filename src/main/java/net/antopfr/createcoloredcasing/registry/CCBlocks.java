package net.antopfr.createcoloredcasing.registry;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.decoration.encasing.CasingBlock;
import com.simibubi.create.content.decoration.encasing.EncasingRegistry;
import com.simibubi.create.content.kinetics.simpleRelays.encased.EncasedCogCTBehaviour;
import com.simibubi.create.content.kinetics.simpleRelays.encased.EncasedCogwheelBlock;
import com.simibubi.create.content.kinetics.simpleRelays.encased.EncasedShaftBlock;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.utility.Couple;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.antopfr.createcoloredcasing.CCCreativeTab;
import net.antopfr.createcoloredcasing.CCSpriteShifts;
import net.antopfr.createcoloredcasing.CreateColoredCasing;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.material.MapColor;

import javax.annotation.Nonnull;

import static com.simibubi.create.foundation.data.TagGen.axeOrPickaxe;

public class CCBlocks {
    private static final CreateRegistrate REGISTRATE = CreateColoredCasing.registrate();

    // - https://github.com/Creators-of-Create/Create/blob/mc1.20.1/dev/src/main/java/com/simibubi/create/AllBlocks.java

    static {
        REGISTRATE.setCreativeTab(CCCreativeTab.CC_TAB);
    }

    //   Red Casing
    public static final BlockEntry<CasingBlock> RED_CASING = REGISTRATE
            .block("red_casing", CasingBlock::new)
            .properties(p -> p.mapColor(MapColor.COLOR_RED))
            .transform(BuilderTransformers.casing(() -> CCSpriteShifts.RED_CASING))
            .register();
    public static final BlockEntry<EncasedShaftBlock> RED_ENCASED_SHAFT = REGISTRATE
            .block("red_encased_shaft", p -> new EncasedShaftBlock(p, CCBlocks.RED_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_RED))
            .transform(BuilderTransformers.encasedShaft("red", () -> CCSpriteShifts.RED_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.SHAFT))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> RED_ENCASED_COGWHEEL = REGISTRATE
            .block("red_encased_cogwheel", p -> new EncasedCogwheelBlock(p, false, CCBlocks.RED_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_RED))
            .transform(BuilderTransformers.encasedCogwheel("red", () -> CCSpriteShifts.RED_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.COGWHEEL))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCogCTBehaviour(CCSpriteShifts.RED_CASING,
                    Couple.create(CCSpriteShifts.RED_ENCASED_COGWHEEL_SIDE,
                            CCSpriteShifts.RED_ENCASED_COGWHEEL_OTHERSIDE))))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> RED_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .block("red_encased_large_cogwheel",
                    p -> new EncasedCogwheelBlock(p, true, CCBlocks.RED_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_RED))
            .transform(BuilderTransformers.encasedLargeCogwheel("red", () -> CCSpriteShifts.RED_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.LARGE_COGWHEEL))
            .transform(axeOrPickaxe())
            .register();

    //   White Casing
    public static final BlockEntry<CasingBlock> WHITE_CASING = REGISTRATE
            .block("white_casing", CasingBlock::new)
            .properties(p -> p.mapColor(MapColor.SNOW))
            .transform(BuilderTransformers.casing(() -> CCSpriteShifts.WHITE_CASING))
            .register();
    public static final BlockEntry<EncasedShaftBlock> WHITE_ENCASED_SHAFT = REGISTRATE
            .block("white_encased_shaft", p -> new EncasedShaftBlock(p, CCBlocks.WHITE_CASING::get))
            .properties(p -> p.mapColor(MapColor.SNOW))
            .transform(BuilderTransformers.encasedShaft("white", () -> CCSpriteShifts.WHITE_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.SHAFT))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> WHITE_ENCASED_COGWHEEL = REGISTRATE
            .block("white_encased_cogwheel", p -> new EncasedCogwheelBlock(p, false, CCBlocks.WHITE_CASING::get))
            .properties(p -> p.mapColor(MapColor.SNOW))
            .transform(BuilderTransformers.encasedCogwheel("white", () -> CCSpriteShifts.WHITE_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.COGWHEEL))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCogCTBehaviour(CCSpriteShifts.WHITE_CASING,
                    Couple.create(CCSpriteShifts.WHITE_ENCASED_COGWHEEL_SIDE,
                            CCSpriteShifts.WHITE_ENCASED_COGWHEEL_OTHERSIDE))))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> WHITE_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .block("white_encased_large_cogwheel",
                    p -> new EncasedCogwheelBlock(p, true, CCBlocks.WHITE_CASING::get))
            .properties(p -> p.mapColor(MapColor.SNOW))
            .transform(BuilderTransformers.encasedLargeCogwheel("white", () -> CCSpriteShifts.WHITE_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.LARGE_COGWHEEL))
            .transform(axeOrPickaxe())
            .register();

    //   Black Casing
    public static final BlockEntry<CasingBlock> BLACK_CASING = REGISTRATE
            .block("black_casing", CasingBlock::new)
            .properties(p -> p.mapColor(MapColor.COLOR_BLACK))
            .transform(BuilderTransformers.casing(() -> CCSpriteShifts.BLACK_CASING))
            .register();
    public static final BlockEntry<EncasedShaftBlock> BLACK_ENCASED_SHAFT = REGISTRATE
            .block("black_encased_shaft", p -> new EncasedShaftBlock(p, CCBlocks.BLACK_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_BLACK))
            .transform(BuilderTransformers.encasedShaft("black", () -> CCSpriteShifts.BLACK_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.SHAFT))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> BLACK_ENCASED_COGWHEEL = REGISTRATE
            .block("black_encased_cogwheel", p -> new EncasedCogwheelBlock(p, false, CCBlocks.BLACK_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_BLACK))
            .transform(BuilderTransformers.encasedCogwheel("black", () -> CCSpriteShifts.BLACK_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.COGWHEEL))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCogCTBehaviour(CCSpriteShifts.BLACK_CASING,
                    Couple.create(CCSpriteShifts.BLACK_ENCASED_COGWHEEL_SIDE,
                            CCSpriteShifts.BLACK_ENCASED_COGWHEEL_OTHERSIDE))))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> BLACK_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .block("black_encased_large_cogwheel",
                    p -> new EncasedCogwheelBlock(p, true, CCBlocks.BLACK_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_BLACK))
            .transform(BuilderTransformers.encasedLargeCogwheel("black", () -> CCSpriteShifts.BLACK_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.LARGE_COGWHEEL))
            .transform(axeOrPickaxe())
            .register();

    //   Gray Casing
    public static final BlockEntry<CasingBlock> GRAY_CASING = REGISTRATE
            .block("gray_casing", CasingBlock::new)
            .properties(p -> p.mapColor(MapColor.COLOR_GRAY))
            .transform(BuilderTransformers.casing(() -> CCSpriteShifts.GRAY_CASING))
            .register();
    public static final BlockEntry<EncasedShaftBlock> GRAY_ENCASED_SHAFT = REGISTRATE
            .block("gray_encased_shaft", p -> new EncasedShaftBlock(p, CCBlocks.GRAY_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_GRAY))
            .transform(BuilderTransformers.encasedShaft("gray", () -> CCSpriteShifts.GRAY_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.SHAFT))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> GRAY_ENCASED_COGWHEEL = REGISTRATE
            .block("gray_encased_cogwheel", p -> new EncasedCogwheelBlock(p, false, CCBlocks.GRAY_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_GRAY))
            .transform(BuilderTransformers.encasedCogwheel("gray", () -> CCSpriteShifts.GRAY_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.COGWHEEL))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCogCTBehaviour(CCSpriteShifts.GRAY_CASING,
                    Couple.create(CCSpriteShifts.GRAY_ENCASED_COGWHEEL_SIDE,
                            CCSpriteShifts.GRAY_ENCASED_COGWHEEL_OTHERSIDE))))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> GRAY_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .block("gray_encased_large_cogwheel",
                    p -> new EncasedCogwheelBlock(p, true, CCBlocks.GRAY_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_GRAY))
            .transform(BuilderTransformers.encasedLargeCogwheel("gray", () -> CCSpriteShifts.GRAY_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.LARGE_COGWHEEL))
            .transform(axeOrPickaxe())
            .register();



    //   LightGray Casing
    public static final BlockEntry<CasingBlock> LIGHT_GRAY_CASING = REGISTRATE
            .block("light_gray_casing", CasingBlock::new)
            .properties(p -> p.mapColor(MapColor.COLOR_LIGHT_GRAY))
            .transform(BuilderTransformers.casing(() -> CCSpriteShifts.LIGHT_GRAY_CASING))
            .register();
    public static final BlockEntry<EncasedShaftBlock> LIGHT_GRAY_ENCASED_SHAFT = REGISTRATE
            .block("light_gray_encased_shaft", p -> new EncasedShaftBlock(p, CCBlocks.LIGHT_GRAY_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_LIGHT_GRAY))
            .transform(BuilderTransformers.encasedShaft("light_gray", () -> CCSpriteShifts.LIGHT_GRAY_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.SHAFT))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> LIGHT_GRAY_ENCASED_COGWHEEL = REGISTRATE
            .block("light_gray_encased_cogwheel", p -> new EncasedCogwheelBlock(p, false, CCBlocks.LIGHT_GRAY_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_LIGHT_GRAY))
            .transform(BuilderTransformers.encasedCogwheel("light_gray", () -> CCSpriteShifts.LIGHT_GRAY_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.COGWHEEL))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCogCTBehaviour(CCSpriteShifts.LIGHT_GRAY_CASING,
                    Couple.create(CCSpriteShifts.LIGHT_GRAY_ENCASED_COGWHEEL_SIDE,
                            CCSpriteShifts.LIGHT_GRAY_ENCASED_COGWHEEL_OTHERSIDE))))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> LIGHT_GRAY_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .block("light_gray_encased_large_cogwheel",
                    p -> new EncasedCogwheelBlock(p, true, CCBlocks.LIGHT_GRAY_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_LIGHT_GRAY))
            .transform(BuilderTransformers.encasedLargeCogwheel("light_gray", () -> CCSpriteShifts.LIGHT_GRAY_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.LARGE_COGWHEEL))
            .transform(axeOrPickaxe())
            .register();
    


    //   LightBlue Casing
    public static final BlockEntry<CasingBlock> LIGHT_BLUE_CASING = REGISTRATE
            .block("light_blue_casing", CasingBlock::new)
            .properties(p -> p.mapColor(MapColor.COLOR_LIGHT_BLUE))
            .transform(BuilderTransformers.casing(() -> CCSpriteShifts.LIGHT_BLUE_CASING))
            .register();
    public static final BlockEntry<EncasedShaftBlock> LIGHT_BLUE_ENCASED_SHAFT = REGISTRATE
            .block("light_blue_encased_shaft", p -> new EncasedShaftBlock(p, CCBlocks.LIGHT_BLUE_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_LIGHT_BLUE))
            .transform(BuilderTransformers.encasedShaft("light_blue", () -> CCSpriteShifts.LIGHT_BLUE_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.SHAFT))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> LIGHT_BLUE_ENCASED_COGWHEEL = REGISTRATE
            .block("light_blue_encased_cogwheel", p -> new EncasedCogwheelBlock(p, false, CCBlocks.LIGHT_BLUE_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_LIGHT_BLUE))
            .transform(BuilderTransformers.encasedCogwheel("light_blue", () -> CCSpriteShifts.LIGHT_BLUE_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.COGWHEEL))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCogCTBehaviour(CCSpriteShifts.LIGHT_BLUE_CASING,
                    Couple.create(CCSpriteShifts.LIGHT_BLUE_ENCASED_COGWHEEL_SIDE,
                            CCSpriteShifts.LIGHT_BLUE_ENCASED_COGWHEEL_OTHERSIDE))))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> LIGHT_BLUE_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .block("light_blue_encased_large_cogwheel",
                    p -> new EncasedCogwheelBlock(p, true, CCBlocks.LIGHT_BLUE_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_LIGHT_BLUE))
            .transform(BuilderTransformers.encasedLargeCogwheel("light_blue", () -> CCSpriteShifts.LIGHT_BLUE_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.LARGE_COGWHEEL))
            .transform(axeOrPickaxe())
            .register();

    
    
    //   Blue Casing
    public static final BlockEntry<CasingBlock> BLUE_CASING = REGISTRATE
            .block("blue_casing", CasingBlock::new)
            .properties(p -> p.mapColor(MapColor.COLOR_BLUE))
            .transform(BuilderTransformers.casing(() -> CCSpriteShifts.BLUE_CASING))
            .register();
    public static final BlockEntry<EncasedShaftBlock> BLUE_ENCASED_SHAFT = REGISTRATE
            .block("blue_encased_shaft", p -> new EncasedShaftBlock(p, CCBlocks.BLUE_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_BLUE))
            .transform(BuilderTransformers.encasedShaft("blue", () -> CCSpriteShifts.BLUE_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.SHAFT))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> BLUE_ENCASED_COGWHEEL = REGISTRATE
            .block("blue_encased_cogwheel", p -> new EncasedCogwheelBlock(p, false, CCBlocks.BLUE_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_BLUE))
            .transform(BuilderTransformers.encasedCogwheel("blue", () -> CCSpriteShifts.BLUE_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.COGWHEEL))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCogCTBehaviour(CCSpriteShifts.BLUE_CASING,
                    Couple.create(CCSpriteShifts.BLUE_ENCASED_COGWHEEL_SIDE,
                            CCSpriteShifts.BLUE_ENCASED_COGWHEEL_OTHERSIDE))))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> BLUE_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .block("blue_encased_large_cogwheel",
                    p -> new EncasedCogwheelBlock(p, true, CCBlocks.BLUE_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_BLUE))
            .transform(BuilderTransformers.encasedLargeCogwheel("blue", () -> CCSpriteShifts.BLUE_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.LARGE_COGWHEEL))
            .transform(axeOrPickaxe())
            .register();



    //   Brown Casing
    public static final BlockEntry<CasingBlock> BROWN_CASING = REGISTRATE
            .block("brown_casing", CasingBlock::new)
            .properties(p -> p.mapColor(MapColor.COLOR_BROWN))
            .transform(BuilderTransformers.casing(() -> CCSpriteShifts.BROWN_CASING))
            .register();
    public static final BlockEntry<EncasedShaftBlock> BROWN_ENCASED_SHAFT = REGISTRATE
            .block("brown_encased_shaft", p -> new EncasedShaftBlock(p, CCBlocks.BROWN_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_BROWN))
            .transform(BuilderTransformers.encasedShaft("brown", () -> CCSpriteShifts.BROWN_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.SHAFT))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> BROWN_ENCASED_COGWHEEL = REGISTRATE
            .block("brown_encased_cogwheel", p -> new EncasedCogwheelBlock(p, false, CCBlocks.BROWN_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_BROWN))
            .transform(BuilderTransformers.encasedCogwheel("brown", () -> CCSpriteShifts.BROWN_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.COGWHEEL))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCogCTBehaviour(CCSpriteShifts.BROWN_CASING,
                    Couple.create(CCSpriteShifts.BROWN_ENCASED_COGWHEEL_SIDE,
                            CCSpriteShifts.BROWN_ENCASED_COGWHEEL_OTHERSIDE))))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> BROWN_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .block("brown_encased_large_cogwheel",
                    p -> new EncasedCogwheelBlock(p, true, CCBlocks.BROWN_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_BROWN))
            .transform(BuilderTransformers.encasedLargeCogwheel("brown", () -> CCSpriteShifts.BROWN_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.LARGE_COGWHEEL))
            .transform(axeOrPickaxe())
            .register();



    //   Orange Casing
    public static final BlockEntry<CasingBlock> ORANGE_CASING = REGISTRATE
            .block("orange_casing", CasingBlock::new)
            .properties(p -> p.mapColor(MapColor.COLOR_ORANGE))
            .transform(BuilderTransformers.casing(() -> CCSpriteShifts.ORANGE_CASING))
            .register();
    public static final BlockEntry<EncasedShaftBlock> ORANGE_ENCASED_SHAFT = REGISTRATE
            .block("orange_encased_shaft", p -> new EncasedShaftBlock(p, CCBlocks.ORANGE_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_ORANGE))
            .transform(BuilderTransformers.encasedShaft("orange", () -> CCSpriteShifts.ORANGE_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.SHAFT))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> ORANGE_ENCASED_COGWHEEL = REGISTRATE
            .block("orange_encased_cogwheel", p -> new EncasedCogwheelBlock(p, false, CCBlocks.ORANGE_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_ORANGE))
            .transform(BuilderTransformers.encasedCogwheel("orange", () -> CCSpriteShifts.ORANGE_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.COGWHEEL))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCogCTBehaviour(CCSpriteShifts.ORANGE_CASING,
                    Couple.create(CCSpriteShifts.ORANGE_ENCASED_COGWHEEL_SIDE,
                            CCSpriteShifts.ORANGE_ENCASED_COGWHEEL_OTHERSIDE))))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> ORANGE_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .block("orange_encased_large_cogwheel",
                    p -> new EncasedCogwheelBlock(p, true, CCBlocks.ORANGE_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_ORANGE))
            .transform(BuilderTransformers.encasedLargeCogwheel("orange", () -> CCSpriteShifts.ORANGE_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.LARGE_COGWHEEL))
            .transform(axeOrPickaxe())
            .register();



    //   Yellow Casing
    public static final BlockEntry<CasingBlock> YELLOW_CASING = REGISTRATE
            .block("yellow_casing", CasingBlock::new)
            .properties(p -> p.mapColor(MapColor.COLOR_YELLOW))
            .transform(BuilderTransformers.casing(() -> CCSpriteShifts.YELLOW_CASING))
            .register();
    public static final BlockEntry<EncasedShaftBlock> YELLOW_ENCASED_SHAFT = REGISTRATE
            .block("yellow_encased_shaft", p -> new EncasedShaftBlock(p, CCBlocks.YELLOW_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_YELLOW))
            .transform(BuilderTransformers.encasedShaft("yellow", () -> CCSpriteShifts.YELLOW_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.SHAFT))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> YELLOW_ENCASED_COGWHEEL = REGISTRATE
            .block("yellow_encased_cogwheel", p -> new EncasedCogwheelBlock(p, false, CCBlocks.YELLOW_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_YELLOW))
            .transform(BuilderTransformers.encasedCogwheel("yellow", () -> CCSpriteShifts.YELLOW_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.COGWHEEL))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCogCTBehaviour(CCSpriteShifts.YELLOW_CASING,
                    Couple.create(CCSpriteShifts.YELLOW_ENCASED_COGWHEEL_SIDE,
                            CCSpriteShifts.YELLOW_ENCASED_COGWHEEL_OTHERSIDE))))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> YELLOW_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .block("yellow_encased_large_cogwheel",
                    p -> new EncasedCogwheelBlock(p, true, CCBlocks.YELLOW_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_YELLOW))
            .transform(BuilderTransformers.encasedLargeCogwheel("yellow", () -> CCSpriteShifts.YELLOW_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.LARGE_COGWHEEL))
            .transform(axeOrPickaxe())
            .register();



    //   Pink Casing
    public static final BlockEntry<CasingBlock> PINK_CASING = REGISTRATE
            .block("pink_casing", CasingBlock::new)
            .properties(p -> p.mapColor(MapColor.COLOR_PINK))
            .transform(BuilderTransformers.casing(() -> CCSpriteShifts.PINK_CASING))
            .register();
    public static final BlockEntry<EncasedShaftBlock> PINK_ENCASED_SHAFT = REGISTRATE
            .block("pink_encased_shaft", p -> new EncasedShaftBlock(p, CCBlocks.PINK_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_PINK))
            .transform(BuilderTransformers.encasedShaft("pink", () -> CCSpriteShifts.PINK_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.SHAFT))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> PINK_ENCASED_COGWHEEL = REGISTRATE
            .block("pink_encased_cogwheel", p -> new EncasedCogwheelBlock(p, false, CCBlocks.PINK_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_PINK))
            .transform(BuilderTransformers.encasedCogwheel("pink", () -> CCSpriteShifts.PINK_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.COGWHEEL))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCogCTBehaviour(CCSpriteShifts.PINK_CASING,
                    Couple.create(CCSpriteShifts.PINK_ENCASED_COGWHEEL_SIDE,
                            CCSpriteShifts.PINK_ENCASED_COGWHEEL_OTHERSIDE))))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> PINK_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .block("pink_encased_large_cogwheel",
                    p -> new EncasedCogwheelBlock(p, true, CCBlocks.PINK_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_PINK))
            .transform(BuilderTransformers.encasedLargeCogwheel("pink", () -> CCSpriteShifts.PINK_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.LARGE_COGWHEEL))
            .transform(axeOrPickaxe())
            .register();



    //   Green Casing
    public static final BlockEntry<CasingBlock> GREEN_CASING = REGISTRATE
            .block("green_casing", CasingBlock::new)
            .properties(p -> p.mapColor(MapColor.COLOR_GREEN))
            .transform(BuilderTransformers.casing(() -> CCSpriteShifts.GREEN_CASING))
            .register();
    public static final BlockEntry<EncasedShaftBlock> GREEN_ENCASED_SHAFT = REGISTRATE
            .block("green_encased_shaft", p -> new EncasedShaftBlock(p, CCBlocks.GREEN_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_GREEN))
            .transform(BuilderTransformers.encasedShaft("green", () -> CCSpriteShifts.GREEN_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.SHAFT))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> GREEN_ENCASED_COGWHEEL = REGISTRATE
            .block("green_encased_cogwheel", p -> new EncasedCogwheelBlock(p, false, CCBlocks.GREEN_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_GREEN))
            .transform(BuilderTransformers.encasedCogwheel("green", () -> CCSpriteShifts.GREEN_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.COGWHEEL))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCogCTBehaviour(CCSpriteShifts.GREEN_CASING,
                    Couple.create(CCSpriteShifts.GREEN_ENCASED_COGWHEEL_SIDE,
                            CCSpriteShifts.GREEN_ENCASED_COGWHEEL_OTHERSIDE))))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> GREEN_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .block("green_encased_large_cogwheel",
                    p -> new EncasedCogwheelBlock(p, true, CCBlocks.GREEN_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_GREEN))
            .transform(BuilderTransformers.encasedLargeCogwheel("green", () -> CCSpriteShifts.GREEN_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.LARGE_COGWHEEL))
            .transform(axeOrPickaxe())
            .register();



    //   Lime Casing
    public static final BlockEntry<CasingBlock> LIME_CASING = REGISTRATE
            .block("lime_casing", CasingBlock::new)
            .properties(p -> p.mapColor(MapColor.COLOR_LIGHT_GREEN))
            .transform(BuilderTransformers.casing(() -> CCSpriteShifts.LIME_CASING))
            .register();
    public static final BlockEntry<EncasedShaftBlock> LIME_ENCASED_SHAFT = REGISTRATE
            .block("lime_encased_shaft", p -> new EncasedShaftBlock(p, CCBlocks.LIME_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_LIGHT_GREEN))
            .transform(BuilderTransformers.encasedShaft("lime", () -> CCSpriteShifts.LIME_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.SHAFT))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> LIME_ENCASED_COGWHEEL = REGISTRATE
            .block("lime_encased_cogwheel", p -> new EncasedCogwheelBlock(p, false, CCBlocks.LIME_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_LIGHT_GREEN))
            .transform(BuilderTransformers.encasedCogwheel("lime", () -> CCSpriteShifts.LIME_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.COGWHEEL))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCogCTBehaviour(CCSpriteShifts.LIME_CASING,
                    Couple.create(CCSpriteShifts.LIME_ENCASED_COGWHEEL_SIDE,
                            CCSpriteShifts.LIME_ENCASED_COGWHEEL_OTHERSIDE))))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> LIME_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .block("lime_encased_large_cogwheel",
                    p -> new EncasedCogwheelBlock(p, true, CCBlocks.LIME_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_LIGHT_GREEN))
            .transform(BuilderTransformers.encasedLargeCogwheel("lime", () -> CCSpriteShifts.LIME_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.LARGE_COGWHEEL))
            .transform(axeOrPickaxe())
            .register();



    //   Cyan Casing
    public static final BlockEntry<CasingBlock> CYAN_CASING = REGISTRATE
            .block("cyan_casing", CasingBlock::new)
            .properties(p -> p.mapColor(MapColor.COLOR_CYAN))
            .transform(BuilderTransformers.casing(() -> CCSpriteShifts.CYAN_CASING))
            .register();
    public static final BlockEntry<EncasedShaftBlock> CYAN_ENCASED_SHAFT = REGISTRATE
            .block("cyan_encased_shaft", p -> new EncasedShaftBlock(p, CCBlocks.CYAN_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_CYAN))
            .transform(BuilderTransformers.encasedShaft("cyan", () -> CCSpriteShifts.CYAN_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.SHAFT))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> CYAN_ENCASED_COGWHEEL = REGISTRATE
            .block("cyan_encased_cogwheel", p -> new EncasedCogwheelBlock(p, false, CCBlocks.CYAN_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_CYAN))
            .transform(BuilderTransformers.encasedCogwheel("cyan", () -> CCSpriteShifts.CYAN_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.COGWHEEL))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCogCTBehaviour(CCSpriteShifts.CYAN_CASING,
                    Couple.create(CCSpriteShifts.CYAN_ENCASED_COGWHEEL_SIDE,
                            CCSpriteShifts.CYAN_ENCASED_COGWHEEL_OTHERSIDE))))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> CYAN_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .block("cyan_encased_large_cogwheel",
                    p -> new EncasedCogwheelBlock(p, true, CCBlocks.CYAN_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_CYAN))
            .transform(BuilderTransformers.encasedLargeCogwheel("cyan", () -> CCSpriteShifts.CYAN_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.LARGE_COGWHEEL))
            .transform(axeOrPickaxe())
            .register();



    //    Magenta Casing
    public static final BlockEntry<CasingBlock> MAGENTA_CASING = REGISTRATE
            .block("magenta_casing", CasingBlock::new)
            .properties(p -> p.mapColor(MapColor.COLOR_MAGENTA))
            .transform(BuilderTransformers.casing(() -> CCSpriteShifts.MAGENTA_CASING))
            .register();
    public static final BlockEntry<EncasedShaftBlock> MAGENTA_ENCASED_SHAFT = REGISTRATE
            .block("magenta_encased_shaft", p -> new EncasedShaftBlock(p, CCBlocks.MAGENTA_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_MAGENTA))
            .transform(BuilderTransformers.encasedShaft("magenta", () -> CCSpriteShifts.MAGENTA_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.SHAFT))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> MAGENTA_ENCASED_COGWHEEL = REGISTRATE
            .block("magenta_encased_cogwheel", p -> new EncasedCogwheelBlock(p, false, CCBlocks.MAGENTA_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_MAGENTA))
            .transform(BuilderTransformers.encasedCogwheel("magenta", () -> CCSpriteShifts.MAGENTA_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.COGWHEEL))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCogCTBehaviour(CCSpriteShifts.MAGENTA_CASING,
                    Couple.create(CCSpriteShifts.MAGENTA_ENCASED_COGWHEEL_SIDE,
                            CCSpriteShifts.MAGENTA_ENCASED_COGWHEEL_OTHERSIDE))))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> MAGENTA_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .block("magenta_encased_large_cogwheel",
                    p -> new EncasedCogwheelBlock(p, true, CCBlocks.MAGENTA_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_MAGENTA))
            .transform(BuilderTransformers.encasedLargeCogwheel("magenta", () -> CCSpriteShifts.MAGENTA_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.LARGE_COGWHEEL))
            .transform(axeOrPickaxe())
            .register();



    //   Purple Casing
    public static final BlockEntry<CasingBlock> PURPLE_CASING = REGISTRATE
            .block("purple_casing", CasingBlock::new)
            .properties(p -> p.mapColor(MapColor.COLOR_PURPLE))
            .transform(BuilderTransformers.casing(() -> CCSpriteShifts.PURPLE_CASING))
            .register();
    public static final BlockEntry<EncasedShaftBlock> PURPLE_ENCASED_SHAFT = REGISTRATE
            .block("purple_encased_shaft", p -> new EncasedShaftBlock(p, CCBlocks.PURPLE_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_PURPLE))
            .transform(BuilderTransformers.encasedShaft("purple", () -> CCSpriteShifts.PURPLE_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.SHAFT))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> PURPLE_ENCASED_COGWHEEL = REGISTRATE
            .block("purple_encased_cogwheel", p -> new EncasedCogwheelBlock(p, false, CCBlocks.PURPLE_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_PURPLE))
            .transform(BuilderTransformers.encasedCogwheel("purple", () -> CCSpriteShifts.PURPLE_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.COGWHEEL))
            .onRegister(CreateRegistrate.connectedTextures(() -> new EncasedCogCTBehaviour(CCSpriteShifts.PURPLE_CASING,
                    Couple.create(CCSpriteShifts.PURPLE_ENCASED_COGWHEEL_SIDE,
                            CCSpriteShifts.PURPLE_ENCASED_COGWHEEL_OTHERSIDE))))
            .transform(axeOrPickaxe())
            .register();

    public static final BlockEntry<EncasedCogwheelBlock> PURPLE_ENCASED_LARGE_COGWHEEL = REGISTRATE
            .block("purple_encased_large_cogwheel",
                    p -> new EncasedCogwheelBlock(p, true, CCBlocks.PURPLE_CASING::get))
            .properties(p -> p.mapColor(MapColor.COLOR_PURPLE))
            .transform(BuilderTransformers.encasedLargeCogwheel("purple", () -> CCSpriteShifts.PURPLE_CASING))
            .transform(EncasingRegistry.addVariantTo(AllBlocks.LARGE_COGWHEEL))
            .transform(axeOrPickaxe())
            .register();

    public static void register() {}
}
