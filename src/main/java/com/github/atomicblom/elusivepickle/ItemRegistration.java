package com.github.atomicblom.elusivepickle;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public final class ItemRegistration
{
	@SubscribeEvent
	public static void onRegisterItems(Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();

		final MyCreativeTab modCreativeTab = new MyCreativeTab();

		final Item pickle = new Item()
				.setRegistryName(new ResourceLocation(ElusivePickleMod.MODID, "pickle"))
				.setTranslationKey(ElusivePickleMod.MODID + ':' + "pickle")
				.setCreativeTab(modCreativeTab);
		final Item partA = new Item()
				.setRegistryName(new ResourceLocation(ElusivePickleMod.MODID, "part_a"))
				.setTranslationKey(ElusivePickleMod.MODID + ':' + "part_a")
				.setCreativeTab(modCreativeTab);
		final Item partB = new Item()
				.setRegistryName(new ResourceLocation(ElusivePickleMod.MODID, "part_b"))
				.setTranslationKey(ElusivePickleMod.MODID + ':' + "part_b")
				.setCreativeTab(modCreativeTab);
		final Item partC = new Item()
				.setRegistryName(new ResourceLocation(ElusivePickleMod.MODID, "part_c"))
				.setTranslationKey(ElusivePickleMod.MODID + ':' + "part_c")
				.setCreativeTab(modCreativeTab);
		final Item partD = new Item()
				.setRegistryName(new ResourceLocation(ElusivePickleMod.MODID, "part_d"))
				.setTranslationKey(ElusivePickleMod.MODID + ':' + "part_d")
				.setCreativeTab(modCreativeTab);

		registry.register(pickle);
		registry.register(partA);
		registry.register(partB);
		registry.register(partC);
		registry.register(partD);
	}

	private static class MyCreativeTab extends CreativeTabs
	{
		private ItemStack _itemStack = null;

		MyCreativeTab()
		{
			super(ElusivePickleMod.MODID);
		}

		@Override
		public ItemStack createIcon()
		{
			if (_itemStack == null) {
				_itemStack = new ItemStack(ItemLibrary.pickle);
			}

			return _itemStack;
		}
	}
}
