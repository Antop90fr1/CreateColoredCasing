package net.antopfr.createcoloredcasing;

import com.simibubi.create.foundation.block.connected.AllCTTypes;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import com.simibubi.create.foundation.block.connected.CTSpriteShifter;

import static com.simibubi.create.foundation.block.connected.AllCTTypes.*;

public class CCSpriteShifts {

    public static final CTSpriteShiftEntry RED_CASING = ct(OMNIDIRECTIONAL, "red_casing"),
            RED_ENCASED_COGWHEEL_SIDE = ct(VERTICAL, "red_encased_cogwheel_side"),
            RED_ENCASED_COGWHEEL_OTHERSIDE = ct(HORIZONTAL, "red_encased_cogwheel_side");

    public static final CTSpriteShiftEntry WHITE_CASING = ct(OMNIDIRECTIONAL, "white_casing"),
            WHITE_ENCASED_COGWHEEL_SIDE = ct(VERTICAL, "white_encased_cogwheel_side"),
            WHITE_ENCASED_COGWHEEL_OTHERSIDE = ct(HORIZONTAL, "white_encased_cogwheel_side");

    public static final CTSpriteShiftEntry BLACK_CASING = ct(OMNIDIRECTIONAL, "black_casing"),
            BLACK_ENCASED_COGWHEEL_SIDE = ct(VERTICAL, "black_encased_cogwheel_side"),
            BLACK_ENCASED_COGWHEEL_OTHERSIDE = ct(HORIZONTAL, "black_encased_cogwheel_side");

    public static final CTSpriteShiftEntry GRAY_CASING = ct(OMNIDIRECTIONAL, "gray_casing"),
            GRAY_ENCASED_COGWHEEL_SIDE = ct(VERTICAL, "gray_encased_cogwheel_side"),
            GRAY_ENCASED_COGWHEEL_OTHERSIDE = ct(HORIZONTAL, "gray_encased_cogwheel_side");

    public static final CTSpriteShiftEntry LIGHT_GRAY_CASING = ct(OMNIDIRECTIONAL, "light_gray_casing"),
            LIGHT_GRAY_ENCASED_COGWHEEL_SIDE = ct(VERTICAL, "light_gray_encased_cogwheel_side"),
            LIGHT_GRAY_ENCASED_COGWHEEL_OTHERSIDE = ct(HORIZONTAL, "light_gray_encased_cogwheel_side");

    public static final CTSpriteShiftEntry LIGHT_BLUE_CASING = ct(OMNIDIRECTIONAL, "light_blue_casing"),
            LIGHT_BLUE_ENCASED_COGWHEEL_SIDE = ct(VERTICAL, "light_blue_encased_cogwheel_side"),
            LIGHT_BLUE_ENCASED_COGWHEEL_OTHERSIDE = ct(HORIZONTAL, "light_blue_encased_cogwheel_side");

    public static final CTSpriteShiftEntry GREEN_CASING = ct(OMNIDIRECTIONAL, "green_casing"),
            GREEN_ENCASED_COGWHEEL_SIDE = ct(VERTICAL, "green_encased_cogwheel_side"),
            GREEN_ENCASED_COGWHEEL_OTHERSIDE = ct(HORIZONTAL, "green_encased_cogwheel_side");

    public static final CTSpriteShiftEntry LIME_CASING = ct(OMNIDIRECTIONAL, "lime_casing"),
            LIME_ENCASED_COGWHEEL_SIDE = ct(VERTICAL, "lime_encased_cogwheel_side"),
            LIME_ENCASED_COGWHEEL_OTHERSIDE = ct(HORIZONTAL, "lime_encased_cogwheel_side");

    public static final CTSpriteShiftEntry CYAN_CASING = ct(OMNIDIRECTIONAL, "cyan_casing"),
            CYAN_ENCASED_COGWHEEL_SIDE = ct(VERTICAL, "cyan_encased_cogwheel_side"),
            CYAN_ENCASED_COGWHEEL_OTHERSIDE = ct(HORIZONTAL, "cyan_encased_cogwheel_side");

    public static final CTSpriteShiftEntry BROWN_CASING = ct(OMNIDIRECTIONAL, "brown_casing"),
            BROWN_ENCASED_COGWHEEL_SIDE = ct(VERTICAL, "brown_encased_cogwheel_side"),
            BROWN_ENCASED_COGWHEEL_OTHERSIDE = ct(HORIZONTAL, "brown_encased_cogwheel_side");

    public static final CTSpriteShiftEntry BLUE_CASING = ct(OMNIDIRECTIONAL, "blue_casing"),
            BLUE_ENCASED_COGWHEEL_SIDE = ct(VERTICAL, "blue_encased_cogwheel_side"),
            BLUE_ENCASED_COGWHEEL_OTHERSIDE = ct(HORIZONTAL, "blue_encased_cogwheel_side");

    public static final CTSpriteShiftEntry ORANGE_CASING = ct(OMNIDIRECTIONAL, "orange_casing"),
            ORANGE_ENCASED_COGWHEEL_SIDE = ct(VERTICAL, "orange_encased_cogwheel_side"),
            ORANGE_ENCASED_COGWHEEL_OTHERSIDE = ct(HORIZONTAL, "orange_encased_cogwheel_side");

    public static final CTSpriteShiftEntry YELLOW_CASING = ct(OMNIDIRECTIONAL, "yellow_casing"),
            YELLOW_ENCASED_COGWHEEL_SIDE = ct(VERTICAL, "yellow_encased_cogwheel_side"),
            YELLOW_ENCASED_COGWHEEL_OTHERSIDE = ct(HORIZONTAL, "yellow_encased_cogwheel_side");

    public static final CTSpriteShiftEntry PINK_CASING = ct(OMNIDIRECTIONAL, "pink_casing"),
            PINK_ENCASED_COGWHEEL_SIDE = ct(VERTICAL, "pink_encased_cogwheel_side"),
            PINK_ENCASED_COGWHEEL_OTHERSIDE = ct(HORIZONTAL, "pink_encased_cogwheel_side");

    public static final CTSpriteShiftEntry MAGENTA_CASING = ct(OMNIDIRECTIONAL, "magenta_casing"),
            MAGENTA_ENCASED_COGWHEEL_SIDE = ct(VERTICAL, "magenta_encased_cogwheel_side"),
            MAGENTA_ENCASED_COGWHEEL_OTHERSIDE = ct(HORIZONTAL, "magenta_encased_cogwheel_side");

    public static final CTSpriteShiftEntry PURPLE_CASING = ct(OMNIDIRECTIONAL, "purple_casing"),
            PURPLE_ENCASED_COGWHEEL_SIDE = ct(VERTICAL, "purple_encased_cogwheel_side"),
            PURPLE_ENCASED_COGWHEEL_OTHERSIDE = ct(HORIZONTAL, "purple_encased_cogwheel_side");



    private static CTSpriteShiftEntry ct(AllCTTypes type, String name) {
        return CTSpriteShifter.getCT(type,
                CreateColoredCasing.asResource("block/" + name),
                CreateColoredCasing.asResource("block/" + name + "_connected"));
    }
}
