package net.teamsolar.simplest_emerald_gear.datagen;

import net.teamsolar.simplest_emerald_gear.SimplestEmeraldGear;
import net.teamsolar.simplest_emerald_gear.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                               CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, SimplestEmeraldGear.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.EMERALD_HELMET.get(),
                        ModItems.EMERALD_CHESTPLATE.get(),
                        ModItems.EMERALD_LEGGINGS.get(),
                        ModItems.EMERALD_BOOTS.get());
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
