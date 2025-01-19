package net.teamsolar.simplest_emerald_gear.datagen;

import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.teamsolar.simplest_emerald_gear.SimplestEmeraldGear;
import net.teamsolar.simplest_emerald_gear.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                               CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, SimplestEmeraldGear.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(
                        ModItems.EMERALD_HELMET.get(),
                        ModItems.EMERALD_CHESTPLATE.get(),
                        ModItems.EMERALD_LEGGINGS.get(),
                        ModItems.EMERALD_BOOTS.get()
                );
        this.tag(ItemTags.SWORDS)
                .add(ModItems.EMERALD_SWORD.get());
        this.tag(ItemTags.PICKAXES)
                .add(ModItems.EMERALD_PICKAXE.get());
        this.tag(ItemTags.SHOVELS)
                .add(ModItems.EMERALD_SHOVEL.get());
        this.tag(ItemTags.AXES)
                .add(ModItems.EMERALD_AXE.get());
        this.tag(ItemTags.HOES)
                .add(ModItems.EMERALD_HOE.get());
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
