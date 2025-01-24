package net.teamsolar.simplest_emerald_gear.datagen;

import net.teamsolar.simplest_emerald_gear.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> p_251297_) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" C ")
                .define('A', Items.EMERALD)
                .define('C', Items.STICK)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_PICKAXE.get())
                .pattern("AAA")
                .pattern(" C ")
                .pattern(" C ")
                .define('A', Items.EMERALD)
                .define('C', Items.STICK)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_SHOVEL.get())
                .pattern(" A ")
                .pattern(" C ")
                .pattern(" C ")
                .define('A', Items.EMERALD)
                .define('C', Items.STICK)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_AXE.get())
                .pattern("AA ")
                .pattern("AC ")
                .pattern(" C ")
                .define('A', Items.EMERALD)
                .define('C', Items.STICK)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_HOE.get())
                .pattern(" AA")
                .pattern(" C ")
                .pattern(" C ")
                .define('A', Items.EMERALD)
                .define('C', Items.STICK)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .define('A', Items.EMERALD)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.EMERALD)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.EMERALD)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_BOOTS.get())
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.EMERALD)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .save(p_251297_);
    }
}
