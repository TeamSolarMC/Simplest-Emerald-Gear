package net.teamsolar.simplest_emerald_gear.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.teamsolar.simplest_emerald_gear.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" C ")
                .define('A', Items.EMERALD)
                .define('C', Items.STICK)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_PICKAXE.get())
                .pattern("AAA")
                .pattern(" C ")
                .pattern(" C ")
                .define('A', Items.EMERALD)
                .define('C', Items.STICK)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_SHOVEL.get())
                .pattern(" A ")
                .pattern(" C ")
                .pattern(" C ")
                .define('A', Items.EMERALD)
                .define('C', Items.STICK)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_AXE.get())
                .pattern("AA ")
                .pattern("AC ")
                .pattern(" C ")
                .define('A', Items.EMERALD)
                .define('C', Items.STICK)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_HOE.get())
                .pattern("AA")
                .pattern(" C")
                .pattern(" C")
                .define('A', Items.EMERALD)
                .define('C', Items.STICK)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .define('A', Items.EMERALD)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.EMERALD)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.EMERALD)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_BOOTS.get())
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.EMERALD)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .save(output);
    }
}
