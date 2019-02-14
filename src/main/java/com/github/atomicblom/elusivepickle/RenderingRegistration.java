package com.github.atomicblom.elusivepickle;


import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(Side.CLIENT)
public final class RenderingRegistration
{
	@SubscribeEvent
	public static void onRenderingReady(ModelRegistryEvent event) {
		setItemModel(ItemLibrary.part_a);
		setItemModel(ItemLibrary.part_b);
		setItemModel(ItemLibrary.part_c);
		setItemModel(ItemLibrary.part_d);
		setItemModel(ItemLibrary.pickle);
	}

	private static void setItemModel(Item item)
	{
		assert item.getRegistryName() != null;

		ModelLoader.setCustomModelResourceLocation(
				item,
				0,
				new ModelResourceLocation(item.getRegistryName(), "inventory")
		);
	}
}
