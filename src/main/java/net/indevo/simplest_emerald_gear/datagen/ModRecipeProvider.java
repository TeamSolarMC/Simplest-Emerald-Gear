package net.indevo.simplest_emerald_gear.datagen;

import net.indevo.simplest_emerald_gear.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> p_251297_) {

//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_SWORD.get())
//                .pattern("ABA")
//                .pattern("ACA")
//                .pattern(" C ")
//                .define('A', Items.IRON_INGOT)
//                .define('B', Items.IRON_BLOCK)
//                .define('C', Items.STICK)
//                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.IRON_INGOT).build()))
//                .unlockedBy("has_iron_block", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.IRON_BLOCK).build()))
//                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.STICK).build()))
//                .save(p_251297_);
    }
}
