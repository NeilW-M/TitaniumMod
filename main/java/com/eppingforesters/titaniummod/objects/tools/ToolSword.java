package com.eppingforesters.titaniummod.objects.tools;

import com.eppingforesters.titaniummod.Main;
import com.eppingforesters.titaniummod.init.ItemInit;
import com.eppingforesters.titaniummod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {

	public ToolSword(String name, ToolMaterial material) {
		super(material);
		
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
