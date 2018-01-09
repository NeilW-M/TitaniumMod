package com.eppingforesters.titaniummod.tabs;

import com.eppingforesters.titaniummod.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TitaniumTab extends CreativeTabs {

	public TitaniumTab(String label) { super("titaniumtab");
	this.setBackgroundImageName("titaniumbackground.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.PICKAXE_TITANIUM);}
	
}
