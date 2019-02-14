package com.github.atomicblom.elusivepickle;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

@SuppressWarnings("ALL")
@GameRegistry.ObjectHolder(ElusivePickleMod.MODID)
public class ItemLibrary
{
	public static final Item part_a;
	public static final Item part_b;
	public static final Item part_c;
	public static final Item part_d;

	public static final Item pickle;

	static {
		part_a = null;
		part_b = null;
		part_c = null;
		part_d = null;

		pickle = null;
	}


}
