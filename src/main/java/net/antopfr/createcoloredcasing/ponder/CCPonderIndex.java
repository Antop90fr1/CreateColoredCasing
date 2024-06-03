package net.antopfr.createcoloredcasing.ponder;

import com.simibubi.create.foundation.ponder.PonderRegistrationHelper;
import net.antopfr.createcoloredcasing.CreateColoredCasing;
import net.antopfr.createcoloredcasing.registry.CCBlocks;

public class CCPonderIndex {

    static final PonderRegistrationHelper HELPER = new PonderRegistrationHelper(CreateColoredCasing.MOD_ID);

    public static void register() {
        HELPER.forComponents(CCBlocks.BLACK_CASING, CCBlocks.RED_CASING, CCBlocks.GRAY_CASING, CCBlocks.BLUE_CASING, CCBlocks.LIGHT_BLUE_CASING, CCBlocks.LIGHT_GRAY_CASING, CCBlocks.WHITE_CASING, CCBlocks.GREEN_CASING, CCBlocks.LIME_CASING, CCBlocks.MAGENTA_CASING, CCBlocks.PURPLE_CASING, CCBlocks.PINK_CASING, CCBlocks.BROWN_CASING, CCBlocks.YELLOW_CASING, CCBlocks.ORANGE_CASING, CCBlocks.CYAN_CASING)
                .addStoryBoard("coloredencasing", ColoredCasingEncasingPonder::coloredCasingShaftEncasing)
                .addStoryBoard("coloredcogencasing", ColoredCasingEncasingPonder::coloredCasingCogEncasing);
    }
}
