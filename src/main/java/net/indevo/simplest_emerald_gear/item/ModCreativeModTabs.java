package net.indevo.simplest_emerald_gear.item;

import net.indevo.simplest_emerald_gear.SimplestEmeraldGear;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SimplestEmeraldGear.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SIMPLEST_EMERALD_GEAR_TAB = CREATIVE_MODE_TABS.register("simplest_emerald_gear_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EMERALD_PICKAXE.get()))  //TODO
                    .title(Component.translatable("creativetab.simplest_emerald_gear_tab"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.EMERALD_SWORD.get());
                        pOutput.accept(ModItems.EMERALD_PICKAXE.get());
                        pOutput.accept(ModItems.EMERALD_SHOVEL.get());
                        pOutput.accept(ModItems.EMERALD_AXE.get());
                        pOutput.accept(ModItems.EMERALD_HOE.get());

                        pOutput.accept(ModItems.EMERALD_HELMET.get());
                        pOutput.accept(ModItems.EMERALD_CHESTPLATE.get());
                        pOutput.accept(ModItems.EMERALD_LEGGINGS.get());
                        pOutput.accept(ModItems.EMERALD_BOOTS.get());
                    }))
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
