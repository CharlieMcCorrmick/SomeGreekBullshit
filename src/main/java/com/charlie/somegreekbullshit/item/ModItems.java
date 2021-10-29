package com.charlie.somegreekbullshit.item;

import com.charlie.somegreekbullshit.SomeGreekBullshit;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SomeGreekBullshit.MOD_ID);

    public static final RegistryObject<Item> TEST = ITEMS.register("test",
            () -> new Item(new Item.Properties().group(ModItemGroup.SGB_GROUP)));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
