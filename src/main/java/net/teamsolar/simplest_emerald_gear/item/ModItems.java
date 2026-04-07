package net.teamsolar.simplest_emerald_gear.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.teamsolar.simplest_emerald_gear.SimplestEmeraldGear;

import static net.teamsolar.simplest_emerald_gear.item.ModArmorMaterials.EMERALD_ARMOR_MATERIAL;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(SimplestEmeraldGear.MODID);

    // Tools
    public static final DeferredItem<Item> EMERALD_SWORD = ITEMS.registerItem(
            "emerald_sword",
            props -> new Item(props.sword(ModToolTiers.EMERALD_MATERIAL, 4, -2.4F))
    );

    public static final DeferredItem<Item> EMERALD_PICKAXE = ITEMS.registerItem(
            "emerald_pickaxe",
            props -> new Item(props.pickaxe(ModToolTiers.EMERALD_MATERIAL, 2, -2.0F))
    );

    public static final DeferredItem<Item> EMERALD_SHOVEL = ITEMS.registerItem(
            "emerald_shovel",
            props -> new Item(props.shovel(ModToolTiers.EMERALD_MATERIAL, 2.5F, -3.0F))
    );

    public static final DeferredItem<Item> EMERALD_AXE = ITEMS.registerItem(
            "emerald_axe",
            props -> new Item(props.axe(ModToolTiers.EMERALD_MATERIAL, 6.5F, -3.05F))
    );

    public static final DeferredItem<Item> EMERALD_HOE = ITEMS.registerItem(
            "emerald_hoe",
            props -> new Item(props.hoe(ModToolTiers.EMERALD_MATERIAL, -1.5F, -0.5F))
    );

    // Armor
    public static final DeferredItem<Item> EMERALD_HELMET = ITEMS.registerItem(
            "emerald_helmet",
            props -> new Item(props.humanoidArmor(EMERALD_ARMOR_MATERIAL, ArmorType.HELMET))
    );

    public static final DeferredItem<Item> EMERALD_CHESTPLATE = ITEMS.registerItem(
            "emerald_chestplate",
            props -> new Item(props.humanoidArmor(EMERALD_ARMOR_MATERIAL, ArmorType.CHESTPLATE))
    );

    public static final DeferredItem<Item> EMERALD_LEGGINGS = ITEMS.registerItem(
            "emerald_leggings",
            props -> new Item(props.humanoidArmor(EMERALD_ARMOR_MATERIAL, ArmorType.LEGGINGS))
    );

    public static final DeferredItem<Item> EMERALD_BOOTS = ITEMS.registerItem(
            "emerald_boots",
            props -> new Item(props.humanoidArmor(EMERALD_ARMOR_MATERIAL, ArmorType.BOOTS))
    );
}
