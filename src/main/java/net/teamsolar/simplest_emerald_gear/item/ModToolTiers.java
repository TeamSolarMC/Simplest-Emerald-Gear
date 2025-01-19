package net.teamsolar.simplest_emerald_gear.item;


import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.Tags;
import net.teamsolar.simplest_emerald_gear.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
/*
public class ModToolTiers {
    public static final Tier EMERALD = TierSortingRegistry.registerTier(
            new ForgeTier(2, 885, 7.0F, 2.5F, 12,
                    ModTags.Blocks.NEEDS_EMERALD_TOOL, () -> Ingredient.of(Items.EMERALD)),
            new ResourceLocation(SimplestEmeraldGear.MODID, "emerald"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
}
*/

public class ModToolTiers {
    public static final Tier EMERALD = new SimpleTier(
            ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL,
            // Durability
            905,
            // Mining speed
            5.0F,
            // Attack damage bonus
            1.5F,
            // Enchantability (see also ModArmorMaterials)
            10,
            () -> Ingredient.of(Tags.Items.GEMS_EMERALD)
    );
}