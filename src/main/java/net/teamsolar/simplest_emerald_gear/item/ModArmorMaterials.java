package net.teamsolar.simplest_emerald_gear.item;

import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Util;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import net.neoforged.neoforge.common.Tags;

import java.util.EnumMap;

public class ModArmorMaterials {
    public static final ResourceKey<EquipmentAsset> EMERALD_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath("examplemod", "copper"));

    public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new ArmorMaterial(
            15,
            Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 2);
                map.put(ArmorType.LEGGINGS, 4);
                map.put(ArmorType.CHESTPLATE, 6);
                map.put(ArmorType.HELMET, 2);
            }),
            20,
            SoundEvents.ARMOR_EQUIP_GENERIC,
            0,
            0,
            Tags.Items.GEMS_EMERALD,
            EMERALD_ASSET
    );
}
