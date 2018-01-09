package com.eppingforesters.titaniummod.objects.items;

import com.eppingforesters.titaniummod.Main;
import com.eppingforesters.titaniummod.init.ItemInit;
import com.eppingforesters.titaniummod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.TITANIUM_TAB);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
