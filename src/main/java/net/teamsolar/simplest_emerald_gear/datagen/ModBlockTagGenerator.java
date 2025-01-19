package net.teamsolar.simplest_emerald_gear.datagen;

import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.teamsolar.simplest_emerald_gear.SimplestEmeraldGear;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.teamsolar.simplest_emerald_gear.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper ){
        super(output, lookupProvider, SimplestEmeraldGear.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider){
        // make emerald tools only able to mine blocks that iron tools can also mine
        this.tag(ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL).addTag(BlockTags.INCORRECT_FOR_IRON_TOOL);
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}