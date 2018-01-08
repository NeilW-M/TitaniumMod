package com.eppingforesters.titaniummod.init;

import java.util.ArrayList;
import java.util.List;

import com.eppingforesters.titaniummod.objects.items.ItemBase;

import net.minecraft.item.Item;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item INGOT_TITANIUM = new ItemBase("ingot_titanium");
	public static final Item INGOT_TUNGSTEN = new ItemBase("ingot_tungsten");
	
}
