package net.teamsolar.simplest_emerald_gear.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;
import net.neoforged.neoforge.common.Tags;

public class ModToolTiers {
    public static final ToolMaterial EMERALD_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            905,
            5.0F,
            1.5F,
            10,
            Tags.Items.GEMS_EMERALD
    );
}
