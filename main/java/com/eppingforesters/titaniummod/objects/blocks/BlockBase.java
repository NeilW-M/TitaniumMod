package com.eppingforesters.titaniummod.objects.blocks;

import com.eppingforesters.titaniummod.Main;
import com.eppingforesters.titaniummod.init.BlockInit;
import com.eppingforesters.titaniummod.init.ItemInit;
import com.eppingforesters.titaniummod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.TITANIUM_TAB);
		
		setHardness(2.0F);

		BlockInit.BLOCKS.add(this);

		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}