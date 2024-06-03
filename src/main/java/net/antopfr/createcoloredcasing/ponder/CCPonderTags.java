package net.antopfr.createcoloredcasing.ponder;

import com.simibubi.create.foundation.ponder.PonderRegistry;
import net.antopfr.createcoloredcasing.registry.CCBlocks;

import static com.simibubi.create.infrastructure.ponder.AllPonderTags.DECORATION;

public class CCPonderTags {

    public static void register() {
        PonderRegistry.TAGS.forTag(DECORATION)
                .add(CCBlocks.BLACK_CASING)
                .add(CCBlocks.RED_CASING)
                .add(CCBlocks.GRAY_CASING)
                .add(CCBlocks.BLUE_CASING)
                .add(CCBlocks.LIGHT_BLUE_CASING)
                .add(CCBlocks.LIGHT_GRAY_CASING)
                .add(CCBlocks.WHITE_CASING)
                .add(CCBlocks.GREEN_CASING)
                .add(CCBlocks.LIME_CASING)
                .add(CCBlocks.MAGENTA_CASING)
                .add(CCBlocks.PURPLE_CASING)
                .add(CCBlocks.PINK_CASING)
                .add(CCBlocks.BROWN_CASING)
                .add(CCBlocks.YELLOW_CASING)
                .add(CCBlocks.ORANGE_CASING)
                .add(CCBlocks.CYAN_CASING);
    }
}
